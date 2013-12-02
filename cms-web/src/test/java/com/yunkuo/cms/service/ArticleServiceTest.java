package com.yunkuo.cms.service;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: Jin
 * Date: 13-12-2
 * Time: 下午2:11
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:cms-servlet.xml" })
public class ArticleServiceTest extends TestCase {

    private final static Logger logger = Logger.getLogger(ArticleServiceTest.class);

    @Autowired
    ArticleService articleService;

   /* @Before
    public void setUp() throws Exception {

    }
*/
    @Test
    public void testGetList() throws Exception {
        logger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        logger.info(articleService.getList());
    }

    @Test
    public void testGetArticle() throws Exception {

    }
}
