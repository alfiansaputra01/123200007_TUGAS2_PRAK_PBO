package TabungBalok;

public class lingkaran implements menghitungBidang {
    
    double jari;

    public lingkaran(double jari) {
        this.jari = jari;
    }
        
    @Override
    public void luasLingkaran() {
        double luas;
        luas = 3.14 * (jari*jari);
        System.out.println("Luas lingkaran = " + luas);
    }

    @Override
    public void kelilingLingkaran() {
        double keliling;
        keliling = (2*jari)*3.14;
        System.out.println("Keliling Lingkaran = " + keliling);
    }

    @Override
    public void luasPersegi() {
        
    }

    @Override
    public void kelilingPersegi() {
        
    }
    
}
