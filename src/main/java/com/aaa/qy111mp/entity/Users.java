package com.aaa.qy111mp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
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
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    @TableField("school_num")
    private String schoolNum;
    private String name;
    private String grade;
    private String school;
    private String major;
    private String email;
    private String password;
    private Integer role;
    private String sex;
    private String qq;
    private String phone;
    private String adress;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(String schoolNum) {
        this.schoolNum = schoolNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    @Override
    public String toString() {
        return "Users{" +
        "uid=" + uid +
        ", schoolNum=" + schoolNum +
        ", name=" + name +
        ", grade=" + grade +
        ", school=" + school +
        ", major=" + major +
        ", email=" + email +
        ", password=" + password +
        ", role=" + role +
        ", sex=" + sex +
        ", qq=" + qq +
        ", phone=" + phone +
        ", adress=" + adress +
        "}";
    }
}
