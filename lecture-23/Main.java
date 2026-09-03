import java.util.*;

public class Main{
    public static void main(String[] args){
        // List orr Collection -> interface

        //ArrayList -> concrete class
        ArrayList<Integer> arr = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        // add
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);

        // remove
        arr.remove(0);
        System.out.println(arr);

        //addAll()
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(101);
        arr2.add(102);

        arr.addAll(arr2);
        System.out.println(arr);

        //removeAll()
        arr.removeAll(arr2);
        System.out.println(arr);

        //size
        System.out.println(arr.size());

        // clear
        System.out.println("printing arr2 : "+arr2);
        arr2.clear();
        System.out.println(arr2.size());

        //Iterator = i want to traverse list using iterator
        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println("Element : "+ iterator.next());
        }

        // get()
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(11);
        arr3.add(12);
        arr3.add(13);
        System.out.println(arr3.get(0));

        //set()
        System.out.println("before set : "+ arr3);
        arr3.set(0,100);
        System.out.println("After set : "+ arr3);

        //toArray
        Object[] arr4 = arr3.toArray();
        for(Object obj:arr4){
            System.out.println(obj);
        }

        // contains()
        System.out.println(arr3.contains(100));
        System.out.println(arr3.contains(1000));

        // sort()
        arr.add(12);
        arr.add(6);
        System.out.println("Printing the Entire list : "+ arr);

        Collections.sort(arr);
        System.out.println("Sorted list : "+arr);

        // HW question how can we sort in descending order

        // clone()
        ArrayList<Integer> newarr = (ArrayList<Integer>)arr.clone();
        System.out.println("Printing Entire list : "+ newarr);
        
        //ensureCapacity()
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty()
        System.out.println(newarr.isEmpty());
        System.out.println(marks.isEmpty());

        //indexOf()
        System.out.println(newarr.indexOf(40));
    }
}