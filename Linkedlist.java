import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
    public static void b(LinkedList<String> a) {
        /*
         * for (String s : a) { System.out.println(s); }
         */
        ListIterator<String> it = a.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> gy = new LinkedList<String>();
        gy.add("aafsgdsfgdfhgdfhgxfjhgfnxngfxnxgfh");
        gy.add("sdhgdfkgfnmknjogdzjkondzgnjodfg");
        gy.add("rs njınjphzgnojhzggdjnkbjhkgdnnjkgzdjngzd");
        gy.add("s<gdf kj gdfkjfk jbhdgcb jkk jşbdgkj bdf");
        gy.add("z hdfg <posd<gpsf gf phofghsdfp");
        gy.add("gsfşgzsfljksfvg<jhksdfknjhlsdf<kjhlgfıljşdfzb");
        b(gy);
    }

}
