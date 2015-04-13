package com.zhuc.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class UserLogin extends UserLoginKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.login_date
     *
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
     */
    private Date loginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login.login_ip
     *
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login
     *
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login.login_date
     *
     * @return the value of user_login.login_date
     *
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
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
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
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
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
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
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Mon Apr 13 09:26:33 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginDate=").append(loginDate);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}