package com.array_interview.programs;

import java.util.HashMap;

class MapTest
{
    public static void main(String args[]){
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int arr[] = new int[]{2,2,3,9,3,5,6,2,7,9,3,3,9,0};
        for(int i=0; i<arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
            } else {
                h.put(arr[i], 1);
            }
        }
        System.out.println(h);
    }
}