import java.util.*;

public class StringBasics{
    public static void main(String[] args){
        // String firstName = "Sujal";
        // String lastName = new String("wakalkar");
        // System.out.println(firstName +" "+ lastName);

        // String are Immutable
        // String name = "Rana";
        // //name[0]='B';
        // name = "Bana";
        // System.out.println(name);

        // String Input

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string content : ");
        String str = sc.nextLine();
        System.out.println("Value of nextLine:" +str );
        System.out.println("provide the string content : ");
        String str2 = sc.next();
        System.out.println("value of next : "+ str2);

    }
}