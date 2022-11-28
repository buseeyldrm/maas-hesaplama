public class Employee {
    String ad, soyad;
    int maas;
    int haftalikCalismaSaati;
    int baslangicYil;

    public Employee(String ad, String soyad, int maas, int haftalikCalismaSaati, int baslangicYil) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.haftalikCalismaSaati = haftalikCalismaSaati;
        this.baslangicYil = baslangicYil;
    }


    public double vergi(){
        if (maas<1000){
            return 0;
        }
        else {
            return maas*0.03;
        }
    }


    public double bonus(){
        if (haftalikCalismaSaati>40){
            return (haftalikCalismaSaati-40)*30;
        }
        else{
            return 0;
        }
    }

    public  double yilArtis(){
        int yil=2022;
        int calisilanYil=yil-baslangicYil;

        if (calisilanYil<10){
            return maas*0.05;
        } else if (calisilanYil>9 && calisilanYil<20) {
            return maas*0.1;

        }
        else {
            return maas*0.15;
        }
    }


    @Override
    public String toString() {
        System.out.println("Adı: " +ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("Maaşı: " +maas);
        System.out.println("Çalışma Saati: " +haftalikCalismaSaati);
        System.out.println("Başlangıc Yıl: " +baslangicYil);
        System.out.println("Vergi: " +vergi());
        System.out.println("Bonus: " +bonus());
        System.out.println("Maaş Artışı: " +yilArtis());
        System.out.println("Vergi ve bonuslar ile birlikte maas: "+(maas-vergi()+bonus()));
        System.out.println("Toplam Maaş: " +(maas-vergi()+bonus()+yilArtis()));
        return "";
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getHaftalikCalismaSaati() {
        return haftalikCalismaSaati;
    }

    public void setHaftalikCalismaSaati(int haftalikCalismaSaati) {
        this.haftalikCalismaSaati = haftalikCalismaSaati;
    }

    public int getBaslangicYil() {
        return baslangicYil;
    }

    public void setBaslangicYil(int baslangicYil) {
        this.baslangicYil = baslangicYil;
    }
}
