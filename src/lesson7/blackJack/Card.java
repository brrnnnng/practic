package lesson7.blackJack;

import java.util.Objects;

public class Card {
    private String nominal;
    private int value;

    public Card() {

    }

    public Card(String nominal, int value) {
        this.nominal = nominal;
        this.value = value;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        return Objects.equals(nominal, card.nominal);
    }

    @Override
    public int hashCode() {
        int result = nominal != null ? nominal.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return nominal;
    }
}

