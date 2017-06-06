package com.zf;

import com.zf.starategy_pattern.AddAlgorithm;
import com.zf.starategy_pattern.Context;
import com.zf.starategy_pattern.SubAlgorithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title:StrategyPatternTest<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/6/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StrategyPatternTest
{
    @Test
    public void testStratgyPattern()
    {
        Context context = new Context(new AddAlgorithm());
        context.handle();

        Context context1 = new Context(new SubAlgorithm());
        context1.handle();
    }
}
