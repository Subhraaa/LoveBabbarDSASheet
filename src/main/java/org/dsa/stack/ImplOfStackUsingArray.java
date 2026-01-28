package org.dsa.stack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImplOfStackUsingArray {
    private static final Logger log = LoggerFactory.getLogger(ImplOfStackUsingArray.class);

        private final int capacity;
        private int top;
        private final int[] array;

        public ImplOfStackUsingArray(int cap){
            capacity = cap;
            top = -1;
            array = new int[cap];
        }

        public void push(int num){
            if(top==capacity-1){
                log.info("Stack overflow!");
                return;
            }

            array[++top] = num;
        }

        public void pop(){
            if(top == -1){
                log.info("Stack underflow!");
                return ;
            }
            array[top--] = 0;

        }

        public void printArray(){
            for(int i = 0; i<array.length; i++){
                log.info("{} : {}",i,array[i]);

            }
        }



    public static void main(String[] args) {
        ImplOfStackUsingArray stackArray = new ImplOfStackUsingArray(4);
        stackArray.push(23);
        stackArray.printArray();
        log.info("///////////////////////////////////////////1");

        stackArray.push(34);
        stackArray.printArray();
        log.info("///////////////////////////////////////////2");


        stackArray.push(56);
        stackArray.printArray();
        log.info("///////////////////////////////////////////3");



        stackArray.push(49);
        stackArray.printArray();
        log.info("///////////////////////////////////////////4");


        stackArray.push(20);
        stackArray.printArray();
        log.info("///////////////////////////////////////////5");


        stackArray.pop();
        stackArray.printArray();
        log.info("///////////////////////////////////////////6");


        stackArray.pop();
        stackArray.printArray();
        log.info("///////////////////////////////////////////7");


        stackArray.pop();
        stackArray.printArray();


    }
}
