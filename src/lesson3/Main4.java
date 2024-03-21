package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers ={45,43,9,7,6,7,8,2};

        for (int i = 0; i < numbers.length; i++){
            if (i != numbers.length - 1){

                if (numbers[i] % 3 == 0){
                    System.out.println(numbers[i + 1]);
                }
            }

        }
    }
}
