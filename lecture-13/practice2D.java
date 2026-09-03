public class practice2D {
    public static void main(String[] args){
        // print array sum 
        // int arr[][]={{1,2,3},{1,2,3}};
        // int sum =0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         int value = arr[i][j];
        //         sum = sum+value;            
        //     }
        // }
        // System.out.println(sum);

        // print multiplication of array elements
        // int arr[][]={{1,2,3},{1,2,3}};
        // int ans =1;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         int value = arr[i][j];
        //         ans = ans*value;            
        //     }
        // }
        // System.out.println(ans);

        // print maximum value 
        // int arr[][]={{1,2,3},{21,20,19}};
        // int maxValue = arr[0][0];

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         if(arr[i][j]>maxValue){
        //             maxValue = arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(maxValue);

        // print min value
        int arr[][]={{1,2,3},{21,20,19}};
        int minValue = arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<minValue){
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println(minValue);
    }
    
}
