// Invertendo um array sem usar outro array

public class InvertendoArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Original: ");
        for (int v : array)
            System.out.print(v + " ");

        // Inversão in-place
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.print("\nInvertido: ");
        for (int v : array)
            System.out.print(v + " ");
    }
}