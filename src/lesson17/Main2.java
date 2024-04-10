package lesson17;

public class Main2 {
    public static void main(String[] args) {
        StringUtilsImpl stringUtilsimpl = new StringUtilsImpl();
        String num1 = "10";
        String num2 = "0";

        try {
            double result = stringUtilsimpl.div(num1,num2);
            System.out.println("результат: "+result);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
