package com.weimin;

import java.util.Stack;

/**
 * 单链表的反向遍历
 */
public class SingleList {
    Node head;


    public void add(Node node){
        if(head==null){
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }


    public void show(){
        if(head==null){
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

    // 反向遍历  递归
    public void reserveShow(){
        reserveShow(head);
    }

    private void reserveShow(Node head) {
        if(head==null){
            return;
        }

        if(head.next!=null){
            reserveShow(head.next);
        }
        System.out.println(head.data);
    }


    private Stack<Integer> stack = new Stack<>();

    private void reserveShow1() {
        if(head==null){
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        stack.push(temp.data);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }


    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.add(new Node(0));
        singleList.add(new Node(1));
        singleList.add(new Node(2));
        singleList.add(new Node(3));
        singleList.add(new Node(4));
        singleList.add(new Node(5));
        singleList.add(new Node(6));

        singleList.reserveShow1();
    }


    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
