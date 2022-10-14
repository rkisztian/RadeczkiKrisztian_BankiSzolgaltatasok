package hu.petrik.bankiszolgatatasok;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;
    public static double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;

    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public void kamatJovairas(){
        aktualisEgyenleg *= alapKamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (aktualisEgyenleg < osszeg){
            return false;
        }else {
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }
}
