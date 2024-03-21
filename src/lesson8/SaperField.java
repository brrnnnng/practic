package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] fieldWithMines;
    private int countMines = 0;
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWim = 0;

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("новичок")) {
            fieldWithMines = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean[9 + 2][9 + 2];
            countMines = 10;
            countClosedCellsToWim = countMines + ((9 + 9) * 2) + 4;
        }

        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fieldWithMines = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countMines = 40;
            countClosedCellsToWim = countMines + ((16 + 16) * 2) + 4;
        }

        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fieldWithMines = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean[16 + 2][32 + 2];
            countMines = 99;
            countClosedCellsToWim = countMines + ((16 + 32) * 2) + 4;
        }

        if (level.equals("4") || level.equalsIgnoreCase("особый")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите колличество строк:");
            int row = scanner.nextInt();

            System.out.println("Введите колличество колонок:");
            int col = scanner.nextInt();

            System.out.println("Введите колличество мин:");
            countMines = scanner.nextInt();

            fieldWithMines = new int[row + 2][col + 2];
            fieldToOpen = new boolean[row + 2][col + 2];
            countClosedCellsToWim = countMines + ((row + col) * 2) + 4;
        }
    }

    public void addRandomMines() {
        for (int i = 0; i < countMines; i++) {
            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMines.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMines[0].length - 1);
            if (fieldWithMines[row][col] != -1) {
                fieldWithMines[row][col] = -1;
            } else {
                i--;
            }

        }
    }

    public void countAndAddNumbers() {
        for (int i = 0; i < fieldWithMines.length; i++) {
            for (int j = 0; j < fieldWithMines[0].length; j++) {

                if (fieldWithMines[i][j] == -1) {
                    if (fieldWithMines[i - 1][j - 1] != -1) {
                        fieldWithMines[i - 1][j - 1] = fieldWithMines[i - 1][j - 1] + 1;
                    }
                    if (fieldWithMines[i - 1][j] != -1) {
                        fieldWithMines[i - 1][j] = fieldWithMines[i - 1][j] + 1;
                    }
                    if (fieldWithMines[i - 1][j + 1] != -1) {
                        fieldWithMines[i - 1][j + 1] = fieldWithMines[i - 1][j + 1] + 1;
                    }
                    if (fieldWithMines[i + 1][j + 1] != -1) {
                        fieldWithMines[i + 1][j + 1] = fieldWithMines[i + 1][j + 1] + 1;
                    }
                    if (fieldWithMines[i][j - 1] != -1) {
                        fieldWithMines[i][j - 1] = fieldWithMines[i][j - 1] + 1;
                    }
                    if (fieldWithMines[i + 1][j - 1] != -1) {
                        fieldWithMines[i + 1][j - 1] = fieldWithMines[i + 1][j - 1] + 1;
                    }
                    if (fieldWithMines[i + 1][j] != -1) {
                        fieldWithMines[i + 1][j] = fieldWithMines[i + 1][j] + 1;
                    }
                    if (fieldWithMines[i][j + 1] != -1) {
                        fieldWithMines[i][j + 1] = fieldWithMines[i][j + 1] + 1;
                    }

                }

            }
        }

    }

    public void printField() {
        System.out.println("-------Ваше поле:------");
        for (int i = 1; i < fieldWithMines.length - 1; i++) {
            for (int j = 1; j < fieldWithMines[0].length - 1; j++) {
                if (fieldToOpen[i][j] == true) {
                    System.out.print(fieldWithMines[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public void printFieldEndGame() {
        System.out.println("-------Ваше поле:------");
        for (int i = 1; i < fieldWithMines.length - 1; i++) {
            for (int j = 1; j < fieldWithMines[0].length - 1; j++) {
                if (fieldToOpen[i][j] == true || fieldWithMines[i][j] == -1) {
                    System.out.print(fieldWithMines[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public boolean doStep() {

        if (countClosedCellsToWim == this.countClosedCells()){
            System.out.println("Вы выиграли");
            this.printFieldEndGame();
            return  false;
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберите строку:");
        int row = scanner.nextInt();

        System.out.println("Выберите колонку:");
        int col = scanner.nextInt();

        if (row <= 0 || row > fieldWithMines.length - 1 || col <= 0 || col > fieldWithMines[0].length - 1) {
            System.out.println("Повторите ввод. Неверные индексы");
            this.doStep();
        }

        if (fieldWithMines[row][col] == -1) {
            System.out.println("Вы проиграли");
            this.printFieldEndGame();
            return false;


        } else {
            fieldToOpen[row][col] = true;
            return true;

        }


    }

    private int countClosedCells() {
        int count = 0;
        for (int i = 0; i < fieldToOpen.length; i++) {
            for (int j = 0; j < fieldToOpen.length; j++){
                if (fieldToOpen[i][j]==false){
                    count++;
                }
            }
        }
        return count;
    }


}
