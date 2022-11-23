import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    public static UnaryOperator<Double> sqrt(int a) {
        UnaryOperator<Double> unaryOperator = new UnaryOperator<Double>() {
            @Override
            public Double apply(Double aDouble) {
                return Math.sqrt(aDouble);
            }
        };
        unaryOperator.apply((double)a);
        return unaryOperator;


    }
}