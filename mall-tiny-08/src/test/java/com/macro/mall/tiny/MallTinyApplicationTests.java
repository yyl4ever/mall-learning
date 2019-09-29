package com.macro.mall.tiny;

import com.macro.mall.tiny.dao.EsProductDao;
import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

	@Test
	public void contextLoads() {
	}
   /* @Autowired
    private EsProductDao productDao;

    @Test
    public void testSelectOneToMany() {
        List<EsProduct> esProductList = productDao.getAllEsProductList(null);
        System.out.println(esProductList.size());
    }*/
}
