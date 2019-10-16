package positionsearchmodule.searchmodule.model;

public class Condition {
    private Integer posid;

    private String postype;

    private String postreatment;

    private String poslevel;

    private String posexperience;

    private String poswelfare;

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public String getPostype() {
        return postype;
    }

    public void setPostype(String postype) {
        this.postype = postype;
    }

    public String getPostreatment() {
        return postreatment;
    }

    public void setPostreatment(String postreatment) {
        this.postreatment = postreatment;
    }

    public String getPoslevel() {
        return poslevel;
    }

    public void setPoslevel(String poslevel) {
        this.poslevel = poslevel;
    }

    public String getPosexperience() {
        return posexperience;
    }

    public void setPosexperience(String posexperience) {
        this.posexperience = posexperience;
    }

    public String getPoswelfare() {
        return poswelfare;
    }

    public void setPoswelfare(String poswelfare) {
        this.poswelfare = poswelfare;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "posid=" + posid +
                ", postype='" + postype + '\'' +
                ", postreatment='" + postreatment + '\'' +
                ", poslevel='" + poslevel + '\'' +
                ", posexperience='" + posexperience + '\'' +
                ", poswelfare='" + poswelfare + '\'' +
                '}';
    }
}