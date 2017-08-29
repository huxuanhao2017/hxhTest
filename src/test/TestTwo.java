package test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by hxh on 2017-07-19.
 */
public class TestTwo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int monthValue = now.getMonthValue();
        System.out.println(now.minusMonths(1).getMonthValue());
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(3, 2);
        map.put(2, 3);
        map.put(1, 1);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int visitorRanking = 0;
        for (Map.Entry<Integer, Integer> mapping : list) {
            System.out.println("key:" + mapping.getKey());
            System.out.println("value:" + mapping.getValue());
        }
    }
}
