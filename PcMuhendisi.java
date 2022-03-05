public class PcMuhendisi implements IMuhendis {
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_sorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        } else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ort(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil() {
        if (adli_sicil) {
            System.out.println("Adli sicil kaydım var.");
        } else {
            System.out.println("Herhangi bir adli sicil kaydım yok");
        }
    }

    @Override
    public void is_tecrube(String[] arr) {
        System.out.println("Pc müh olarak şu şirketlerde çalıştım");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
