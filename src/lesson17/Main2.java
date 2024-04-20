package lesson17;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        StringUtilsImpl stringUtilsimpl = new StringUtilsImpl();
        String num1 = "10";
        String num2 = "0";

        try {
            double result = stringUtilsimpl.div(num1, num2);
            System.out.println("результат: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
//
        StringUtilsImpl wordFinder = new StringUtilsImpl();
        String text = "У лукоморья дуб зеленый";
        String word = "дб";

        try {
            int[] indices = wordFinder.findWord(text, word);

            if (indices.length == 0) {
                System.out.println("слово не найдено");
            } else {
                System.out.println("слово найдено по индексу: ");
                for (int index : indices) {
                    System.out.print(index + " ");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
//
        StringUtilsImpl numbFinder = new StringUtilsImpl();
        String text = "у лукоморья 12345 дуба";

        try {
            double[] numbers = numbFinder.findNumbers(text);

            for (double number : numbers) {
                System.out.println(number);
            }
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());

        }

    }
}

