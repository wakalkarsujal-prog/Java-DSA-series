import java.util.*;
public class takingInput2D {
    public static void main(String[] args){

        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println("Provide value for row="+i+"and column="+j);
                arr[i][j]=sc.nextInt();
            }
        }
        // print
        for(int row=0;row<=arr.length-1;row++){
            for(int col=0;col<=arr[row].length-1;col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }
    }
}
