import javax.swing.*;

public class RaamatuProgramm {
    public static void main(String[] args) {
        LoetudRaamatud loetudRaamatud = new LoetudRaamatud();
        TahanLugeda tahanLugeda = new TahanLugeda();
        HetkelLoen hetkelLoen = new HetkelLoen();

        String nimi = JOptionPane.showInputDialog(null, "Sisestage oma nimi ", "Andmete sisestamine",
                JOptionPane.QUESTION_MESSAGE);
        Lugeja lugeja = new Lugeja(nimi, loetudRaamatud, tahanLugeda, hetkelLoen);
        String[] tegevused = {"Lisan raamatu", "Lisan lehekülgi", "Hakkasin lugema", "Lugesin raamatu lõpuni", "Vali juhuslik raamat", "Väljasta nimekirjad ja andmed"};
        String[] nimekirjad = {"Hetkel loen", "Loetud raamatud", "Tahan lugeda"};
        while (true) {
            //'tegevus' väärtuseks saab valiku indeks 'tegevused' massiivis
            int tegevus = JOptionPane.showOptionDialog(null, "Mida soovid teha?", "Raamatud", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tegevused, tegevused[0]);

            //kui aken suletakse
            if (tegevus == -1) break;

            //kui valitakse "Lisan raamatu"
            if (tegevus == 0) {
                int nimekiri = JOptionPane.showOptionDialog(null, "Millisesse nimekirja soovite raamatu sisestada", "Andmete sisestamine", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, nimekirjad, nimekirjad[0]);
                String pealkiri = JOptionPane.showInputDialog(null, "Sisestage raamatu pealkiri ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE);
                String autor = JOptionPane.showInputDialog(null, "Sisestage raamatu autor ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE);
                int lehekülgi = Integer.parseInt(JOptionPane.showInputDialog(null, "Sisestage raamatu lehekülgede arv ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE));
                if (nimekiri == 0) {
                    int loetud = Integer.parseInt(JOptionPane.showInputDialog(null, "Sisestage loetud lehekülgede arv ", "Andmete sisestamine",
                            JOptionPane.QUESTION_MESSAGE));
                    lugeja.getHetkelLoen().lisaRaamat(pealkiri, autor, lehekülgi, loetud);
                }
                if (nimekiri == 1){
                    int hinnang = -1;
                    while (hinnang < 0 || hinnang > 5)
                        hinnang = Integer.parseInt(JOptionPane.showInputDialog(null, "Sisestage hinnang loetud raamatule (1-5) ", "Andmete sisestamine",
                                JOptionPane.QUESTION_MESSAGE));
                    lugeja.getLoetudRaamatud().lisaRaamat(pealkiri, autor, lehekülgi, hinnang);
                }
                if (nimekiri == 2){
                    lugeja.getTahanLugeda().lisaRaamat(pealkiri, autor, lehekülgi);
                }
            }

            //kui valiti "Lisan lehekülgi"
            if (tegevus == 1){
                String pealkiri = JOptionPane.showInputDialog(null, "Sisestage raamatu pealkiri ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE);
                int lehekülgiJuurde = Integer.parseInt(JOptionPane.showInputDialog(null, "Sisestage palju lehekülgi olete juurde lugenud ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE));
                lugeja.getHetkelLoen().lugesinJuurde(pealkiri, lehekülgiJuurde);
            }

            //kui valiti "Hakkasin lugema"
            if (tegevus == 2){
                String pealkiri = JOptionPane.showInputDialog(null, "Sisestage raamatu pealkiri ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE);
                lugeja.hakkanLugema(pealkiri);
            }

            //kui valiti "Lugesin raamatu lõpuni"
            if (tegevus == 3){
                String pealkiri = JOptionPane.showInputDialog(null, "Sisestage raamatu pealkiri ", "Andmete sisestamine",
                        JOptionPane.QUESTION_MESSAGE);
                lugeja.lugesinLõpuni(pealkiri);
            }

            //kui valiti "Vali juhuslik raamat"
            if (tegevus == 4){
                String juhuslikRaamat = null;
                int nimekiri = JOptionPane.showOptionDialog(null, "Millisest nimekirjast soovite juhuslikult valida", "Andmete sisestamine", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, nimekirjad, nimekirjad[0]);
                if (nimekiri == 0) {
                    if (lugeja.getHetkelLoen().raamatud.size() != 0)
                    juhuslikRaamat = lugeja.getHetkelLoen().valiSuvaline().getPealkiri();}
                else if (nimekiri == 1){
                    if (lugeja.getLoetudRaamatud().raamatud.size() != 0)
                    juhuslikRaamat = lugeja.getLoetudRaamatud().valiSuvaline().getPealkiri();}
                else if (nimekiri == 2){
                    if (lugeja.getTahanLugeda().raamatud.size() != 0)
                    juhuslikRaamat = lugeja.getTahanLugeda().valiSuvaline().getPealkiri();}
                JOptionPane.showMessageDialog(null, (juhuslikRaamat == null ? "List on tühi" : "Juhuslikult valitud raamat on" + juhuslikRaamat + "\""));
            }

            //kui valiti "Väljasta nimekirjad ja andmed"
            if (tegevus == 5){
                System.out.println("-----------------------------");
                System.out.println(lugeja + "\n");
                System.out.println("Raamatud, mida hetkel loete:");
                for (Raamat raamat: lugeja.getHetkelLoen().raamatud)
                    System.out.println(raamat + "\n");
                System.out.println("Raamatud, mis on teil loetud:");
                for (Raamat raamat: lugeja.getLoetudRaamatud().raamatud)
                    System.out.println(raamat + "\n");
                System.out.println("Raamatud, mida tahate lugeda:");
                for (Raamat raamat: lugeja.getTahanLugeda().raamatud)
                    System.out.println(raamat + "\n");
                System.out.println("-----------------------------");
                JOptionPane.showMessageDialog(null, "Andmed väljastatud");
            }
        }



    }
}