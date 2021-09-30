package final_project;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import java.util.ArrayList;

public class Individu extends Nasabah{
    private IntegerProperty nik;
    private IntegerProperty npwp;


    public Individu(Integer id_nasabah, String nama, String alamat, ArrayList<Rekening> rekening,Integer nik,Integer npwp) {
        super(id_nasabah, nama, alamat, rekening);
        this.nik = new SimpleIntegerProperty(nik);
        this.npwp = new SimpleIntegerProperty(npwp);
    }

    public Individu(Integer id_nasabah, String nama, String alamat, Rekening rekening,Integer nik,Integer npwp) {
        super(id_nasabah, nama, alamat, rekening);
        this.nik = new SimpleIntegerProperty(nik);
        this.npwp = new SimpleIntegerProperty(npwp);
    }

    public Integer getNik() {
        return nik.get();
    }

    public IntegerProperty nikProperty() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik.set(nik);
    }

    public Integer getNpwp() {
        return npwp.get();
    }

    public IntegerProperty npwpProperty() {
        return npwp;
    }

    public void setNpwp(Integer npwp) {
        this.npwp.set(npwp);
    }
}
