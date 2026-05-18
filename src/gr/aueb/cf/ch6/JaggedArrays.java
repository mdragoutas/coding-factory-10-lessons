package gr.aueb.cf.ch6;

/**
 * Πίνακες με διαφορετική διάσταση σε κάθε γραμμή
 */
public class JaggedArrays {

    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][];

        jaggedArr[0] = new int[5];
        jaggedArr[1] = new int[3];
        jaggedArr[2] = new int[10];

        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] row : jaggedArr){
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
