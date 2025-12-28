package org.dsa.searchingandsort;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class FirstLastOccurrenceOfAnElement {
    private static final Logger logger = LoggerFactory.getLogger(FirstLastOccurrenceOfAnElement.class);

    //[Naive Approach] - Using Iteration - O(n) Time and O(1) Space
    //The idea is to simply iterate on the elements of the given array and keep track of first and last occurrence of the value x.

    public static ArrayList<Integer> naiveIteration(int[] input, int ele){
        ArrayList<Integer> res = new ArrayList<>();
        int first = -1;
        int last = -1;
        for(int i = 0; i<input.length;i++){
            if(input[i]== ele){
                if(first == -1){
                first = i;}
                last = i;
            }
        }
        res.add(0,first);
        res.add(1,last);
        return res;
    }
    public static void main(String[] args) {
        int[] inputArray = {34,5,35,93,66,5,7,5};

        ArrayList<Integer> res = naiveIteration(inputArray, 5);
        logger.info("first occurence: {}", res.get(0));
        logger.info("last occurence: {}", res.get(1));







    }
}
