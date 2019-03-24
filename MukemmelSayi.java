package mukemmelsayi;

public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi = 2, son = 1000;
        int bolen, toplam = 0;

        while (sayi <= son) {
            for (bolen = 1; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    toplam += bolen;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi);
            }
            sayi++;
            toplam = 0;

        }

    }
}
