import java.util.ArrayList;
import java.util.List;

public class LoetudRaamatud extends Nimekiri{
    public LoetudRaamatud() {
        List<Raamat> raamatud = new ArrayList<Raamat>();
    }

    protected void lisaRaamat(String pealkiri, String autor, int lehekülgi, int loetudLehekülgi, int hinnang) {
        Raamat uus_raamat = new Raamat(pealkiri, autor, lehekülgi, loetudLehekülgi, hinnang);
        raamatud.add(uus_raamat);
    }

}
