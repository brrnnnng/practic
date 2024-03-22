package lesson15;

import java.util.Objects;

public class Coin implements Comparable<Coin> {


    private int nominal;
    private int year;
    private String metall;
    private double diametr;

    public Coin() {
    }

    public Coin(int nominal, int year, String metall, double diametr) {
        this.nominal = nominal;
        this.year = year;
        this.metall = metall;
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", metall='" + metall + '\'' +
                ", diametr=" + diametr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        if (Double.compare(diametr, coin.diametr) != 0) return false;
        return Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + year;
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Coin o) {

        if (this.nominal != o.nominal) {
            return this.nominal - o.nominal;
        }
        if (this.year != o.year) {
            return this.year - o.year;
        }
        if (!this.metall.equals(o.metall)) {
            return this.metall.compareTo(o.metall);
        }
        return Double.compare(this.diametr, o.diametr);
    }
}
