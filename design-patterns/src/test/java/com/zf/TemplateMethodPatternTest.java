package com.zf;

import com.zf.template_method_pattern.OnlineBanking;
import com.zf.template_method_pattern.OnlineBanking8;
import com.zf.template_method_pattern.OnlineBankingA;
import com.zf.template_method_pattern.OnlineBankingB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by feng zhang on 2017/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TemplateMethodPatternTest
{
    @Test
    public void testTemplateMethodPattern()
    {
        OnlineBanking bankingA = new OnlineBankingA();
        bankingA.processCustomer();

        OnlineBanking bankingB = new OnlineBankingB();
        bankingB.processCustomer();
    }

    @Test
    public void testTemplateMethodPattern8()
    {
        new OnlineBanking8().processCustomer(s -> System.out.println(s + " make customer happy!"));
    }
}
