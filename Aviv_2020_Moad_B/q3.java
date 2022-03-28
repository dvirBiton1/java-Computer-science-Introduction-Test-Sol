package Aviv_2020_Moad_B;

public class q3 {

    public static int[] interlace(int[] a, int b[]) {
        int lenA = a.length;
        int lenB = b.length;
        int[] arr = new int[lenA + lenB];
        if (lenA >= lenB) {
            int i = 0;
            for (int j = 0; j < lenB; i++) {
                if (i % 2 == 0) {
                    arr[i] = a[j];
                } else {
                    arr[i] = b[j];
                    j++;
                }
            }
            for (int k = 0; k < lenA - lenB; i++, k++) {
                arr[i] = a[lenB + k];
            }
        } else {
            int i = 0;
            for (int j = 0; j < lenA; i++) {
                if (i % 2 == 0) {
                    arr[i] = a[j];
                } else {
                    arr[i] = b[j];
                    j++;
                }
            }
            for (int k = 0; k < lenB - lenA; i++, k++) {
                arr[i] = b[lenA + k];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -8, 5};
        int[] arr2 = {2, 6, 4};
        int[] arr3 = interlace(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ",");
        }
        System.out.println();
        int[] arr4 = {1, 3, 5, 7, 9};
        int[] arr5 = {2, 4, 6};
        int[] arr6 = interlace(arr4, arr5);
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + ",");
        }

    }

}
