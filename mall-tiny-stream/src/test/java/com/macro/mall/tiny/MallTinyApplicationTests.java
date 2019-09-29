package com.macro.mall.tiny;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Test
    public void testSqrtByBisection() {
        System.out.println(SqrtByBisection(2, 0));
    }

    //二分法  精度是指两次mid值的差值
    public static double SqrtByBisection(double target,double eps){
        double min=1,max=target;
        double mid =(min+max)/2;
        double anMid;
        do {
            if(mid*mid>target){
                max=mid;
            }else{
                min=mid;
            }
            anMid=mid;
            mid=(max+min)/2;
        } while (Math.abs(anMid - mid)>eps);
        return mid;
    }
}
