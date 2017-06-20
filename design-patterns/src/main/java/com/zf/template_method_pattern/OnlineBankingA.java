package com.zf.template_method_pattern;

/**
 * Created by feng zhang on 2017/6/20.
 */
public class OnlineBankingA extends OnlineBanking
{
    @Override
    void makeCustomerHappy()
    {
        System.out.println("Bank A make customer happy!");
    }
}
