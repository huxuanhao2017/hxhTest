package test;

import test.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hxh on 2017-08-17.
 */
public class TestFour {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(1,"1"));
        list.add(new User(2,"2"));
        list.add(new User(3,"3"));
        int i = 1;
        setInt(list,i);
        list.stream().forEach(integer -> System.out.println(integer.toString()));
        Long l = 11L;
        int i1 = l.intValue();
        System.out.println(i1);
    }

    private static void setInt(List<User> list,int i) {
        i++;
        list.stream().forEach(user -> {
            user.setAge(99);
        });
        for (User u :
                list) {
            u.setAge(88);
        }
        list.stream().forEach(integer -> System.out.println(integer.toString()));
    }
}
