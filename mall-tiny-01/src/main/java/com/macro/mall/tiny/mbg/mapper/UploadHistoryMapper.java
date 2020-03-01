package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.UploadHistory;

 /**
  * @Author: yangyl
  * @Date: 2020-03-01 17:44
  * @Description: 
 */
public interface UploadHistoryMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UploadHistory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UploadHistory record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UploadHistory selectByPrimaryKey(Long id);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UploadHistory record);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UploadHistory record);
}