package lesson2;

public class Main5 {
    public static void main(String[] args) {
        for (int i = 30; i <= 3000; i++){
            if (i % 3 == 0 && i % 6 == 0 && i % 15 ==0){
                System.out.println(i);
            }
        }
    }
}
