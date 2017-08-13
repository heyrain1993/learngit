package com.hicetech.ucenter.model;

public class PortraitPo {
    private Long id;

    private Long createtime;

    private String portrait;

    public PortraitPo(Long id, Long createtime, String portrait) {
        this.id = id;
        this.createtime = createtime;
        this.portrait = portrait;
    }

    public PortraitPo() {
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

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }
}