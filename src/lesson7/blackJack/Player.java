package lesson7.blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;


    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addCardToHand(Card card) {
        hand.add(card);

    }

    public boolean doYouNeedMoreCards() {
        System.out.println(name + ", Ваши карты: --------");
        openHand();
        System.out.println("-----------");
        System.out.println("Вам нужны еще карты?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")){
            return true;
        }
        return false;
    }

    public void openHand(){
        for (Card card:hand){
            System.out.println(card);
        }
    }

    public int countValueInHand(){
        int count = 0;
     for (Card card:hand){
         count = count + card.getValue();
     }
     return count;
    }
}
