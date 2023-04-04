package com.baidu.crowdtest.java9.interfaceT;

/**
 * Description:
 *
 * @author v_wujunhui01
 * @create 2022/12/30 15:56
 */
public interface MyInter {

    default void test() {
        inner();
    }

    private void inner() {
        System.out.println("我是接口私有方法");
    }
}
