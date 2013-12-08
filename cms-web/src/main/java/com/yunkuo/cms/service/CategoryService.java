package com.yunkuo.cms.service;

//import com.yunkuo.cms.model.Category;

import com.yunkuo.cms.model.CategoryDO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-11-30
 * Time: 下午11:00
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryService {

    List<CategoryDO> getList();
}
