package Strings;

import java.util.HashMap;

public class twoSumUsingMap {

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=7;

        int arr1[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement)){
                arr1[0]=map.get(complement);
                arr1[1]=i;
                break;
            }

            map.put(arr[i],i);
        }
        System.out.println(arr1[0] + " " + arr1[1]);
    }
}



