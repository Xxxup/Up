package com.baidu.crowdtest.java8;

import com.baidu.crowdtest.java8.functional.MyFuncInterface;

import java.util.Arrays;

/**
 * Description:
 *
 * @author wujunhui
 * @create 2022/12/30 10:31
 */
public class Java8Test {

    //    @Test
    public void myFuncInterfaceTest() {
        MyFuncInterface func = Java8Test::impl;
    }


    //    @Test
    public void sortTest() {
        Integer[] array = new Integer[]{3, 5, 2, 4, 1};

        Arrays.sort(array, Integer::compare);

        System.out.println(Arrays.toString(array));
    }


    public static String impl(Integer i) {
        return i + "";
    }
}
