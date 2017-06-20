package com.zf.template_method_pattern;

/**
 * Created by feng zhang on 2017/6/20.
 */
public class OnlineBankingB extends OnlineBanking
{
    @Override
    void makeCustomerHappy()
    {
        System.out.println("Bank B make customer happy!");
    }
}
