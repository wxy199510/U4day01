package cn.kgc.demo.pojo;

import java.util.Date;

public class History {
    private Integer hid;

    private Date hstarttime;

    private Date hendtime;

    private String hcity;

    private String hwork;

    private Integer eid;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Date getHstarttime() {
        return hstarttime;
    }

    public void setHstarttime(Date hstarttime) {
        this.hstarttime = hstarttime;
    }

    public Date getHendtime() {
        return hendtime;
    }

    public void setHendtime(Date hendtime) {
        this.hendtime = hendtime;
    }

    public String getHcity() {
        return hcity;
    }

    public void setHcity(String hcity) {
        this.hcity = hcity == null ? null : hcity.trim();
    }

    public String getHwork() {
        return hwork;
    }

    public void setHwork(String hwork) {
        this.hwork = hwork == null ? null : hwork.trim();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

}