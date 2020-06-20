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
public class Score extends Model<Score> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;
    private Integer ucid;
    private Double pscore;
    private Double qscore;
    private Double zscore;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUcid() {
        return ucid;
    }

    public void setUcid(Integer ucid) {
        this.ucid = ucid;
    }

    public Double getPscore() {
        return pscore;
    }

    public void setPscore(Double pscore) {
        this.pscore = pscore;
    }

    public Double getQscore() {
        return qscore;
    }

    public void setQscore(Double qscore) {
        this.qscore = qscore;
    }

    public Double getZscore() {
        return zscore;
    }

    public void setZscore(Double zscore) {
        this.zscore = zscore;
    }

    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

    @Override
    public String toString() {
        return "Score{" +
        "sid=" + sid +
        ", ucid=" + ucid +
        ", pscore=" + pscore +
        ", qscore=" + qscore +
        ", zscore=" + zscore +
        "}";
    }
}
