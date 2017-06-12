package test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by huxuanhao on 2017-06-03.
 */
public class TestOne {
    public static void main(String[] args) {
        String strTest = "";
        int length = strTest.length();
        /**
         * optional 类可以包含或不可以包含非空值的容器对象
         * Optional类像是一个容器，它保存一个类型为的值或是null值。
         * 通过使用Optional类的isPresent()方法，我们可以检查指定的对象是否为空
         */
        Optional<String> str = Optional.ofNullable(strTest);
        System.out.println(str.isPresent());
        /**
         * 元素流式编程
         */
        int[] ary = {1, 2, 3, 4, 5};
        Arrays.stream(ary)
                .map(n -> 2 * n + 1).forEach(p -> System.out.println(p));
        for (int a : ary
                ) {
            System.out.println(a);
        }
        /**
         * Lambda表达式来创建匿名方法
         */
        Arrays.asList("a", "b", "c").forEach(new TestOne()::show);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2017-06-08
        LocalDate twentyDecember2015 = LocalDate.of(2015, Month.DECEMBER, 20);
        System.out.println(twentyDecember2015);//2015-12-20
        LocalDate firstDec2015 = LocalDate.of(2015, 12, 1);
        System.out.println(firstDec2015);//2015-12-01
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        /**
         * 新的Nashorn JavaScript引擎，使用它可以开发和运行JavaScript应用程序。
         */
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        System.out.println(engine.getClass().getName());// jdk.nashorn.api.scripting.NashornScriptEngine
        try {
            System.out.println("output: " + engine.eval("function show() {return 10;}; show();"));// output: 10
            System.out.println("1+1");
            System.out.println("output:" + engine.eval("1+1"));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        /**
         * 在Java 8中，引入了新的并行排序，它比前者的排序速度更快
         */
        int[] aryInt = {1, 2, 4, 8, 5};
        Arrays.parallelSort(aryInt);
        for (int i : aryInt) {
            System.out.println(i);
        }//1 2 4 5 8
        /**
         * Java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法
         */
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.sqrt(16));//4.0
        System.out.println(formula.calculate(100));//100.0
        Map<Integer, String> map = new HashMap<>();
        /**
         * map操作
         */
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
            System.out.println( map.get(i));
        }
    }

    public void show(String str) {
        System.out.println(str + ":");
    }

}
