package com.biswa.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,12,13,15,17,21};
        // sort the array using java stream
        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .filter(ReverseArray::checkPrime)
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(collect);
    }
    static boolean checkPrime(int n){
        int flag = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        return flag == 0?true:false;
    }
}
