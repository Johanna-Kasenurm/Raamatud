import java.util.ArrayList;
import java.util.List;

public class Nimekiri {
    protected List<Raamat> raamatud;

    //Konstruktor
    public Nimekiri() {
        List<Raamat> raamatud = new ArrayList<>();
    }

    protected void lisaRaamat(String pealkiri, String autor, int lehekülgi, int loetudLehekülgi) {
        Raamat uus_raamat = new Raamat(pealkiri, autor, lehekülgi, loetudLehekülgi);
        raamatud.add(uus_raamat);
    }

    protected void lisaRaamat(Raamat uus_raamat) {
        raamatud.add(uus_raamat);
    }
}
