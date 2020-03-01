package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.RegionDto;
import com.macro.mall.tiny.mbg.model.RegionDtoNode;

import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2020-02-26 20:43
 * @Description:
 */
public interface IRegionService {
    List<RegionDto> listAll();
    List<RegionDtoNode> listAllProvince();
}
