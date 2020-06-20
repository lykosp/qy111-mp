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
public class Croom extends Model<Croom> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "crid", type = IdType.AUTO)
    private Integer crid;
    private String crname;
    private Integer crmaxnum;


    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public String getCrname() {
        return crname;
    }

    public void setCrname(String crname) {
        this.crname = crname;
    }

    public Integer getCrmaxnum() {
        return crmaxnum;
    }

    public void setCrmaxnum(Integer crmaxnum) {
        this.crmaxnum = crmaxnum;
    }

    @Override
    protected Serializable pkVal() {
        return this.crid;
    }

    @Override
    public String toString() {
        return "Croom{" +
        "crid=" + crid +
        ", crname=" + crname +
        ", crmaxnum=" + crmaxnum +
        "}";
    }
}
