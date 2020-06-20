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
public class Ucourse extends Model<Ucourse> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ucid", type = IdType.AUTO)
    private Integer ucid;
    private Integer uid;
    private Integer cid;


    public Integer getUcid() {
        return ucid;
    }

    public void setUcid(Integer ucid) {
        this.ucid = ucid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    protected Serializable pkVal() {
        return this.ucid;
    }

    @Override
    public String toString() {
        return "Ucourse{" +
        "ucid=" + ucid +
        ", uid=" + uid +
        ", cid=" + cid +
        "}";
    }
}
