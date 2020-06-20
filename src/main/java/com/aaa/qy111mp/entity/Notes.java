package com.aaa.qy111mp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-11
 */
public class Notes extends Model<Notes> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nid", type = IdType.AUTO)
    private Integer nid;
    private String title;
    @TableField("start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS")
    private Date startTime;
    @TableField("stop_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS")
    private Date stopTime;
    private String ndesc;


    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public String getNdesc() {
        return ndesc;
    }

    public void setNdesc(String ndesc) {
        this.ndesc = ndesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.nid;
    }

    @Override
    public String toString() {
        return "Notes{" +
        "nid=" + nid +
        ", title=" + title +
        ", startTime=" + startTime +
        ", stopTime=" + stopTime +
        ", ndesc=" + ndesc +
        "}";
    }
}
