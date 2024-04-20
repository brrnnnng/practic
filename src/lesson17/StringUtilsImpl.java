package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        if (num2 == 0) {
            throw new ArithmeticException("на ноль делить нельзя");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word == null");
        }
        List<Integer> indices = new ArrayList<>();
        int index = text.indexOf(word);

        while (index >= 0) {
            indices.add(index);
            index = text.indexOf(word, index + 1);
        }
        return indices.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {

        if (text == null){
            throw new CustomException("text == null");
        }

        List<Double> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            try {
                numbers.add(Double.parseDouble(matcher.group()));
            }catch (NumberFormatException e){
                throw new CustomException("Error parsing number: "+ e.getMessage());
            }
        }
        if (numbers.isEmpty()){
            throw new CustomException("not found");
        }
        return numbers.stream().mapToDouble(Double::doubleValue).toArray();


    }
}
