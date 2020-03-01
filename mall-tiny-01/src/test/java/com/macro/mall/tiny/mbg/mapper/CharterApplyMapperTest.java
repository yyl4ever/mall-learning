package com.macro.mall.tiny.mbg.mapper;
import java.util.Date;

import com.macro.mall.tiny.mbg.model.CharterApply;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @Author: yangyl
 * @Date: 2020-03-01 17:18
 * @Description:
 */
public class CharterApplyMapperTest {
    private static CharterApplyMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(CharterApplyMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/CharterApplyMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(CharterApplyMapper.class, builder.openSession(true));
    }

    @Test
    public void testSave() throws FileNotFoundException {
        CharterApply apply = new CharterApply();
        apply.setApproved(0);
        apply.setEnterpriseName("test-test");
        apply.setSocialCreditCode("");
        apply.setEnterpriseArea("");
        apply.setEnterpriseAddress("");
        apply.setWorkResumptionProofUrl("");
        apply.setDepartureDate("");
        apply.setDepartureTime("");
        apply.setDepartureArea("");
        apply.setDepartureAddress("");
        apply.setDestinationArea("");
        apply.setDestinationAddress("");
        apply.setBusSeatType("");
        apply.setChartererName("");
        apply.setChartererPhone("");
        apply.setPassengerCount(0);
        apply.setCharterAreaId(0L);
        apply.setCreateTime(new Date());
        apply.setModifyTime(new Date());
        mapper.save(apply);
        System.out.println(apply.getId());
    }

    @Test
    public void testSaveOne() throws FileNotFoundException {
        CharterApply apply = new CharterApply();
        apply.setApproved(0);
        apply.setEnterpriseName("test-save-one");
        apply.setSocialCreditCode("");
        apply.setEnterpriseArea("");
        apply.setEnterpriseAddress("");
        apply.setWorkResumptionProofUrl("");
        apply.setDepartureDate("");
        apply.setDepartureTime("");
        apply.setDepartureArea("");
        apply.setDepartureAddress("");
        apply.setDestinationArea("");
        apply.setDestinationAddress("");
        apply.setBusSeatType("");
        apply.setChartererName("");
        apply.setChartererPhone("");
        apply.setPassengerCount(0);
        apply.setCharterAreaId(0L);
        apply.setCreateTime(new Date());
        apply.setModifyTime(new Date());
        mapper.saveOne(apply);
        System.out.println(apply.getId());
    }
}
