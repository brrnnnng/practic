package lesson4;

public class Main4 {
    public static void main(String[] args) {
        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" 1 " + " ");
                }


            }
            System.out.println();
        }
    }
}