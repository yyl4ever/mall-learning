package com.macro.mall.tiny.nosql.elasticsearch.repository;

import com.macro.mall.tiny.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 商品ES操作类
 * @Author: yangyl
 * @Date: 2019/9/5 13:20
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    /**
     * 搜索查询
     * @param name 商品名称
     * @param subTitle 商品标题
     * @param keywords 商品关键字
     * @param page 分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);

    /**
     * 使用DSL语句进行查询
     * @param name
     * @param pageable
     * @return
     */
    @Query("{\"bool\":{\"must\":{\"field\":{\"name\":\"?0\"}}}}")
    Page<EsProduct> findByName(String name, Pageable pageable);
}
