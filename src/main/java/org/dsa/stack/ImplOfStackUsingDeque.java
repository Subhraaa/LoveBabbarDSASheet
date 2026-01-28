package org.dsa.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Deque;


public class ImplOfStackUsingDeque {
    private static final Logger log = LoggerFactory.getLogger(ImplOfStackUsingDeque.class);
   // in a double ended queue, We can use either end of deque (front or back) to implement a stack
   public static void main(String[] args) {

       Deque<Integer> stack = new ArrayDeque<>(); //deque has methods push and pop
       stack.push(23);
       stack.pop();
       log.info("{}",stack.peek());

   }



}
