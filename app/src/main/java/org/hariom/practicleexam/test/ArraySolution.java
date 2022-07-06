package org.hariom.practicleexam.test;

import java.util.ArrayList;

/***
 * Write  a  program  to  convert  a  nested  list  to  1-D  list  in  Java. Example-1:
 * Input  =  [1,2,3,[4,5,[6,7,[8],9,10],11],12,13,14,15,[16,[17,18,19],20],21,22,23,24]
 * Output  =  [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24]
 */

/**
 * Write  a  program  to  convert  a  dict  to  its  equivalent  dotty  representation. Example-1: Input  =  {a:1,  b:{c:2,  d:3,  e:{f:4,  g:5},  h:6},  c:7} Output  =  {a:1,  b.c:2,  b.d:3,  b.e.f:4,  b.e.g:5,  b.e.h:6,  c:7}
 */
public class ArraySolution {

    public static void convertNestedList(){

        ArrayList<String> resultArray =  new ArrayList<>();
        String input = "[1,2,3,[4,5,[6,7,[8],9,10],11],12,13,14,15,[16,[17,18,19],20],21,22,23,24]";
        // Split string
        String[] newInputArray = input.split(",");

        for (int i = 0; i < newInputArray.length;i++){
            resultArray.add(newInputArray[i]);
        }
        // Remove square bracket from arraylist

        // Convert string array to Integer array
    }
}
