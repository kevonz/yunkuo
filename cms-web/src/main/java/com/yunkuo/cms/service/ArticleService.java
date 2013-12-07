package com.yunkuo.cms.service;

import com.yunkuo.cms.model.ArticleDO;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午11:10
 * To change this template use File | Settings | File Templates.
 */
public interface ArticleService {

    public List<ArticleDO> getList() throws DataAccessException;

    public ArticleDO getArticle(Integer id) throws DataAccessException;

}
