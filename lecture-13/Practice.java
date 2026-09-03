//package lecture-13;

public class Practice {
    public static void main(String[] args) {
        // print total sum of an array elements
    //     int arr[] = {10,20,30,40,50};
    //     int sum = 0;
    //     int n = arr.length;
    //     for(int i=0;i<=n-1;i++){
    //         int value = arr[i];
    //         sum = sum+value;        
    //     }
    //     System.out.println("sum is :"+ sum);
    // }

    // Print total multiplication of an array elements
        // int arr[]={1,2,3,4};
        // int ans = 1;
        // int n = arr.length;

        // for(int i=0;i<=n-1;i++){
        //     int value = arr[i];
        //     ans = ans*value;
        // }
        // System.out.println(ans);

        // find maximum element inside an array

        // int arr[] = {3,2,-4,21,10};
        // int n = arr.length;
        // int maxValue = arr[0];

        // // compare maxValue for each array element
        // for(int i=0;i<=n-1;i++){
        //     if(arr[i]>maxValue){
        //         maxValue = arr[i];
        //     }
        // }
        // System.out.println(maxValue);

        // find minimum value inside array
        int arr[] = {3,2,-4,21,10};
        int n = arr.length;
        int minValue = arr[0];

        // compare maxValue for each array element
        for(int i=0;i<=n-1;i++){
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        System.out.println(minValue);

    }
}
