public class MinimumNumberForList {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("before swoppring value of a ="+a +" and b= " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a +" b ="+b);

    }
}
