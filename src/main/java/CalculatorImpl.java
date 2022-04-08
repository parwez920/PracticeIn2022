import jdk.jshell.spi.ExecutionControl;

interface Calculator{

    //void swithOn();
    //void sum(int input);
    int substraction(int i1, int i2);

}

public class CalculatorImpl {
    public static void main(String[] args) {
        //  ()   -> {body}    java 8

//        Calculator calculator=() ->System.out.println("some msg");
//        calculator.swithOn();
//        Calculator calculator=(input) -> System.out.println("sum of number "+ input);
//        calculator.sum(321);
        Calculator calculator=(i1,i2)->{
            if(i2<i1){
                throw new RuntimeException("messages");
            }else{
                return i2-i1;
            }
        };
        System.out.println(calculator.substraction(8,20));

    }
}
