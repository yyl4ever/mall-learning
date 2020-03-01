package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.CharterApply;

/**
 * @Author: yangyl
 * @Date: 2020-03-01 17:27
 * @Description:
 */
public interface CharterApplyMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(CharterApply record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(CharterApply record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    CharterApply selectByPrimaryKey(Long id);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CharterApply record);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CharterApply record);

    Long save(CharterApply record);

    Long saveOne(CharterApply record);
}