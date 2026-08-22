public class Pattern {
   
    public static void main(String[] args){

         // Solid Square Pattern
        // int n = 4;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n;col++){
        //         System.out.print("* ");
        //     }
        //     System.err.println(" ");
        // }

        // Reactangle Pattern
        // int n = 3;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=5;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        //Right angle triangle
        // int n =5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        // Rhombus pattern

        // int n = 5;
        // for(int row=1;row<=n;row++){
        //     // print spaces
        //     for(int col=1;col<=n-row;col++){
        //         System.out.print(" ");
        //     }
        //         //print stars
        //     for(int col=1;col<=n;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();            
        // }

        //Inverted Right angle triangle
        //   int n = 5;
        //   for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n-row+1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();          
        // }
        
        // Solid Pyramid Pattern
        // int n = 5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n-row;col++){
        //         System.out.print("  ");
        //     }
        //     for(int col=1;col<=2*row-1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Inverted Solid Pyramid

        // int n =5;
        // for(int row=1;row<=n;row++){
        //     for(int spaces=1;spaces<=row-1;spaces++){
        //         System.out.print("  ");
        //     }
        //     for(int star=1;star<=2*n-2*row+1;star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Hollow rectangle Pattern
//         int n = 4;

//         for (int row = 1; row <= n; row++) {
//             for (int col = 1; col <= 6; col++) {

//                 if (row == 1 || row == n || col == 1 || col == 6) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//         }   
//     }
//     System.out.println();
// }

        // Hollow Triangle Pattern
    //     int n=5;
    //     for(int row=1;row<=n;row++){
    //         for(int col=1;col<=row;col++){
    //             if(col==1 || col==row || row==n){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //     }
    //     System.out.println();
    // }

    // Hollow right angle triangle
    // int n = 5;
    // for(int row=1;row<=n;row++){
    //     // for each row variable columns
    //     if(row==1 || row==2 || row==n){
    //         for(int col=1;col<=row;col++){
    //             System.out.print("* ");
    //         }
    //     }
    //     else{
    //         // middle rows
    //         //1*
    //         System.out.print("* ");
    //         //(row-2) spaces
    //         for(int col=1;col<=(row-2);col++){
    //             System.out.print("  ");
    //         }
    //         //1* 
    //         System.out.print("* ");
    //     }
    //     //move to next row
    //     System.out.println();
    // }

    // hollow triangle

    // int n = 5;
    // for(int row=1;row<=n;row++){
    //     // for each row variable column
    //     // part-1
    //     for(int col=1;col<=n-row;col++){
    //         System.out.print("  ");
    //     }
    //     // part 2
    //     if(row==1 || row==n){
    //         for(int col=1; col<=2*row-1;col++){
    //             System.out.print("* ");
    //         }
    //     }
    //     else{
    //         //middle rows
    //         //1*
    //         System.out.print("* ");
    //         //2*r-3 spaces
    //         for(int col=1;col<=2*row-3;col++){
    //             System.out.print("  ");
    //         }
    //         //1*
    //         System.out.print("* ");

    //     }
    //     //move to next row
    //     System.out.println();
    // }

    // Symmetry pattern 

    // part -1 
        // int n = 5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n-row;col++){
        //         System.out.print("  ");
        //     }
        //     for(int col=1;col<=2*row-1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //  //part -2
        
        // for(int row=1;row<=n;row++){
        //     if(row==1){
        //         continue;
        //     }
        //     for(int spaces=1;spaces<=row-1;spaces++){
        //         System.out.print("  ");
        //     }
        //     for(int star=1;star<=2*n-2*row+1;star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Hollow Symmetry pattern
        // part -1
    //  int n = 5;
    // for(int row=1;row<=n;row++){
    //     // for each row variable column
    //     // part-1
    //     for(int col=1;col<=n-row;col++){
    //         System.out.print("  ");
    //     }
        
    //     if(row==1){
    //         for(int col=1; col<=2*row-1;col++){
    //             System.out.print("* ");
    //         }
    //     }
    //     else{
    //         //middle rows
    //         //1*
    //         System.out.print("* ");
    //         //2*r-3 spaces
    //         for(int col=1;col<=2*row-3;col++){
    //             System.out.print("  ");
    //         }
    //         //1*
    //         System.out.print("* ");

    //     }
    //     //move to next row
    //     System.out.println();
    // }
    // // part -2
    // for(int row=1;row<=(n-1);row++){
    //     // for each row variable column
    //     // part-1
    //     for(int col=1;col<=row;col++){
    //         System.out.print("  ");
    //     }
    //     //part 2
    //     if(row==(n-1)){
    //         System.out.print("* ");
    //     }
    //     else{
    //         //remaining rows 
    //         //1*
    //         System.out.print("* ");
    //         //(2(n-row-3)) spaces
    //         for(int col=1;col<=2*(n-row)-3;col++){
    //             System.out.print("  ");
    //         }
    //         //1*
    //         System.out.print("* ");
    //     }
    //     //move to the next row
    //     System.out.println();
    // }

    //  Butterfly Pattern
    int n= 4;
     for(int row=1;row<=n;row++){
        //part -1
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        //part-2
        for(int col=1;col<=2*(n-row);col++){
            System.out.print("  ");
        }
        //part -3
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // inverted symmetrical half
    for(int row=1;row<=n;row++){
        //part-4
        for(int col=1;col<=n-row+1;col++){
            System.out.print("* ");
        }
        //part 5
        for(int col=1;col<=2*(row-1);col++){
            System.out.print("  ");
        }
        //part -6
         for(int col=1;col<=n-row+1;col++){
            System.out.print("* ");
        }

        System.out.println();
    }


}
}
