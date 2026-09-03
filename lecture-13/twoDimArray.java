public class twoDimArray {
    public static void main(String[] args){
        //declaration
        int[][] arr;
        //allocation
        arr = new int[3][4];
        //initialization
        int[][] brr = {
            {1,2},
            {2,3},
            {3,4},
            {4,5}
        };
        // Accessing 2D array elements
        //System.out.println(brr[3][0]);

        // Print overall 2D array
        // int rowLength = brr.length;
        // int colLength = brr[0].length;  // if both no. of rows and columns are equal

        // for(int row=0;row<=rowLength-1;row++){
        //     for(int col=0;col<=colLength-1;col++){
        //         System.out.print(brr[row][col]+ " ");
        //     }
        //     System.out.println();
        // }

        // for jagged array
        int[][] brr1 ={
            {1,2},
            {1,2,3,4},
            {4,5,6,7,8},
            {6,7},
        };
        int rowLength = brr1.length;
        for(int row=0;row<=rowLength-1;row++){
            int colLength = brr1[row].length;
            for(int col=0;col<=colLength-1;col++){
                System.out.print(brr1[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
