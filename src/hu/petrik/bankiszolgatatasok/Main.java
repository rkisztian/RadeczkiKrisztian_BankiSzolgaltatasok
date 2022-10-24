package hu.petrik.bankiszolgatatasok;

public class Main {
    public static void main(String[] args) {

        Tulajdonos tulaj1 = new Tulajdonos("Toth Noel");
        Tulajdonos tulaj2 = new Tulajdonos("Bacskai Gergő");
        Tulajdonos tulaj3 = new Tulajdonos("Marton Attila");

        Bank bank1 = new Bank();
        bank1.szamlaNyitas(tulaj1,500).befizet(2350);
        bank1.szamlaNyitas(tulaj2, 480);
        bank1.szamlaNyitas(tulaj3, 0).befizet(4250);

        System.out.println(bank1.getOsszHitelkeret());
        System.out.println(bank1.getOsszEgyenleg(tulaj1));
        System.out.println(bank1.getLegnagyobbEgyenleguSzamla(tulaj1).getAktualisEgyenleg());



    }
}
