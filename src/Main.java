import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        // task1
        System.out.println("task 1");
        int[] arrays = new int[]{1, 2, 3};
        System.out.print(arrays[2]);

        System.out.println();

        double[] arr = new double[]{1.57, 7.654, 9.986};
        System.out.println(arr[1]);
        boolean[] birthday = new boolean[12];
        birthday[6] = true;
        // июль месяц
        System.out.println(birthday[6]);
    }

    public static void task2() {
        // task2
        System.out.println("task 2");
        int[] arrays = new int[]{1, 2, 3};
        for (int i = 0; i < arrays.length - 1; i++) {
            System.out.print(arrays[i] + ", ");
        }
        System.out.println(arrays[arrays.length - 1]);
        double[] arr = new double[]{1.57, 7.654, 9.986};
        for (int j = 0; j < arr.length - 1; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
        boolean[] birthday = new boolean[12];
        birthday[6] = true;
        // июль месяц
        for (int k = 0; k < birthday.length - 1; k++) {
            System.out.print(birthday[k] + ", ");
        }
        System.out.println(birthday[birthday.length - 1]);
    }

    public static void task3() {
        // task3
        System.out.println("task 3");
        int[] arrays = new int[]{1, 2, 3};
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrays[i] + ", ");
            } else {
                System.out.println(arrays[0]);
            }
        }
        double[] arr = new double[]{1.57, 7.654, 9.986};
        for (int j = arr.length - 1; j >= 0; j--) {
            if (j > 0) {
                System.out.print(arr[j] + ", ");
            } else {
                System.out.println(arr[0]);
            }
        }
        boolean[] birthday = new boolean[12];
        birthday[6] = true;
        // июль месяц
        for (int k = birthday.length - 1; k >= 0; k--) {
            if (k > 0) {
                System.out.print(birthday[k] + ", ");
            } else {
                System.out.println(birthday[0]);
            }
        }
    }
    public static void task4() {
        // task 4
        System.out.println("task 4");
        int [] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

