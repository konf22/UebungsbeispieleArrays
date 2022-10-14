public class ReverseArray {

    public static void main(String[] args) {
        String[] input = {"Hallo", "Max", "Mustermann", "!", "Wie", "geht", "es", "dir", "?"};

        System.out.print("Input: ");
        for (int i = 0; i < input.length; i++) {
            String output = input[i];
            System.out.print(output +  " ");
        }

        System.out.println();
        System.out.print("Reversed: ");
        String[] reversed = reverseArray(input);
        for (int i = 0; i < reversed.length; i++) {
            String output = reversed[i];
            System.out.print(output +  " ");
        }

        System.out.println();
        System.out.print("Reversed with While: ");
        reversed = reverseArrayWithWhile(input);
        for (int i = 0; i < reversed.length; i++) {
            String output = reversed[i];
            System.out.print(output +  " ");
        }

    }

    public static String[] reverseArray(String[] arrayToReverse) {
        String[] reversed = new String[arrayToReverse.length];
        for (int i = arrayToReverse.length - 1, j = 0; i >= 0; i--, j++) {
            String text = arrayToReverse[i];
            reversed[j] = text;
        }
        return reversed;
    }

    public static String[] reverseArrayWithWhile(String[] arrayToReverse) {
        String[] reversed = new String[arrayToReverse.length];
        int reversedArrayIndex = 0;
        int arrayToReverseIndex = arrayToReverse.length - 1;

        while (arrayToReverseIndex >= 0) {
            String text = arrayToReverse[arrayToReverseIndex];
            reversed[reversedArrayIndex] = text;
            arrayToReverseIndex--;
            reversedArrayIndex++;
        }
        return reversed;
    }
}
