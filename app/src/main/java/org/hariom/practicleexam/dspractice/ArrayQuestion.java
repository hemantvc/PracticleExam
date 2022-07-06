package org.hariom.practicleexam.dspractice;

import java.util.Arrays;

public class ArrayQuestion {
    
    public static void findSolution(){

        // Option 1
        int[] array1 = new int[3];
        array1[0] = 11;
        array1[1] = 12;
        array1[2] = 13;
        System.out.println(Arrays.toString(array1));
        // Option 2

        int[] array2 = {1,2,3,5,6,7,8};
        System.out.println(Arrays.toString(array2));


        // Looop

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // Merge 2 array
        int s1 = array1.length;
        int s2 = array2.length;
        int[] mergeArray = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        //Traversing both array
        while (i < s1 && j <s2 ){

           // Check first element of array
            if(array1[i] < array2[j]){
                mergeArray[k++] = array1[i++];
            }else {
                mergeArray[k++] = array2[j++];
            }
        }

        // Store remaining element of array
        while (i < s1){
            mergeArray[k++] = array1[i++];
        }

        while (j < s2){
            mergeArray[k++] = array2[j++];
        }

        System.out.println(Arrays.toString(mergeArray));

    }
}
