package org.dsa.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImplOfStckWithLL {
    private static final Logger log = LoggerFactory.getLogger(ImplOfStckWithLL.class);

    public static class Node{ // it is static because Node does NOT need an instance of the outer class to exist.
        private final int value;
        private Node next;

        public Node(int x){
            value=x;
            next = null;
        }
    }

    Node top;
    int size;
    public ImplOfStckWithLL(){

        top = null; //stores reference to next element
        size = 0;
    }

    public void push(int x){
        Node node1 = new Node(x);
        node1.next= top;
        top = node1;
        size++;
    }

    public void pop(){
        if(top==null){
            log.info("stack under flow");
            return;

        }


        top = top.next;
        size--;

    }

    public void printLinkedlist(){
        Node head = top;
        while(head!=null){

            log.info("{}", head.value);

            head = head.next;

        }
    }

    public static void main(String[] args) {
        ImplOfStckWithLL nodes = new ImplOfStckWithLL();
        nodes.push(23);
        nodes.printLinkedlist();//we can print arraylist directly because it overrides toString() method unlike array which does not so we have to iterate to print it
       log.info("//////////////////////////////////////////");

        nodes.push(34);
        nodes.printLinkedlist();
       log.info("///////////////////////////////////////////");


        nodes.push(56);
        nodes.printLinkedlist();
        log.info("////////////////////////////////////////////");



        nodes.push(49);
        nodes.printLinkedlist();
        log.info("//////////////////////////////////////////////");


        nodes.push(20);
        nodes.printLinkedlist();
        log.info("/////////////////////////////////////////////");


        nodes.pop();
        nodes.printLinkedlist();
        log.info("///////////////////////////////////////////////");


        nodes.pop();
        nodes.printLinkedlist();
        log.info("////////////////////////////////////////////////");


        nodes.pop();
        nodes.printLinkedlist();

    }
}
