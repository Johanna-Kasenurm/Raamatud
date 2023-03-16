import java.util.ArrayList;
import java.util.List;

public class Lugeja {

    private String nimi;
    private LoetudRaamatud loetudRaamatud;
    private TahanLugeda tahanLugeda;
    private HetkelLoen hetkelLoen;

    public Lugeja(String nimi, LoetudRaamatud loetud, TahanLugeda tahan, HetkelLoen loen){
        this.nimi = nimi;
        loetudRaamatud = loetud;
        tahanLugeda = tahan;
        hetkelLoen = loen;
    }

    public void hakkanLugema(Raamat raamat){
        if (tahanLugeda.raamatud.contains(raamat)) tahanLugeda.eemaldaRaamat(raamat);
        hetkelLoen.lisaRaamat(raamat);
    }

    public void lugesinLõpuni(Raamat raamat){
        hetkelLoen.eemaldaRaamat(raamat);
        loetudRaamatud.lisaRaamat(raamat);
    }

    public String toString() {
        int hetkel = (hetkelLoen.raamatud == null ? 0 : hetkelLoen.raamatud.size());
        int loetud = (loetudRaamatud.raamatud == null ? 0 : loetudRaamatud.raamatud.size());
        int tahan = (tahanLugeda.raamatud == null ? 0 : tahanLugeda.raamatud.size());

        return "Lugeja " + nimi + "\nHetkel lugemisel: " + hetkel + "\nLoetud raamatuid: " +
                loetud + "\nTahan lugeda: " + tahan;
    }


}
