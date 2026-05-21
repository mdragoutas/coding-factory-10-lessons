package gr.aueb.cf.java.ch6;

/**
 *
 */
public class SwapWithArray {

    public static void main(String[] args) {

        int[] arr = {10, 20};

        System.out.println("Πριν το swap: arr[0] = " + arr[0]);
        System.out.println("Πριν το swap: arr[1] = " + arr[1]);
        swap(arr);
        System.out.println();
        System.out.println("Μετά το swap: arr[0] = " + arr[0]);
        System.out.println("Μετά το swap: arr[1] = " + arr[1]);

    }

    public static void swap(int[] arr) {
        if (arr == null) return;
        if (arr.length != 2) return;
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
