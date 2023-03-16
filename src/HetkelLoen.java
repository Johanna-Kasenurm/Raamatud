public class HetkelLoen extends Nimekiri {
    public Raamat lugesinJuurde(String pealkiri, int lehekülgi) {
        for (Raamat raamat : raamatud) {
            if (raamat.getPealkiri().equals(pealkiri)) {
                int lk_arv = raamat.getLoetudLehekülgi() + lehekülgi;
                raamat.setLoetudLehekülgi(lk_arv);
                return raamat;
            }
        }
        return null;
    }
}
