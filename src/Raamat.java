public class Raamat implements Comparable<Raamat> {
    private String pealkiri;
    private String autor;
    private int lehekülgi;
    private int loetudLehekülgi;
    private int hinnang;

    public Raamat(String pealkiri, String autor, int lehekülgi, int loetudLehekülgi) {
        this.pealkiri = pealkiri;
        this.autor = autor;
        this.lehekülgi = lehekülgi;
        this.loetudLehekülgi = loetudLehekülgi;
    }

    public Raamat(String pealkiri, String autor, int lehekülgi, int loetudLehekülgi, int hinnang) {
        this.pealkiri = pealkiri;
        this.autor = autor;
        this.lehekülgi = lehekülgi;
        this.loetudLehekülgi = loetudLehekülgi;
        this.hinnang = hinnang;
    }

    public int compareTo(Raamat võrreldav){
        if (lehekülgi > võrreldav.lehekülgi) return 1;
        if (lehekülgi < võrreldav.lehekülgi) return -1;
        return 0;
    }

    public void lugesinLehekülgi(int lehekülgiJuurde) {
        loetudLehekülgi += lehekülgiJuurde;
    }

    public String getPealkiri() {
        return pealkiri;
    }

    public String getAutor() {
        return autor;
    }

    public int getLehekülgi() {
        return lehekülgi;
    }

    public int getLoetudLehekülgi() {
        return loetudLehekülgi;
    }
}
