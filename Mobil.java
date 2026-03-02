package laprakpemlan1;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(int i){
        rubahKecepatan(i);
    }

    public void setWaktu(double d){
    rubahSekon(d);
}

    private void rubahSekon(double d){
    this.waktu = d * 3600;
}
   

    private void rubahKecepatan(int i){
    this.kecepatan = (int)(i * 1000 / 3600);
    }

    public double getKecepatanKmH() {
    return kecepatan * 3.6;  
    }

    public double hitungJarak(){
        return kecepatan * waktu;
    }

    public double jarakTempuh(){
        jarak = hitungJarak();
        jarak = jarak/1000;
        return jarak;
     }
        
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.printf("dan mampu menempuh kecepatan %.2f km/h atau %d m/s%n", getKecepatanKmH(), kecepatan);
        System.out.println("Jarak yang dapat ditempuh adalah " + jarakTempuh() + " km");
    }
}
