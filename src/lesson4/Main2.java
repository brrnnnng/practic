package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 5, 6},
                           {3, 5, 7},
                           {8, 9, 0},
                           {1, 3, 6}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
        }
    }
}
