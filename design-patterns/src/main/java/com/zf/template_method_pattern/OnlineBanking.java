package com.zf.template_method_pattern;

/**
 * Created by feng zhang on 2017/6/20.
 */
abstract public class OnlineBanking
{
    public final void processCustomer()
    {
        System.out.println("start process!");
        makeCustomerHappy();
    }

    abstract void makeCustomerHappy();
}
