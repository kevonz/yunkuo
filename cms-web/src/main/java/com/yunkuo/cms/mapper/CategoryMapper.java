package com.yunkuo.cms.mapper;

import com.yunkuo.cms.model.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-11-30
 * Time: 下午10:54
 * To change this template use File | Settings | File Templates.
 */
@Repository(value = "categoryMapper")
public interface CategoryMapper {
    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name") })
    java.util.List<Category> operateReturnBeans(@Param(value = "sql") String sql);
}
