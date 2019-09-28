package positionsearchmodule.searchmodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
@Slf4j
public class UpDownController {
    @PostMapping("/upload")
    @ResponseBody
    public String upLoadFile(@RequestParam("upfile")MultipartFile upfile, HttpServletRequest request){
        if (upfile.isEmpty()){
            return "<p>上传失败，请选择文件</p><a href=\"http://localhost:8080/backPosition\">点击返回职位详情页</a>";
        }
        String fileName=upfile.getOriginalFilename();
        String filePath=request.getSession().getServletContext().getRealPath("/files/");
        log.info("上传的文件："+filePath+fileName);
        File dest=new File(filePath+fileName);
        if (!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        try {
            upfile.transferTo(dest);
            log.info("上传成功");
            return "<p>上传成功<p><a href=\"http://localhost:8080/backPosition?filename='"+fileName+"'\">点击返回职位详情页</a>";
        } catch (IOException e) {
            log.error(e.toString(),e);
            e.printStackTrace();
        }
        return "<p>上传失败<p><a href=\"http://localhost:8080/backPosition\">点击返回职位详情页</a>";
    }

    @RequestMapping("backPosition")
    public String backPositionPage(){
        return "showPosition";
    }

    @RequestMapping("download")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response){
        String fakefileName = request.getParameter("filename");
        String fileName=fakefileName.replaceAll("'","").trim().toString();
        if (fileName != null) {
            //当前是从该工程的WEB-INF//File//下获取文件(该目录可以在下面一行代码配置)然后下载到C:\\users\\downloads即本机的默认下载的目录
            String realPath = request.getSession().getServletContext().getRealPath("/files/");
            File file = new File(realPath, fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" +  fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("下载成功");
                    log.info("下载地址："+realPath);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

