package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.enums.RegionLevelEnum;
import com.macro.mall.tiny.mbg.mapper.RegionDtoMapper;
import com.macro.mall.tiny.mbg.model.RegionDto;
import com.macro.mall.tiny.mbg.model.RegionDtoNode;
import com.macro.mall.tiny.service.IRegionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @Author: yangyl
 * @Date: 2020-02-26 20:44
 * @Description:
 */
@Service
public class RegionServiceImpl implements IRegionService {

    @Autowired
    private RegionDtoMapper regionDtoMapper;

    @Override
    public List<RegionDto> listAll() {
        return regionDtoMapper.listAll();
    }

    @Override
    public List<RegionDtoNode> listAllProvince() {
        List<RegionDtoNode> regionDtoNodes = new ArrayList<>();

        List<RegionDto> allProvincesAndCityAndAreas = regionDtoMapper.listAll()
                .stream()
                .filter(regionDto ->
                        RegionLevelEnum.LEVEL_PROVINCE.getCode().equals(regionDto.getRegionLevel())
                        || RegionLevelEnum.LEVEL_CITY.getCode().equals(regionDto.getRegionLevel())
                                || RegionLevelEnum.LEVEL_AREA.getCode().equals(regionDto.getRegionLevel()))
                .collect(Collectors.toList());

        regionDtoNodes = allProvincesAndCityAndAreas.stream()
                .filter(regionDto -> regionDto.getParentCode().equals("000000"))
                .map(regionDto -> convertProvince(regionDto, allProvincesAndCityAndAreas))
                .collect(Collectors.toList());
        return regionDtoNodes;
    }

    /**
     * 从 regionDtoList 找到 regionDto 的儿子，再设置到 regionDto 上
     *
     * @param regionDto
     * @param regionDtoList
     * @return
     */
    private RegionDtoNode convertCity(RegionDto regionDto, List<RegionDto> regionDtoList) {
        RegionDtoNode node = new RegionDtoNode();
        BeanUtils.copyProperties(regionDto, node);
        List<RegionDtoNode> children = regionDtoList.stream()
                .filter(subRegion -> subRegion.getParentCode().equals(regionDto.getRegionCode()))
                // 孩子名称不等于父亲
                .filter(subRegion -> !subRegion.getRegionName().equals(regionDto.getRegionName()))
                .map(subRegion -> convertCity(subRegion, regionDtoList))
                .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(children)) {
            children = null;
        }
        node.setChildren(children);
        return node;
    }

    /**
     * 从 regionDtoList 找到 regionDto 的儿子，再设置到 regionDto 上
     *
     * @param regionDto
     * @param regionDtoList
     * @return
     */
    private RegionDtoNode convertProvince(RegionDto regionDto, List<RegionDto> regionDtoList) {
        RegionDtoNode node = new RegionDtoNode();
        BeanUtils.copyProperties(regionDto, node);
        List<RegionDtoNode> children = regionDtoList.stream()
                .filter(subRegion -> subRegion.getParentCode().equals(regionDto.getRegionCode()))
                .map(subRegion -> convertCity(subRegion, regionDtoList))
                .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(children)) {
            children = null;
        }
        node.setChildren(children);
        return node;
    }

}
