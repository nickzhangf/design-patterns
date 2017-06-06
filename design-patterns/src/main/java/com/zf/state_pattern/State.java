package com.zf.state_pattern;

/**
 * <p>Title:State<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/6/6
 */
public interface State
{
    void change(Context context);
}
