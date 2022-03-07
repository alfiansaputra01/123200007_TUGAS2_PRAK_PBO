package TabungBalok;

public class tabung implements menghitungRuang {
    double tinggi;
    double jari;

    public tabung(double tinggi, double jari) {
        this.tinggi = tinggi;
        this.jari = jari;
    }
    
    @Override
    public void volumeBalok() {
        
    }

    @Override
    public void permukaanBalok() {
        
    }

    @Override
    public void volumeTabung() {
        double volume;
        volume = 3.14*(jari*jari)*tinggi;
        System.out.println("Volume Tabung = " + volume);
    }

    @Override
    public void permukaanTabung() {
        double luas;
        luas = (2*3.14*jari)*(jari+tinggi);
        System.out.println("Luas Permukaan Tabung = " + luas);
    }
    
}
