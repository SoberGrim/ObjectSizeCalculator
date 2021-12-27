package org.test.java;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import java.util.*;

public class Starter {


    public static void main(String[] args) {
        List<Integer> list;

        System.out.println("================ Vector ==================");
        list = new Vector<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));

        System.out.println("================ Stack ==================");
        list = new Stack<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));

        System.out.println("================ ArrayList ==================");
        list = new ArrayList<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));

        System.out.println("================ LinkedList ==================");
        list = new LinkedList<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));
        list.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(list));


        System.out.println("================ Queues ==================");

        Queue<Integer> de;

        System.out.println("================ ArrayDeque ==================");
        de = new ArrayDeque<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(de));
        de.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(de));
        de.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(de));
        de.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(de));

        System.out.println("================ PriorityQueue ==================");
        de = new PriorityQueue<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(de));
        de.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(de));
        de.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(de));
        de.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(de));


        Set<Integer> set;
        System.out.println("================ HashSet ==================");
        set = new HashSet<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));

        System.out.println("================ LinkedHashSet ==================");
        set = new LinkedHashSet<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));

        System.out.println("================ TreeSet ==================");
        set = new TreeSet<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(1);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(2);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));
        set.add(3);
        System.out.println(ObjectSizeCalculator.getObjectSize(set));

        Map<Integer, Integer> map;
        System.out.println("================ HashMap ==================");
        map = new HashMap<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(1,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(2,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(3,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));


        System.out.println("================ LinkedHashMap ==================");
        map = new LinkedHashMap<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(1,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(2,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(3,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));

        System.out.println("================ TreeMap ==================");
        map = new TreeMap<>();
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(1,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(2,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));
        map.put(3,1);
        System.out.println(ObjectSizeCalculator.getObjectSize(map));


        System.out.println("================ Primitive Types ==================");

        System.out.println(ObjectSizeCalculator.getObjectSize(1));
        System.out.println(ObjectSizeCalculator.getObjectSize(1.0f));
        System.out.println(ObjectSizeCalculator.getObjectSize('1'));
        System.out.println(ObjectSizeCalculator.getObjectSize(true));

        System.out.println("================ Primitive Types: Long and Double ==================");

        System.out.println(ObjectSizeCalculator.getObjectSize(1L));
        System.out.println(ObjectSizeCalculator.getObjectSize(1.0d));

        System.out.println("================ Primitive Types: Strings length 0-4 ==================");

        System.out.println(ObjectSizeCalculator.getObjectSize(""));
        System.out.println(ObjectSizeCalculator.getObjectSize("1"));
        System.out.println(ObjectSizeCalculator.getObjectSize("12"));
        System.out.println(ObjectSizeCalculator.getObjectSize("123"));
        System.out.println(ObjectSizeCalculator.getObjectSize("1234"));

        System.out.println("================ Primitive Types: Strings length 2-9 ==================");

        System.out.println(ObjectSizeCalculator.getObjectSize("12345"));
        System.out.println(ObjectSizeCalculator.getObjectSize("123456"));
        System.out.println(ObjectSizeCalculator.getObjectSize("1234567"));
        System.out.println(ObjectSizeCalculator.getObjectSize("12345678"));
        System.out.println(ObjectSizeCalculator.getObjectSize("123456789"));



    }
}
