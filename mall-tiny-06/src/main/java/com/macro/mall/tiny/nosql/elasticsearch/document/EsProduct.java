package com.macro.mall.tiny.nosql.elasticsearch.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 搜索中的商品信息
 *
 * @Author: yangyl
 * @Date: 2019/9/5 11:12
 */
// Document 标示映射到Elasticsearch文档上的领域对象
// indexName 索引库名次，mysql中数据库的概念
// product 文档类型，mysql中表的概念   
// shards 默认分片数    
// replicas 默认副本数量    
@Document(indexName = "pms", type = "product", shards = 1, replicas = 0)
public class EsProduct implements Serializable {
    private static final long serialVersionUID = -1L;

    /**
     * 表示是文档的id，文档可以认为是mysql中表行的概念
     */
    @Id
    private Long id;

    /**
     * 货号
     * type 文档中字段的类型,Text:会进行分词并建了索引的字符类型,Nested:嵌套对象类型, Auto:自动判断字段类型,Keyword : 不会进行分词建立索引的类型
     * index 是否建立倒排索引
     * store 是否进行存储
     * analyzer 分词器名次
     * 不需要中文分词的字段设置成@Field(type = FieldType.Keyword)类型
     * 需要中文分词的设置成@Field(analyzer = "ik_max_word",type = FieldType.Text)类型
     */
    @Field(type = FieldType.Keyword)
    private String productSn;
    private Long brandId;

    @Field(type = FieldType.Keyword)
    private String brandName;
    private Long productCategoryId;
    @Field(type = FieldType.Keyword)
    private String productCategoryName;
    private String pic;
    
    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    private String name;
    /**
     * 副标题
     */
    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    private String subTitle;
    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    private String keywords;
    private BigDecimal price;
    /**
     * 销量
     */
    private Integer sale;
    /**
     * 新品状态:0->不是新品；1->新品
     */
    private Integer newStatus;
    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    private Integer recommandStatus;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 促销类型
     */
    private Integer promotionType;
    /**
     * 排序
     */
    private Integer sort;

    @Field(type = FieldType.Nested)
    private List<EsProductAttributeValue> attrValueList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<EsProductAttributeValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<EsProductAttributeValue> attrValueList) {
        this.attrValueList = attrValueList;
    }
}
