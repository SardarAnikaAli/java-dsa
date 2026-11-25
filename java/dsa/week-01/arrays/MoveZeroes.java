import java.util.Arrays;
public class MoveZeroes
{
    static void moveZeroes(int[] a) {
        int position = 0;
        // Move all non-zero elements to the beginning
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[position] = a[i];
                // Avoid erasing an element when both indices are same
                if (position != i) {
                    a[i] = 0;
                }
                position++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0, 5, 0, 2, 8};
        System.out.println("The original array is:");
        System.out.println(Arrays.toString(a));

        moveZeroes(a);

        System.out.println("The updated array is:");
        System.out.println(Arrays.toString(a));
    }
}
