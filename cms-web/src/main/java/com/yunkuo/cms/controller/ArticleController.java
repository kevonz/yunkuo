package com.yunkuo.cms.controller;

//import com.yunkuo.cms.model.ArticleDO;
import com.yunkuo.cms.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-1
 * Time: 下午11:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET,value = "list")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("article/list","articleList", articleService.getList());
    }

    @RequestMapping(method = RequestMethod.GET,value = "list1")
    public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute(articleService.getList());//articleDOList
        return "article/list1";
    }
}
