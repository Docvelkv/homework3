public class Calculator {
    public static <T extends Number> double sum(T value1, T value2){
        return value1.doubleValue() + value2.doubleValue();
    }

    public static <T extends Number> double multiply(T value1, T value2){
        return value1.doubleValue() * value2.doubleValue();
    }

    public static <T extends Number> double divide(T value1, T value2) {
        try {
            if (value2.doubleValue() == 0)
                System.out.print("Делить на ноль нельзя. ");
        }catch (ArithmeticException ex){
            System.err.print(ex.getMessage());
        }
        return value1.doubleValue() / value2.doubleValue();
    }

    public static <T extends Number> double subtract(T value1, T value2){
        return value1.doubleValue() - value2.doubleValue();
    }
}
