package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2019/8/22 15:27
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();
    
    int createBrand(PmsBrand brand);
    
    int updateBrand(Long id, PmsBrand brand);
    
    int deleteBrand(Long id);
    
    List<PmsBrand> listBrand(int pageNum, int pageSize);
    
    PmsBrand getBrand(Long id);
}
