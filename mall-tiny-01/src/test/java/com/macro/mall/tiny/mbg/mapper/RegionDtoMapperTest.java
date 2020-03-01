package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.RegionDto;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

/**
 * @Author: yangyl
 * @Date: 2020-02-27 14:33
 * @Description:
 */
public class RegionDtoMapperTest {
    private static final Logger logger = LoggerFactory.getLogger(RegionDtoMapperTest.class);

    private static RegionDtoMapper regionMapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(RegionDtoMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/RegionDtoMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        regionMapper = builder.getConfiguration().getMapper(RegionDtoMapper.class, builder.openSession(true));
    }

    @Test
    public void testFindByRegionNameIn() throws FileNotFoundException {
        List<RegionDto> regionDtos = regionMapper.findByRegionNameIn(Collections.singletonList("江苏省"));
        logger.info(String.valueOf(regionDtos));
    }

    @Test
    public void testFindByRegionName() throws FileNotFoundException {
        List<RegionDto> region = regionMapper.findByRegionName("");
        logger.info(String.valueOf(region));
    }

    @Test
    public void testSave() {
    }
}
