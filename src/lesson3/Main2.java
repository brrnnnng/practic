package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {3,4,6,7,4,4,3,5,6,8,7,5};

        for (int i = numbers.length - 1; i >= 0; i--){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
