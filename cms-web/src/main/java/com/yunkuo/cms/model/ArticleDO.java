package com.yunkuo.cms.model;

import java.util.Date;

public class ArticleDO {
    private Integer id;

    private Integer categoryId;

    private String title;

    private Integer userId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column c_article.id
     *
     * @param id the value for c_article.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method sets the value of the database column c_article.category_id
     *
     * @param categoryId the value for c_article.category_id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    /**
     * This method sets the value of the database column c_article.title
     *
     * @param title the value for c_article.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column c_article.user_id
     *
     * @param userId the value for c_article.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column c_article.create_time
     *
     * @param createTime the value for c_article.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}