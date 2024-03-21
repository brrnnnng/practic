package lesson11;

import java.util.Objects;

public class PrintEdition {
    private String name;
    private int year;
    private int page;
    private String izdatelstvo;

    public PrintEdition() {
    }

    public PrintEdition(String name, int year, int page, String izdatelstvo) {
        this.name = name;
        this.year = year;
        this.page = page;
        this.izdatelstvo = izdatelstvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (year != that.year) return false;
        if (page != that.page) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(izdatelstvo, that.izdatelstvo);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + page;
        result = 31 * result + (izdatelstvo != null ? izdatelstvo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintEdition{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", page=" + page +
                ", izdatelstvo='" + izdatelstvo + '\'' +
                '}';
    }
}
