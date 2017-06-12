package test;

/**
 * Created by huxuanhao on 2017-06-12.
 */
public interface Formula {
    double calculate(int a);
    default double sqrt(int a){
    return Math.sqrt(a);
    }
}
