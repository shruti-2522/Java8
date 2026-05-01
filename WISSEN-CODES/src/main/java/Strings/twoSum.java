package Strings;

public class twoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int result[]=new int[256];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==target){
//                    result[0]=arr[i];
//                    result[1]=arr[j];

                    result[0]=i;
                    result[1]=j;

                    break;
                }

            }
        }
        System.out.println(result[0]+" "+result[1]);
    }
}
