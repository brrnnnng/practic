package lesson6;

public class ToursUtils {

    //создадим метод который будет сохранять один тур в духмерный массив
    public static void addTour(String country, String city, String transport, String day,
                               String cost, String stars, String food, String[][] tours) {

        for (int i = 0; i < tours.length; i++) {

            if (tours[i][0] == null) {
                tours[i][0] = (i + 1) + "";
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = day;
                tours[i][5] = cost;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;
            }
        }
    }

    public static void printTourByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)) {
                System.out.printf("Тур N%s , %s (%s), на %s , %s, %s , %s, цена %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3], tours[i][6], tours[i][7], tours[i][5]);

            }


        }

    }

    public static void printTourByBudget(String[][] tours, int budget) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {

                int spaceIndex = tours[i][5].indexOf(" ");
                String priceStr = tours[i][5].substring(0, spaceIndex);
                int priceTour = Integer.parseInt(priceStr);


                int maxBudget = budget + 20000;
                int minBudget = budget - 20000;
                if (priceTour >= minBudget && priceTour <= maxBudget) {
                    System.out.printf("Тур N%s , %s (%s), на %s , %s, %s , %s, цена %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3], tours[i][6], tours[i][7], tours[i][5]);

                }

            }

        }
    }

    public static void printTourByDay(String[][] tours, int day) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {
                int spaceIndex = tours[i][4].indexOf(" ");
                String dayStr = tours[i][4].substring(0, spaceIndex);
                int dayTour = Integer.parseInt(dayStr);

                int maxDay = day + 1;
                int minDay = day - 1;

                if (dayTour >= minDay && dayTour <= maxDay) {
                    System.out.printf("Тур N%s , %s (%s), на %s , %s, %s , %s, цена %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3], tours[i][6], tours[i][7], tours[i][5]);
                }


            }
        }
    }

    public static void printTourByTransporNStar(String[][] tours, String transport, int star) {
        for (int i = 0; i < tours.length; i++) {


            if (tours[i][0] != null && tours[i][3].equalsIgnoreCase(transport)) {
                if (tours[i][0] != null) {
                    int spaceIndex = tours[i][6].indexOf(" ");
                    String starStr = tours[i][6].substring(0, spaceIndex);
                    int starTour = Integer.parseInt(starStr);

//                    int minStar = star - 1;
//                    int maxStar = star + 1;
                    if (starTour == star) {

                        System.out.printf("Тур N%s , %s (%s), на %s , %s, %s , %s, цена %s \n",
                                tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3], tours[i][6], tours[i][7], tours[i][5]);

                    }

                }
            }
        }
    }

    public static void printTourByCountryNBudget(String[][] tours, String country, int budget) {
        for (int i = 0; i < tours.length; i++) {

            if (tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)) {
                if (tours[i][0] != null) {


                    int spaceIndex = tours[i][5].indexOf(" ");
                    String priceStr = tours[i][5].substring(0, spaceIndex);
                    int priceTour = Integer.parseInt(priceStr);


                    int maxBudget = budget + 20000;
                    int minBudget = budget - 20000;
                    if (priceTour >= minBudget && priceTour <= maxBudget) {


                        System.out.printf("Тур N%s , %s (%s), на %s , %s, %s , %s, цена %s \n",
                                tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3], tours[i][6], tours[i][7], tours[i][5]);

                    }


                }

            }
        }

    }
}