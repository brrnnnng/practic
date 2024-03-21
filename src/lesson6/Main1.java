package lesson6;

public class Main1 {
    public static void main(String[] args) {
        String[][] tours = new String[100][8];
        ToursUtils.addTour("Италия","Рим","Самолет","6 дней","140000 руб",
                "5 звезд","завтрак включен",tours);

        ToursUtils.addTour("Франция","Париж","Поезд","5 дней","160000 руб",
                "4 звезды","завтрак включен",tours);

        ToursUtils.addTour("Испания","Мадрид","Самолет","10 дней","250000 руб",
                "5 звезд","завтрак включен",tours);

        ToursUtils.addTour("Швеция","Стокгольм","Самолет","8 дней","160000 руб",
                "3 звезды","завтрак не включен",tours);

        ToursUtils.addTour("Дания","Копенгаген","Автобус","7 дней","180000 руб",
                "4 звезды","завтрак включен",tours);

        ToursUtils.addTour("Польша","Варшава","Поезд","4 дня","100000 руб",
                "3 звезды","завтрак не включен",tours);

        ToursUtils.addTour("Германия","Берлин","Самолет","11 дней","220000 руб",
                "4 звезды","завтрак включен",tours);

        ToursUtils.addTour("Бельгия","Брюссель","Поезд","9 дней","150000 руб",
                "5 звезд","завтрак включен",tours);


        ScannerUtils.searchByCountry(tours);
        ScannerUtils.searchByBudget(tours);
        ScannerUtils.searchByDay(tours);// туры на кол-во дней
        ScannerUtils.searchByTransporNStar(tours);// туры по звездам и транспорту
        ScannerUtils.searchByCountryrNBudget(tours);// туры страна и бюджет
    }
}
