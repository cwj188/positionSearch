package positionsearchmodule.searchmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import positionsearchmodule.searchmodule.model.Applicant;
import positionsearchmodule.searchmodule.service.AdviceService;

import java.util.Map;

@Controller
public class AdviceController {
    @Autowired
    private AdviceService adviceService;

    @GetMapping("/socket")
    public String jumpSocket(){
        return "adviceOnline";
    }

    @PostMapping("/advice")
    public String declareOption(@RequestParam("applicantInfo") Applicant applicant, @RequestParam("adviceMsg") String adviceMsg, Map<String,Object> map){
        boolean sendResult= adviceService.sendAdviceMsg(applicant,adviceMsg);
        if (sendResult==true){
            map.put("sendSuccess","建议发送成功");
            return "advice";
        }else {
            map.put("sendDefeat","建议发送失败");
            return "advice";
        }
    }
}
