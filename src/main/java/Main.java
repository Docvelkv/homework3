public class Main {
    public static void main(String[] args) {
        System.out.println("**********\nКласс Calculator:");
        System.out.println(Calculator.sum(2.02, 2));
        System.out.println(Calculator.multiply(2, 3f));
        System.out.println(Calculator.divide(2.0f, 0));
        System.out.println(Calculator.divide(20.2f, 3));
        System.out.println(Calculator.subtract(2d, 2L));

        System.out.println("**********\nКласс Comparator:");
        Double[] arr1 = new Double[]{2.0, 3.2, 5.3};
        Double[]arr2 = new Double[]{3.7, 8.5, 3.0};
        Integer[]arr3 = new Integer[]{2, 8, 6};
        String[]arr4 = new String[]{"abc", "bcd", "cde"};
        String[]arr5 = new String[]{"edc", "dcb", "cba"};
        System.out.println(Comparator.compareArrays(arr1, arr2));
        System.out.println(Comparator.compareArrays(arr1, arr3));
        System.out.println(Comparator.compareArrays(arr3, arr4));
        System.out.println(Comparator.compareArrays(arr4, arr5));

        System.out.println("**********\nКласс Pair:");
        Pair<String, Integer> pair1 = new Pair<>("string", 9);
        Pair<Double, Float> pair2 = new Pair<>(2.5, 30.0f);
        System.out.printf("1.%s\n2.%s\n", pair1, pair2);
        int second = pair1.getSecond();
        double first = pair2.getFirst();
        System.out.printf("Второе значение первой пары: %s\n" +
                "Первое значение второй пары: %s", second, first);
    }
}
