package test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Optional;

/**
 * Created by huxuanhao on 2017-06-03.
 */
public class TestOne {
    public static void main(String[] args){
        String strTest = "";
        int length = strTest.length();
        Optional<String> str =Optional.ofNullable(strTest);
        System.out.println(str.isPresent());
        int [] ary = {1,2,3,4,5};
        Arrays.stream(ary)
               .map(n->2*n+1).forEach(p->System.out.println(p));
        for (int a:ary
             ) {
            System.out.println(a);


            System.out.println("a");
        }
        Arrays.asList("a", "b", "c").forEach(new TestOne()::show );
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalDate twentyDecember2015 = LocalDate.of(2015, Month.DECEMBER, 20);
        System.out.println(twentyDecember2015);
        LocalDate firstDec2015 = LocalDate.of(2015, 12, 1);
        System.out.println(firstDec2015);
    }
    public  void show(String str){
        System.out.println(str + ":");
    }

}
