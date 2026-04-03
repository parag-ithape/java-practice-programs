package javaPrograms;

public class MoveZeroElementToEnd 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 5, 0, 8, 7, 0, 5, 0, 3, 0}; // Input array
        boolean moveZerosToEnd = true; // Set to true to move zeros to the end, false to move them to the beginning

        if (moveZerosToEnd) {
            int index = 0; // Position to place non-zero elements
            // Move all non-zero elements forward
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index++] = arr[i];
                }
            }
            // Fill remaining positions with zeros
            while (index < arr.length) {
                arr[index++] = 0;
            }
        } else {
            int index = arr.length - 1; // Position to place non-zero elements
            // Move all non-zero elements backward
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 0) {
                    arr[index--] = arr[i];
                }
            }
            // Fill remaining positions with zeros
            while (index >= 0) {
                arr[index--] = 0;
            }
        }

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
