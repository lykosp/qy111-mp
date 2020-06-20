package com.aaa.qy111mp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-11
 */
public class Course extends Model<Course> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;
    private String cname;
    private Double cscore;
    private Integer cteacher;
    private Integer crid;
    private String cdate;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getCscore() {
        return cscore;
    }

    public void setCscore(Double cscore) {
        this.cscore = cscore;
    }

    public Integer getCteacher() {
        return cteacher;
    }

    public void setCteacher(Integer cteacher) {
        this.cteacher = cteacher;
    }

    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

    @Override
    public String toString() {
        return "Course{" +
        "cid=" + cid +
        ", cname=" + cname +
        ", cscore=" + cscore +
        ", cteacher=" + cteacher +
        ", crid=" + crid +
        ", cdate=" + cdate +
        "}";
    }
}
