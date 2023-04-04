package com.baidu.crowdtest.java10;

import org.junit.jupiter.api.Test;

/**
 * Description:
 *
 * @author v_wujunhui01
 * @create 2022/12/30 16:40
 */
public class Java10Test {
    @Test
    public void inferTest() {
        var a = 10;
        var b = 10 + "";
        System.out.println(b.getClass());
    }
}
