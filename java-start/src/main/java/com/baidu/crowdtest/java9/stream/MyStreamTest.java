package com.baidu.crowdtest.java9.stream;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author v_wujunhui01
 * @create 2022/12/30 16:22
 */
public class MyStreamTest {

    @Test
    public void nullStreamTest() {
        Stream.ofNullable(null)
                .forEach(System.out::println);

//        Stream.of(null)
//                .forEach(System.out::println);
    }

    @Test
    public void iteratorTest() {
        Set<Integer> set = Stream.iterate(0, i -> i < 10, i -> i + 1)
                .collect(Collectors.toSet());
    }
}
