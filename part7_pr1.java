public class part7_pr1 {
    public static <A> void printArray(A[] inputArray) {

        for (A element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String []args) {


        Integer[] intArray = { 6, 7, 8, 9, 10 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'K', 'A', 'B', 'I', 'R' };

        System.out.println("integerArray :");
        printArray(intArray);

        System.out.println("doubleArray :");
        printArray(doubleArray);

        System.out.println("characterArray :");
        printArray(charArray);
        System.out.println("PREPARED BY 21CE080-KABIR NAVADIYA");

    }
}
