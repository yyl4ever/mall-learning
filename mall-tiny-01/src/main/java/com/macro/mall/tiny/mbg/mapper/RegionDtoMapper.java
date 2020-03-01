package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.RegionDto;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2020-03-01 16:20
 * @Description:
 */
public interface RegionDtoMapper{
    /**
     * delete by primary key
     *
     * @param regionCode primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String regionCode);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(RegionDto record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(RegionDto record);

    /**
     * select by primary key
     *
     * @param regionCode primary key
     * @return object by primary key
     */
    RegionDto selectByPrimaryKey(String regionCode);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(RegionDto record);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(RegionDto record);

    List<RegionDto> listAll();

    List<RegionDto> findByParentCodeAndRegionLevelOrderByRegionPyDesc(@Param("parentCode") String parentCode, @Param("regionLevel") String regionLevel);

    List<RegionDto> findByRegionNameIn(@Param("regionNameCollection") Collection<String> regionNameCollection);

    List<RegionDto> findByRegionName(@Param("regionName")String regionName);

    Long saveOne(RegionDto record);

}