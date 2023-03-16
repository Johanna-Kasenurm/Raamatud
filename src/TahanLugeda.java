import java.util.ArrayList;
import java.util.List;

public class TahanLugeda extends Nimekiri{
    public TahanLugeda() {
        List<Raamat> raamatud = new ArrayList<Raamat>();
    }

    protected void lisaRaamat(String pealkiri, String autor, int lehekülgi) {
        super.lisaRaamat(pealkiri, autor, lehekülgi, 0);
    }
}
