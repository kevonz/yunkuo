package com.yunkuo.cms.service.impl;

//import com.yunkuo.cms.mapper.CategoryMapper;
//import com.yunkuo.cms.model.Category;
import com.yunkuo.cms.model.CategoryDO;
import com.yunkuo.cms.service.CategoryService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-11-30
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
@Repository(value = "categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

    //@Resource(name = "categoryMapper")
    //private CategoryMapper categoryMapper;

/*    @Override
    public List<CategoryDO> find() {
       String sql = "select * from c_category";
        return this.categoryMapper.operateReturnBeans(sql);
        return null;
    }*/
}
