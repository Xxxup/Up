package com.baidu.crowdtest.java8.optional;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * Description:
 *
 * @author wujunhui
 * @create 2022/12/30 13:45
 */
public class OptionalTest {

    //    @Test
    public void nullTest() {
        System.out.println(str2Low(null));
    }

    public String str2Low(String str) {
        /*
        if (str != null) {
            return str.toLowerCase();
        }
        throw new NullPointerException("输入字符串为空");
        */
        return Optional.ofNullable(str)
            .map(String::toLowerCase)
            .filter(s -> !"hello".equals(s))
            .orElse("HELLO WORLD");
    }

    @Test
    public void presentTest() {
        Object obj = null;
        Optional.ofNullable(obj).ifPresent(v -> System.out.println("obj is not null"));
    }

    @Test
    public void MyTest() {
        System.out.println(1 * 100 / 10);
    }
}
