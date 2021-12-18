package com.bald9;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author bald9
 * @create 2021-12-18 14:43
 */
public class test {
    public static void main(String[] args) {
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet1.add(new A1(17,17));
        for (int i = 1; i <= 13; i++) {
           hashSet1.add(new A1(i,i));
        }
        System.out.println(hashSet1.add(new A1(17,17)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new A1());
        //new HashSet(1,0.75,false);\
        System.out.println(new A1(17,17)==new A1(17,17));
    }
}

class A1{
    private int t1;
    private int t2;
    public A1() {
    }

    public A1(int t1) {
        this.t1 = t1;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A1 a1 = (A1) o;
        return t1 == a1.t1;
    }

    public A1(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public int hashCode() {
        return t2;
    }
}
