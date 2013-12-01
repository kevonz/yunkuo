package com.yunkuo.cms.service.impl;

import com.yunkuo.cms.dao.ArticleDao;
import com.yunkuo.cms.model.Article;
import com.yunkuo.cms.service.ArticleService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午11:11
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ArticleServiceImpl<T extends Article> implements ArticleService {
    @Inject
    private ArticleDao<T> dao;
    @Override
    public List getList() throws DataAccessException {
        return dao.getList();
    }

    @Override
    public T getArticle(Integer id) throws DataAccessException {
        return dao.getArticle(id);
    }
}
