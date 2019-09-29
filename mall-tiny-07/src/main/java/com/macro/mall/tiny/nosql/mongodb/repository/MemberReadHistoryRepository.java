package com.macro.mall.tiny.nosql.mongodb.repository;

import com.macro.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * 会员浏览历史 Repository
 * @Author: yangyl
 * @Date: 2019/9/10 17:58
 * 继承MongoRepository接口可以获得常用的数据操作方法
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String>{

    /**
     * 根据会员 id 获取浏览记录，按时间倒序排列
     * @param memberId
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);

    /**
     * 使用@Query注解可以用Mongodb的JSON查询语句进行查询
     * @param memberId
     * @return
     */
    @Query("{'memberId' : ?0 }")
    List<MemberReadHistory> findByMemberId(Long memberId);
}
