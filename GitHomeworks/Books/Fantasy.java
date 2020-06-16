public class Fantasy extends Book
{
    public Fantasy(String tittle) {
        super(tittle);
    }

    @Override
    public String toString() {
        return "Fantasy book{" +
                "tittle:'" + getTittle() + '\'' +
                '}';
    }
}
