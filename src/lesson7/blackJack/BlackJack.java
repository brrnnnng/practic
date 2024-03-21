package lesson7.blackJack;

import java.util.ArrayList;

public class BlackJack {
    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    public BlackJack() {
        koloda.prepare();
    }

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayer() {
        for (Player player : players) {
            player.addCardToHand(koloda.randomCard());
            player.addCardToHand(koloda.randomCard());
        }
    }

    public void dealRestCardsToAllPlayers() {
        for (Player player : players) {
            while (player.doYouNeedMoreCards()) {
                player.addCardToHand(koloda.randomCard());
            }
        }
    }

    public void printWinner() {
        for (Player player : players) {
            if (player.countValueInHand() > 21) {
                player.setCanWin(false);
            }
        }

        if (countPlayersWhoCanWin() == 0) {
            for (Player player : players) {
                if (player instanceof Dealer) {
                    System.out.println("Выиграл: " + player.getName());
                    player.openHand();
                    return;
                }
            }
        }
        int winnerValue = 1;
        for (Player player:players){
            if (player.isCanWin() && player.countValueInHand() > winnerValue){
                winnerValue = player.countValueInHand();
            }
        }
        for (Player player:players){
            if (player.countValueInHand() == winnerValue){
                System.out.println("Выиграл: "+ player.getName());
                player.openHand();
            }
        }

    }

    public int countPlayersWhoCanWin() {
        int count = 0;
        for (Player player : players) {
            if (player.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
