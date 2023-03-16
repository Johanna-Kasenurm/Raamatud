import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoetudRaamatud loetudRaamatud = new LoetudRaamatud();
        TahanLugeda tahanLugeda = new TahanLugeda();
        HetkelLoen hetkelLoen = new HetkelLoen();

        String nimi = JOptionPane.showInputDialog(null, "Sisestage oma nimi ", "Andmete sisestamine",
                JOptionPane.QUESTION_MESSAGE);

        Lugeja lugeja = new Lugeja(nimi, loetudRaamatud, tahanLugeda, hetkelLoen);
        System.out.println(lugeja);
    }
}