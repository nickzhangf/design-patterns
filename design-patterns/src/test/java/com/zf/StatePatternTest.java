package com.zf;

import com.zf.state_pattern.Context;
import com.zf.state_pattern.GreenState;
import com.zf.state_pattern.State;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title:StatePatternTest<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/6/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StatePatternTest
{
    @Test
    public void testStatePattern() {
        State state = new GreenState();
        Context context = new Context(state);
        context.change();
        context.change();
        context.change();
        context.change();
    }
}
