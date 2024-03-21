package lesson4;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        for (int year = 0; year < 10; year++) {
            for (int month = 0; month < 12; month++) {
                for (int day = 0; day < 31; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        for (int minute = 0; minute < 60; minute++) {
                            for (int second = 0; second < 60; second++) {
                                System.out.printf("Со старта прошло: %d года, %d месяца, %d дня, %d часов," +
                                        " %d минут, %d секунд \n", year,month,day,hour,minute,second);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }
    }
}
