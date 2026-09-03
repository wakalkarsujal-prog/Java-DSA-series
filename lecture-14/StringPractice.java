public class StringPractice{

    // print each character of a string
        static void printString(String str){
            int n = str.length();
            for(int i=0;i<n;i++){
                char ch = str.charAt(i);
                System.out.println(ch);
            }
        }

    // count length of string without length()
    static int getLengthOfString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }
    public static void main(String[] args){
        String str = "LOVE";
        //printString(str);
        System.out.println(getLengthOfString(str));
    }
}