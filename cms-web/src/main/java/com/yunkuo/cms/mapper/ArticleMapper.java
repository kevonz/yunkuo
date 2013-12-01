package com.yunkuo.cms.mapper;

import com.yunkuo.cms.model.Article;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午10:41
 * To change this template use File | Settings | File Templates.
 */
public interface ArticleMapper extends SqlMapper {
    public List<Article> getAllArticle();

    public Article getArticleById(String id);
}
