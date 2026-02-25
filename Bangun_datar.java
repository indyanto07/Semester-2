public class Bangun_datar {
    public static void main(String[] args) {
        
        Segitiga A = new Segitiga(10,10);
        Segitiga B = new Segitiga(6,10);
        Segitiga C = new Segitiga(8,10);

        System.out.println("luas Segitiga:"+A.luas);
        System.out.println("luas Segitiga:"+B.luas);
        System.out.println("luas Segitiga:"+C.luas);
        System.out.println("=============================");
    
        B = A;
        B.alas = 20;
        A.alas = 40;
        A.nama = "Segitiga A";

        System.out.println("luas Segitiga:"+A.hitungluas());
        System.out.println("luas Segitiga:"+B.hitungluas());
        System.out.println("luas Segitiga:"+C.hitungluas());

        System.out.println(A.nama);
    }
}

class Segitiga {
    double alas;
    double tinggi;
    double luas;
    String nama;

    public Segitiga(double a,double t){
        this.alas = a;
        this.tinggi = t;
        this.luas = (a*t)/2;
    }

    public double hitungluas(){
        return 0.5*alas*tinggi;
    }

    void print(){
        System.out.println(nama);
    }
}