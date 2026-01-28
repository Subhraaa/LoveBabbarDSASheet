package org.dsa.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ImplOfStackUsingArrayList {
    private static final Logger log = LoggerFactory.getLogger(ImplOfStackUsingArrayList.class);
    ArrayList<Integer> array1;
    public ImplOfStackUsingArrayList(){
        array1 = new ArrayList<>();
    }
    public void push(int value){
        array1.add(value);
    }

    public void pop(){
        array1.removeLast();
    }

    public void printArray(){
        log.info("{}",array1);

    }
    public static void main(String[] args) {
        ImplOfStackUsingArrayList stackArray = new ImplOfStackUsingArrayList();
        stackArray.push(23);
        stackArray.printArray();//we can print arraylist directly because it overrides toString() method unlike array which does not so we have to iterate to print it
        log.info("///////////////////////////////////////////");

        stackArray.push(34);
        stackArray.printArray();
        log.info("////////////////////////////////////////////");


        stackArray.push(56);
        stackArray.printArray();
        log.info("/////////////////////////////////////////////");



        stackArray.push(49);
        stackArray.printArray();
        log.info("//////////////////////////////////////////////");


        stackArray.push(20);
        stackArray.printArray();
        log.info("///////////////////////////////////////////////");


        stackArray.pop();
        stackArray.printArray();
        log.info("////////////////////////////////////////////////");


        stackArray.pop();
        stackArray.printArray();
        log.info("/////////////////////////////////////////////////");


        stackArray.pop();
        stackArray.printArray();
    }



}
