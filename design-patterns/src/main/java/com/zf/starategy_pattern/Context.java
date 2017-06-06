package com.zf.starategy_pattern;

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
    private Algorithm algorithm;

    public Context(Algorithm algorithm)
    {
        this.algorithm = algorithm;
    }

    public void handle()
    {
        this.algorithm.handle();
    }
}
