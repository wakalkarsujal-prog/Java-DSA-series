import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        // Create a Integer type LinkedList
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(30);
        // list.add(30);
        // System.out.println("print linkedList : "+ list);
        // System.out.println(list.indexOf(20));
        // // lastIndexOf -> returns the index of the last occurrenec of the element 
        // System.out.println(list.lastIndexOf(30));

        // LinkedList as queue and deque
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(20);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.peek());
        // pll()
        System.out.println("Before : "+ ll);
        System.out.println("pooling : "+ ll.poll());
        System.out.println("After : "+ ll);
        //offer()
         
    }
}
