package lesson6;

import java.util.Scanner;

public class ScannerUtils {


    public static void searchByCountry(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую странну хотите поехать ?");
        String country = scanner.next();
        System.out.println("-----РЕЗУЛЬТАТ-----");
        ToursUtils.printTourByCountry(tours, country);
        System.out.println("-------------");
    }
    // поиск туров по бюджету
    public static void searchByBudget(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какой бюджет рассчитываете ?");
        int budget = scanner.nextInt();
        System.out.println("-----РЕЗУЛЬТАТ-----");
        ToursUtils.printTourByBudget(tours,budget);
        System.out.println("---------------");
    }
    // поиск туров по кол-ву дней

    public static void searchByDay (String[][]tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какое количество дней хотите поехать ?");
        int days = scanner.nextInt();
        System.out.println("-----РЕЗУЛЬТАТ-----");
        ToursUtils.printTourByDay(tours,days);
        System.out.println("---------------");
    }
    public static void searchByTransporNStar(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerT = new Scanner(System.in);
        System.out.println("Каким транспортом хотите добраться и на какое количество звезд расчитываете ?");
        String transport = scanner.next();
        int star = scannerT.nextInt();
        System.out.println("-----РЕЗУЛЬТАТ-----");
        ToursUtils.printTourByTransporNStar(tours, transport, star);
        System.out.println("-------------");


    }
    public static void searchByCountryrNBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerT = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать и каким бюджетом распологаете ?");
        String country = scanner.next();
        int budget = scannerT.nextInt();
        System.out.println("-----РЕЗУЛЬТАТ-----");
        ToursUtils.printTourByCountryNBudget(tours, country, budget);
        System.out.println("-------------");


    }
}
