
public class Problem {

    public static class Matematik {

        public static void dik_Ucgen_Alan(int kenar1, int kenar2) {

            int u_alan = (kenar1 * kenar2) / 2;
            System.out.println("Dik Üçgenin Alanı : " + u_alan);
        }

        public static void ucgen_Cevre_Hesaplama(int kenar1, int kenar2, int kenar3) {
            int u_cevre = (kenar1 + kenar2 + kenar3);
            System.out.println("Üçgenin Çevresi : " + u_cevre);
        }

        public static void daire_Alan(double yaricap) {
            double d_alan = (double) (yaricap * yaricap * Math.PI);
            System.out.println("Dairenin Alanı : " + d_alan);

        }

        public static void daire_Cevre(double yaricap) {
            double d_cevre = (double) (2 * Math.PI * yaricap);
            System.out.println("Dairenin Çevresi : " + d_cevre);
        }

        public static void kare_Alan(int kenar) {
            int k_alan = (kenar * kenar);
            System.out.println("Karenin Alanı : " + k_alan);
        }
        public static void kare_Cevre(int kenar){
            int k_cevre = (4*kenar);
            System.out.println("Karenin Çevresi : "+ k_cevre);
        }

        public static void dikdortgen_Alan(int uzun_kenar, int kisa_kenar){
            int di_alan=(uzun_kenar * kisa_kenar);
            System.out.println("Dikdörgenin Alanı : "+di_alan);
        }
        public static void dikdortgen_Cevre(int uzun_kenar, int kisa_kenar){
            int di_cevre=(uzun_kenar+kisa_kenar)*2;
            System.out.println("Dikdörtgenin Çevresi : "+di_cevre);
        }

        public static void yamuk_Alan(double alt_taban, double ust_taban, double yukseklik){
            double y_alan=((alt_taban+ust_taban)/2)*yukseklik;
            System.out.println("Yamuk Alanı : "+y_alan);
        }

    }
}
