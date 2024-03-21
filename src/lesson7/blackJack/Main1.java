package lesson7.blackJack;

public class Main1 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Dealer dealer = new Dealer();

        player1.setName("Vasya");
        player2.setName("Petya");
        player3.setName("Kolya");
        dealer.setName("Krup'e");

        BlackJack blackJack = new BlackJack();
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayer();
        blackJack.dealRestCardsToAllPlayers();


        blackJack.printWinner();



    }
}
