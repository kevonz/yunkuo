package com.yunkuo.cms.controller;

import com.yunkuo.cms.model.CategoryDO;
import com.yunkuo.cms.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-11-30
 * Time: 下午11:09
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

/*    @Resource(name = "categoryService")
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET,value = "list")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        List<CategoryDO> result = this.categoryService.find();
        return new ModelAndView("category","categoryList", result);
    }

    @RequestMapping(method = RequestMethod.GET,value = "list1")
    public ModelAndView list1(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<CategoryDO> result = this.categoryService.find();
        map.put("categoryList", result);
        return new ModelAndView("category/list", map);
    }*/

}
