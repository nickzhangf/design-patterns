package com.zf.state_pattern;

/**
 * <p>Title:YellowState<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/6/6
 */
public class YellowState implements State
{
    @Override
    public void change(Context context)
    {
        System.out.println("Current state is: yellow");
        context.setState(new RedState());
    }
}
