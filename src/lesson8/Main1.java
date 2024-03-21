package lesson8;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите уровень:");
        System.out.println("1 - новичок");
        System.out.println("2 - любитель");
        System.out.println("3 - профессионал");
        System.out.println("4 - особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();

        SaperField saperField = new SaperField(level);

        saperField.addRandomMines();
        saperField.countAndAddNumbers();
        saperField.printField();
        while (saperField.doStep()){
            saperField.printField();
        }

    }
}

