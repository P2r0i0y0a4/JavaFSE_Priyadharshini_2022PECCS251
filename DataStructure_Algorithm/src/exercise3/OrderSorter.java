package exercise3;
public class OrderSorter {
    // QuickSort entry point
    public static void quickSort(Order[] orders) {
        if (orders == null || orders.length == 0) return;
        quickSort(orders, 0, orders.length - 1);
    }

    // Recursive QuickSort
    private static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(orders, low, high);
            quickSort(orders, low, partitionIndex - 1);
            quickSort(orders, partitionIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                swap(orders, i, j);
            }
        }
        swap(orders, i + 1, high);
        return i + 1;
    }

    // Swap helper method
    private static void swap(Order[] orders, int i, int j) {
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }
}
