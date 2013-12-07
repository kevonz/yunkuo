package com.yunkuo.cms.model;

public class CategoryDO {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column c_category.id
     *
     * @param id the value for c_category.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column c_category.name
     *
     * @param name the value for c_category.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}