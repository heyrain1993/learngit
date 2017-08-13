package com.hicetech.ucenter.model;

public class JPushPo {
    private Long id;

    private Long createtime;

    private String jpalias;

    private String jptags;

    private String jpgroup;

    private String jpregistrationid;

    private Long userId;

    public JPushPo(Long id, Long createtime, String jpalias, String jptags, String jpgroup, String jpregistrationid, Long userId) {
        this.id = id;
        this.createtime = createtime;
        this.jpalias = jpalias;
        this.jptags = jptags;
        this.jpgroup = jpgroup;
        this.jpregistrationid = jpregistrationid;
        this.userId = userId;
    }

    public JPushPo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public String getJpalias() {
        return jpalias;
    }

    public void setJpalias(String jpalias) {
        this.jpalias = jpalias == null ? null : jpalias.trim();
    }

    public String getJptags() {
        return jptags;
    }

    public void setJptags(String jptags) {
        this.jptags = jptags == null ? null : jptags.trim();
    }

    public String getJpgroup() {
        return jpgroup;
    }

    public void setJpgroup(String jpgroup) {
        this.jpgroup = jpgroup == null ? null : jpgroup.trim();
    }

    public String getJpregistrationid() {
        return jpregistrationid;
    }

    public void setJpregistrationid(String jpregistrationid) {
        this.jpregistrationid = jpregistrationid == null ? null : jpregistrationid.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}