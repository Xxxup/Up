package com.baidu.crowdtest.java9.collecFact;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author v_wujunhui01
 * @create 2022/12/30 16:04
 */
public class MyCollectTest {
    @Test
    public void mapTest() {
        Map<String, Integer> map = Map.of("1", 1, "2", 2);
        HashMap<String, Integer> hashMap = new HashMap<>(map);
        hashMap.put("3", 3);
        System.out.println(hashMap);
    }

    @Test
    public void listTest() {
        Set<Integer> integers = Set.of(1, 2, 3);
        HashSet<Integer> set = new HashSet<>(integers);
    }
}
