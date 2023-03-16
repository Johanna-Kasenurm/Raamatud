import java.util.ArrayList;
import java.util.List;

public class Lugeja {

    private String nimi;
    private LoetudRaamatud loetudRaamatud = new LoetudRaamatud();
    private TahanLugeda tahanLugeda = new TahanLugeda();
    private HetkelLoen hetkelLoen = new HetkelLoen();

    public Lugeja(String nimi){
        this.nimi = nimi;
    }

    public void hakkanLugema(Raamat raamat){
        if (tahanLugeda.raamatud.contains(raamat)) tahanLugeda.eemaldaRaamat(raamat);
        hetkelLoen.lisaRaamat(raamat);
    }

    public void lugesinLõpuni(Raamat raamat){
        hetkelLoen.eemaldaRaamat(raamat);
        loetudRaamatud.lisaRaamat(raamat);
    }




}
