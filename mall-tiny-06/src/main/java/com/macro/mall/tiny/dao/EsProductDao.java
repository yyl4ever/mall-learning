package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * @Author: yangyl
 * @Date: 2019/9/5 13:47
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
