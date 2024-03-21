package lesson11;

public class Magazine extends PrintEdition{
    private int number;


    public Magazine() {

    }

    public Magazine(String name, int year, int page, String izdatelstvo, int number) {
        super(name, year, page, izdatelstvo);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        return number == magazine.number;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Magazine{ Название " + getName() + ", кол-во страниц:" + getPage() +
                "номер выпуска = " + number + "Издательство:" + getIzdatelstvo() + "Год выпуска: " + getYear() + "}";

    }
}
