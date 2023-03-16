import java.util.ArrayList;
import java.util.List;

public class LoetudRaamatud extends Nimekiri{
    public LoetudRaamatud() {
        super();
    }

    protected void lisaRaamat(String pealkiri, String autor, int lehekülgi, int hinnang) {
        Raamat uus_raamat = new Raamat(pealkiri, autor, lehekülgi, lehekülgi, hinnang);
        raamatud.add(uus_raamat);
    }

}
