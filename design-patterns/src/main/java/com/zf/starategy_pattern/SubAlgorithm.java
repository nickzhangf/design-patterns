package com.zf.starategy_pattern;

/**
 * <p>Title:SubAlgorithm<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2017/6/6
 */
public class SubAlgorithm implements Algorithm
{
    @Override
    public void handle()
    {
        System.out.println("This is sub algorithm");
    }
}
