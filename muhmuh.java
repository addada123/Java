public class muhmuh {
    public static void main(String[] args) {

        // IMuhendis muhendis1 = new IMuhendis();

        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);

        muhendis1.askerlik_sorgula();
        muhendis1.adli_sicil();
        System.out.println(muhendis1.mezuniyet_ort(3.07));
        String[] arr = { "Vestel", "Havelsan", "Türksat" };
        muhendis1.is_tecrube(arr);

    }
}
