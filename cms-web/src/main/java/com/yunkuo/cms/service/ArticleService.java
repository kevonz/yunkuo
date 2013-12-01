package com.yunkuo.cms.service;

import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午11:10
 * To change this template use File | Settings | File Templates.
 */
public interface ArticleService<T> {

    public List<T> getList() throws DataAccessException;

    public T getArticle(Integer id) throws DataAccessException;

}
