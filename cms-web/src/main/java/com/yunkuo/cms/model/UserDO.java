package com.yunkuo.cms.model;

import java.util.Date;

public class UserDO {
    private Integer id;

    private Integer roleId;

    private String username;

    private String email;

    private String password;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Integer loginCount;

    private Integer status;

    private Date registerTime;

    private String registerIp;

    private String resetKey;

    private String resetPwd;

    private Integer activation;

    private String activationCode;

    private Date errorTime;

    private Integer errorCount;

    private String errorIp;

    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column yk_user.id
     *
     * @param id the value for yk_user.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method sets the value of the database column yk_user.role_id
     *
     * @param roleId the value for yk_user.role_id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    /**
     * This method sets the value of the database column yk_user.username
     *
     * @param username the value for yk_user.username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    /**
     * This method sets the value of the database column yk_user.email
     *
     * @param email the value for yk_user.email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    /**
     * This method sets the value of the database column yk_user.password
     *
     * @param password the value for yk_user.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method sets the value of the database column yk_user.last_login_time
     *
     * @param lastLoginTime the value for yk_user.last_login_time
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method sets the value of the database column yk_user.last_login_ip
     *
     * @param lastLoginIp the value for yk_user.last_login_ip
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method sets the value of the database column yk_user.login_count
     *
     * @param loginCount the value for yk_user.login_count
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column yk_user.status
     *
     * @param status the value for yk_user.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method sets the value of the database column yk_user.register_time
     *
     * @param registerTime the value for yk_user.register_time
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * This method sets the value of the database column yk_user.register_ip
     *
     * @param registerIp the value for yk_user.register_ip
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public String getResetKey() {
        return resetKey;
    }

    /**
     * This method sets the value of the database column yk_user.reset_key
     *
     * @param resetKey the value for yk_user.reset_key
     */
    public void setResetKey(String resetKey) {
        this.resetKey = resetKey == null ? null : resetKey.trim();
    }

    public String getResetPwd() {
        return resetPwd;
    }

    /**
     * This method sets the value of the database column yk_user.reset_pwd
     *
     * @param resetPwd the value for yk_user.reset_pwd
     */
    public void setResetPwd(String resetPwd) {
        this.resetPwd = resetPwd == null ? null : resetPwd.trim();
    }

    public Integer getActivation() {
        return activation;
    }

    /**
     * This method sets the value of the database column yk_user.activation
     *
     * @param activation the value for yk_user.activation
     */
    public void setActivation(Integer activation) {
        this.activation = activation;
    }

    public String getActivationCode() {
        return activationCode;
    }

    /**
     * This method sets the value of the database column yk_user.activation_code
     *
     * @param activationCode the value for yk_user.activation_code
     */
    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode == null ? null : activationCode.trim();
    }

    public Date getErrorTime() {
        return errorTime;
    }

    /**
     * This method sets the value of the database column yk_user.error_time
     *
     * @param errorTime the value for yk_user.error_time
     */
    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * This method sets the value of the database column yk_user.error_count
     *
     * @param errorCount the value for yk_user.error_count
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getErrorIp() {
        return errorIp;
    }

    /**
     * This method sets the value of the database column yk_user.error_ip
     *
     * @param errorIp the value for yk_user.error_ip
     */
    public void setErrorIp(String errorIp) {
        this.errorIp = errorIp == null ? null : errorIp.trim();
    }
}