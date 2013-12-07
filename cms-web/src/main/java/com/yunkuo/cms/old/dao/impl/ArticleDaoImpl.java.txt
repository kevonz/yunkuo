package com.yunkuo.cms.dao.impl;

import com.yunkuo.cms.dao.ArticleDao;
import com.yunkuo.cms.model.Article;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午10:57
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ArticleDaoImpl<T extends Article> implements ArticleDao<T> {
    @Inject
    private com.yunkuo.cms.mapper.ArticleMapper mapper;

    @Override
    public List<T> getList() throws DataAccessException {
        return (List<T>) mapper.getAllArticle();
    }

    @Override
    public T getArticle(Integer id) throws DataAccessException {
        T entity = null;
        try {
            entity = (T) mapper.getArticleById(String.valueOf(id));
        } catch (DataAccessException e) {
            throw e;
        }
        return entity;
    }
}
