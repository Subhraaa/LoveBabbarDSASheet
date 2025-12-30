package org.dsa.array;
// Java program to find union of two main.java.arrays
// with distinct elements

import java.util.ArrayList;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class UnionOfTwoArraysWithDuplicates {
    private static final Logger logger = LoggerFactory.getLogger(UnionOfTwoArraysWithDuplicates.class);

    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        // Add all elements from array a to res
        for (int k : a) {
            res.add(k);
        }

        // Traverse through b[] and search every element
        // b[i] in a[]
        for (int k : b) {

            // check if the element was present in a[]
            // to avoid duplicates
            int j;
            for (j = 0; j < a.length; j++) {
                if (a[j] == k)
                    break;
            }

            // If not already present, add it to res
            if (j == a.length) {
                res.add(k);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {5, 2, 7};

        ArrayList<Integer> res = findUnion(a, b);

        for (int x : res) {
            logger.info( "{} ", x);

        }
    }
}