package com.yunkuo.cms.dao.impl;

import com.yunkuo.cms.common.dal.BaseDaoImpl;
import com.yunkuo.cms.dao.ArticleDao;
import com.yunkuo.cms.model.ArticleDO;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;



/**
 * Created by kevon on 13-12-7.
 */
@Repository("articleDao")
public class ArticleDaoImpl<T extends ArticleDO> extends BaseDaoImpl<ArticleDO> implements ArticleDao<T> {
/*
    @Override
    public int deleteByPK(Integer id) {
        return 0;
    }

    @Override
    public int add(ArticleDO record) {
        return 0;
    }

    @Override
    public int insertSelective(ArticleDO record) {
        return 0;
    }

    @Override
    public ArticleDO queryByPK(Integer id) {
        return null;
    }

    @Override
    public int update(ArticleDO record) {
        return 0;
    }

    @Override
    public int updateByPK(ArticleDO record) {
        return 0;
    }*/

   /* @Override
    public List<ArticleDO> getList() {
        //return (List<T>) mapper.getAllArticle();
        return getSqlSession().selectList("ArticleDO.queryAll");
    }

    @Override
    public T getArticle(Integer id) throws DataAccessException {
        *//*T entity = null;
        try {
            entity = (T) mapper.getArticleById(String.valueOf(id));
        } catch (DataAccessException e) {
            throw e;
        }
        return entity;*//*
        return null;
    }*/
}
