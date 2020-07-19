package com.guigu.java8;



import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class TestLambda {

    @Test
    public void tet1(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> ts = new TreeSet<>(com);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        System.out.printf(ts.toString());
    }

    @Test
    public void test2(){
        TreeSet<Integer> ts2 = new TreeSet<>((o1,o2)->Integer.compare(o1,o2));
        ts2.add(3);
        ts2.add(5);
        ts2.add(1);
        System.out.printf(ts2.toString());
    }

}
