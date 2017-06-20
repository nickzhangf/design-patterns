package com.zf.template_method_pattern;

import java.util.function.Consumer;

/**
 * 模板方法抽象类（java8写法）
 * Created by feng zhang on 2017/6/20.
 */
public class OnlineBanking8
{
    public final void processCustomer(Consumer<String> s)
    {
        System.out.println("start process!");
       s.accept("hello");
    }
}
