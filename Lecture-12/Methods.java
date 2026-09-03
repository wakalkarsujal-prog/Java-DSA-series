class Methods {

    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }
    static void printSum(int x, int y){
        int sum = x+y;
        System.out.println("Sum is "+ sum);
    }
    static void printMultiplication(int a, int b){
        int ans = a*b;
        System.out.println("result "+ ans);

    }
    // non void method
    // methods with same name
    static int add(int p, int q){
        int sum = p+q;
        return sum;
    }
    static int add(int p, int q, int r){
        int ans = p+q+r;
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println("hi");
        // printTable();
        // System.out.println("bye");
        // printSum(10,20);
        // printMultiplication(2, 4);

        // int result = add(10,20);
        int ans1 = add(1,2);
        int ans2 = add(1,2,3);
        System.out.println("ans1 "+ ans1);
        System.out.println("ans2 "+ ans2);
    }
}