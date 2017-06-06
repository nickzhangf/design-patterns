package com.zf.state_pattern;

import lombok.Data;

/**
 * <p>Title:Context<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/6/6
 */
@Data
public class Context
{
    private State state;

    public Context(State state)
    {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}
