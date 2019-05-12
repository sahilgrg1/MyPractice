package com.company.Hello;

import java.util.Arrays;
import java.util.Stack;
public class Hello
{
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head ;
    public void addfirst(int value )
    {
        Node node = new Node(value , head );
        node.next = head ;
        head = node;
    }
    public void display()
    {
        if(head == null)
        {
            return ;
        }
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }


    }
    public void addindex(int value , int index)
    {
        if(head == null)
        {
            addfirst(value);
        }
        Node temp = head;
        for (int i = 0; i < index - 1  ; i++) {
            temp =temp.next;


        }
        Node node= new Node(value,temp.next);
        temp.next = node;
    }
    public void addlast(int value)
    {
        if(head == null)
        {
            addfirst(value);
        }
        Node temp = head ;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
    }
    public int deletefirst()
    {
        if(head == null)
        {
            return Integer.parseInt(null);
        }
        int value = head.value;
        head = head.next;
        return value ;
    }
    public int deletelast()
    {
        if(head == null)
        {
            return Integer.parseInt(null);
        }
        Node temp = head ;
         while(temp != null)
         {
             temp = temp.next;
         }
         int value = temp.next.value;
         temp.next  = null;
         return value;
    }
    public int deleteindex(int index)
    {
        if(head == null)
        {
            return Integer.parseInt(null);
        }
        Node temp = head ;
        for (int i = 0; i < index - 1 ; i++) {
          temp  = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;
        return value;

    }
    public int getnth(int index)
    {
        if(head == null)
        {
            return Integer.parseInt(null);
        }
        int count = 0  ;
        Node temp = head;
        while(temp.next != null) {
            if (count == index) {
                return temp.value;
            }
            count++;
            temp = temp.next;


        }
        return -1 ;
    }
    public int mid()
    {
        if(head == null)
        {
            return Integer.parseInt(null);
        }
        Node fast = head ;
        Node slow = head ;
        while(fast.next.next != null || fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow.value;
    }
    public int counter(int a)
    {
        if(head == null)
        {
            return Integer.parseInt(null);
        }
        int count = 0 ;
        Node temp = head ;
        while (temp != null)
        {
            if(temp.value == a )
            {
                count++;
            }
            temp  = temp.next;
        }
        return count;
    }
    public boolean loop()
    {
        if(head == null)
        {
            return false;
        }
        Node fast = head ;
        Node slow = head ;
        int count = 0 ;
        while(fast.next.next != null || fast.next != null)
        {
            if(fast.next.next == slow.next)
            {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
    public void pairwiseswap()
    {
        if(head == null)
        {
            return ;

        }
        Node temp = head ;
        while(temp != null && temp.next!=null)
        {
            int k = temp.value;
            temp.value = temp.next.value;
            temp.next.value = k ;
            temp = temp.next.next;
        }
    }

}