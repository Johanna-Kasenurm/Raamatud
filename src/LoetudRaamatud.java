public class LoetudRaamatud extends Nimekiri{

    protected void lisaRaamat(String pealkiri, String autor, int lehekülgi, int loetudLehekülgi, int hinnang) {
        Raamat uus_raamat = new Raamat(pealkiri, autor, lehekülgi, loetudLehekülgi, hinnang);
        raamatud.add(uus_raamat);
    }
}
