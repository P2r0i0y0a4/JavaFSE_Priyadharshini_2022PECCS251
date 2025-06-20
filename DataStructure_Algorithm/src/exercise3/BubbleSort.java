package exercise3;
public class BubbleSort {

    /**
     * Sorts an array of Order objects in ascending order by totalPrice using Bubble Sort
     * @param orders The array of Order objects to be sorted
     */
    public static void bubbleSort(Order[] orders) {
        // Check for null or empty array
        if (orders == null || orders.length <= 1) {
            return;
        }

        int n = orders.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap if they're in the wrong order
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swaps occurred in inner loop, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Helper method to swap two elements in an array
     * @param orders The array containing the elements
     * @param i Index of first element
     * @param j Index of second element
     */
    private static void swap(Order[] orders, int i, int j) {
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }
}
