package lesson11;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] editions = new PrintEdition[6];
        editions[0] = new Book("Война и мир", 1950, 450, "Россия", "Лев Толстой");
        editions[1] = new Book("Тихий Дон", 1951, 400, "Россия", "Пушной");
        editions[2] = new Book("Муму", 1952, 500, "Россия", "Достоевсикй");
        editions[3] = new Magazine("Бурда", 2020, 100 , "Россия",20);
        editions[4] = new Magazine("Белеберда", 2010, 150 , "Россия",10);
        editions[5] = new Magazine("Чехорда", 2000, 200 , "Россия",30);


        for (PrintEdition currentEdition:editions){
            System.out.println(currentEdition.toString());
        }
    }

    public static void printBiggestEdition (PrintEdition[] editions){

    }
}
