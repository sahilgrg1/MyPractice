package com.company.Hello;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Dynamic
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.get(2);
        list.add(45);
        dupli(list);


    }
    public static void dupli(LinkedList list)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size() ; i++) {
            set.add((Integer) list.get(i));
            if(set.contains(list.get(i)))
            {
                continue;
            }

        }
        System.out.println(set);

    }

}