public class noPattern {
    public static void main(String[] args) {
        // number traingle pattern
        // int n = 5;
        // for(int row=1;row<=n;row++){
        //     // for each row variable column
        //     for(int col=1;col<=row;col++){
        //         System.out.print(col+" ");
        //     }
        //     System.out.println();
        // }

        // Floyd’s Triangle Pattern
        // int n= 5;
        // int count =1;
        // for(int row=1;row<=n;row++){
        //     //for each row variable column
        //     for(int col=1;col<=row;col++){
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        // Alphabet Triangle Pattern
        // int n =5;
        // for(int row=1;row<=n;row++){
        //     // for each row variable column
        //     for(int col=1;col<=row;col++){
        //         int a = col;
        //         int b = ('A'-1);
        //         int ans = a+b;
        //         char finalAns = (char)ans;
        //         System.out.print(finalAns +" ");
        //     }
        //     System.out.println();
        // }

        //  Reverse Alphabet Right-Angle Triangle Pattern
        // int n =5;
        // for(int row=1;row<=n;row++){
        //     // for each row variable column
        //     for(int col=1;col<=row;col++){
        //         int a = n- col;
        //         int b = 'A';
        //         int ans = a+b;
        //         char finalAns = (char)ans;
        //         System.out.print(finalAns +" ");
        //     }
        //     System.out.println();
        // }
        // Symmetric Number Pyramid Pattern

        // int n =4;
        // for(int row=1;row<=n;row++){
        //     //part -1
        //     for(int col=1;col<=n-row;col++){
        //         System.out.print("  ");
        //     }
        //     //part-2
        //     for(int col=1;col<=row;col++){
        //         System.out.print(col +" ");
        //     }
        //     //part -3
        //     int rowValue = row;
        //     int decRowValue = row-1;
        //     for(int col=1;col<=row-1;col++){
        //         System.out.print(decRowValue +" ");
        //         decRowValue--;
        //     }
        //     System.out.println();

        // }

        //Number Pyramid Pattern

        // int n = 4;
        // for(int row=1;row<=n;row++){
        //     //part 1
        //     for(int col=1;col<=n-row;col++){
        //         System.out.print("  ");
        //     }
        //     //part 2
        //     for(int col=1;col<=2*row-1;col++){
        //         System.out.print(row+" ");
        //     }
        //     System.out.println();
        // }

        // Symmetric Alphabet Pyramid Pattern

        int n = 4;
        for(int row=1;row<=n;row++){
            //part 1
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //part 2
            for(int col=1;col<=row;col++){
                int a = col;
                int b = 'A'-1;
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            // part 3
            char toPrint = (char)(row +'A'-2);
            for(int col=1;col<=row-1;col++){
                System.out.print(toPrint+" ");
                toPrint--;
            }
            System.out.println();
        }
    
    }
}
