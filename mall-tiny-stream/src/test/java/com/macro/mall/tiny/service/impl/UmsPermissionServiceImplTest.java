package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.MallTinyApplicationTests;
import com.macro.mall.tiny.service.UmsPermissionService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UmsPermissionServiceImpl Tester.
 *
 * @author yangyl
 * @version 1.0
 * @since <pre>09/24/2019</pre>
 */
public class UmsPermissionServiceImplTest extends MallTinyApplicationTests {

    @Autowired
    private UmsPermissionService umsPermissionService;
    
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: treeList()
     */
    @Test
    public void testTreeList() throws Exception {
        umsPermissionService.treeList();
    }

    /**
     * Method: streamTest()
     */
    @Test
    public void testStreamTest() throws Exception {
        umsPermissionService.streamTest();
    }


} 
