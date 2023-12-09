package Excs;

public class Book {
    private String name;
    private int yearPublish;
    private int nrPges;


    public Book(String name, int yearPublish, int nrPges) {
        this.name = name;
        this.yearPublish = yearPublish;
        this.nrPges = nrPges;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setNrPges(int nrPges) {
        this.nrPges = nrPges;
    }

    public String getName() {
        return name;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public int getNrPges() {
        return nrPges;
    }


}
