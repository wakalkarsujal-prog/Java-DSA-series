public class Methods2{
    static void printMessage(){
        System.out.println("Welcome to java Programming");
    }
    // Sum method
    static int printSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    // check no is even 
    static boolean isEven(int i){
        if(i%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    // method that returns the larger no.
    static void getLargerNumber(int p, int q){
        if(p>q){
            System.out.println("p is larger");
        }else{
            System.out.println("q is larger");
        }
    }
    // method that calculate percentage
    static double calculatePercentage(double obtained,double total){
        return(obtained/total)*100;
    }
    public static void main(String[] args){
        printMessage();
        int ans = printSum(10,20);
        System.out.println("Sum is : "+ans);
        boolean ans2 = isEven(10);
        System.out.println("No. is "+ ans2);
        getLargerNumber(10,20);
        double result = calculatePercentage(53,100);
        System.out.println(result);
    }
}