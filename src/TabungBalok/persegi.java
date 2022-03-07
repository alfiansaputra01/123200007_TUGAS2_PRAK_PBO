package TabungBalok;

public class persegi implements menghitungBidang {  
    double panjang, lebar;

    public persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public void luasLingkaran() {
       
    }

    @Override
    public void kelilingLingkaran() {
        
    }

    @Override
    public void luasPersegi() {
        double luas;
        luas = panjang*lebar;
        System.out.println("Luas Persegi = " + luas);
    }

    @Override
    public void kelilingPersegi() {
        double keliling;
        keliling = 2*panjang*lebar;
        System.out.println("Keliling Persegi = " + keliling);
    }
}
