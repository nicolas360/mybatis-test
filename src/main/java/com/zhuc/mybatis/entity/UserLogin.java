package com.zhuc.mybatis.entity;

import java.util.Date;

public class UserLogin extends UserLoginKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.login_date
     *
     * @mbggenerated Thu Mar 19 16:02:08 CST 2015
     */
    private Date loginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.login_ip
     *
     * @mbggenerated Thu Mar 19 16:02:08 CST 2015
     */
    private String loginIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.login_date
     *
     * @return the value of user_login.login_date
     *
     * @mbggenerated Thu Mar 19 16:02:08 CST 2015
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.login_date
     *
     * @param loginDate the value for user_login.login_date
     *
     * @mbggenerated Thu Mar 19 16:02:08 CST 2015
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.login_ip
     *
     * @return the value of user_login.login_ip
     *
     * @mbggenerated Thu Mar 19 16:02:08 CST 2015
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login.login_ip
     *
     * @param loginIp the value for user_login.login_ip
     *
     * @mbggenerated Thu Mar 19 16:02:08 CST 2015
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}