package TabungBalok;

public class balok implements menghitungRuang {
    double panjang, tinggi, lebar;

    public balok(double panjang, double tinggi, double lebar) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    
    
    
    @Override
    public void volumeBalok() {
        double hasil;
        hasil = panjang*lebar*tinggi;
        System.out.println("Volume Balok = " + hasil);
    }

    @Override
    public void permukaanBalok() {
        double hasil;
        hasil = 2*((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
        System.out.println("Luas Permukaan Balok = " + hasil);
    }

    @Override
    public void volumeTabung() {
        
    }

    @Override
    public void permukaanTabung() {
        
    }
    
}
