//package lecture-13;

public class Arrays {
    public static void main(String[] args) {
        // declaration 
        int arr[];
        //allocation
        arr = new int[5];
        // initialization
        int brr[]={10,20,30,40,50};
        // Accessing arrays elements
        // System.out.println("value at index 0 "+ brr[0]);
        // System.out.println("value at index 1 "+ brr[1]);
        // System.out.println("value at index 2 "+ brr[3]);

        // For loop
        int n = brr.length;
        // for(int index=0;index<=n-1;index++){
        //     System.out.println(brr[index]);
        // }

        //For each loop 
        for(int val:brr){
            System.out.println(val);
        }
    }
}
