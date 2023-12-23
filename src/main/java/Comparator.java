public class Comparator {
    public static <T> boolean compareArrays(T [] array1, T [] array2){
            return array1.getClass().equals(array2.getClass());
    }
}
