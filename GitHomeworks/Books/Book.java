public class Book extends Item {


    private String tittle;



    public Book(String tittle){
        this.tittle=tittle;

    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle:'" + tittle + '\'' +
                '}';
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
