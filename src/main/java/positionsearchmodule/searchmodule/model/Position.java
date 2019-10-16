package positionsearchmodule.searchmodule.model;

public class Position {
    private Integer pid;

    private String pname;

    private String pinfo;

    private Integer posid;

    private Integer mcid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPinfo() {
        return pinfo;
    }

    public void setPinfo(String pinfo) {
        this.pinfo = pinfo;
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public Integer getMcid() {
        return mcid;
    }

    public void setMcid(Integer mcid) {
        this.mcid = mcid;
    }

    @Override
    public String toString() {
        return "职位号：" + pid+"<br><br>" +"职位名：" + pname+"<br><br>" + "职位信息：" + pinfo+"<br><br>";
    }
}