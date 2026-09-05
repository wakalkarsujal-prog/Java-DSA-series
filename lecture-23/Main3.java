import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        System.out.println("Before : "+st);
        st.pop();
        System.out.println("After :"+st);
        System.out.println(st.peek());
        System.out.println(st.search(11));
        System.out.println(st.empty());
    }
}
