package com.yunkuo.cms.dao;

import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午10:54
 * To change this template use File | Settings | File Templates.
 */
public interface ArticleDao<T> {

    public List<T> getList() throws DataAccessException;
    public T getArticle(Integer id) throws DataAccessException;
    //public boolean addArticle(T entity) throws DataAccessException;
}
