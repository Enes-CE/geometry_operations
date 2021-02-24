import java.sql.Time;
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.Timer;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("# Geometri Programına Hoşgeldiniz #");
        System.out.println("***********************************");


        String islemler = "1. Üçgen\n" +
                "2. Kare\n" +
                "3. Daire\n" +
                "4. Dikdörtgen\n" +
                "5. Yamuk\n" +
                "Çıkış : q ";

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println(islemler);
            System.out.println("-----------------------------------");
            System.out.print("Hangi şekil için işlem yapacağınızı seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkış yapılıyor...");
                break;
            } else if (islem.equals("1")) {

                String u_islemler = "1. Dik Üçgen Alan Hesaplama\n" +
                        "2. Üçgen Çevresini Hesaplama\n" +
                        "Ana Menü: x";

                System.out.println("-----------------------------------");
                System.out.println(u_islemler);
                System.out.println("-----------------------------------");

                System.out.print("Lütfen işleminizi seçiniz : ");
                u_islemler = scanner.nextLine();

                if (u_islemler.equals("1")) {
                    System.out.print("Kenar 1 : ");
                    int kenar1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Kenar 2 : ");
                    int kenar2 = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.dik_Ucgen_Alan(kenar1, kenar2);

                } else if (u_islemler.equals("2")) {
                    System.out.print("Kenar 1 : ");
                    int kenar1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Kenar 2 : ");
                    int kenar2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Kenar 3 : ");
                    int kenar3 = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.ucgen_Cevre_Hesaplama(kenar1, kenar2, kenar3);

                }else if (u_islemler.equals("x")){
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    Thread.sleep(2000);


                }

            } else if (islem.equals("2")) {
                String k_islemler = "1. Karenin Alanını Hesaplama\n" +
                        "2. Karenin Çevresini Hesaplama\n" +
                        "Ana Menü : x";

                System.out.println("-----------------------------------");
                System.out.println(k_islemler);
                System.out.println("-----------------------------------");

                System.out.print("Lütfen işleminizi seçiniz : ");
                k_islemler = scanner.nextLine();

                if (k_islemler.equals("1")) {
                    System.out.print("Kenar : ");
                    int kenar = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.kare_Alan(kenar);
                }
                else if (k_islemler.equals("2")){
                    System.out.print("Kenar : ");
                    int kenar = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.kare_Cevre(kenar);
                }
                else if (k_islemler.equals("x")){
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    Thread.sleep(2000);


                }

            }else if (islem.equals("3")){
                String d_islemler = "1. Dairenin Alanını Hesaplama\n" +
                        "2. Dairenin Çevresini Hesaplama\n" +
                        "Ana Menü : x";

                System.out.println("-----------------------------------");
                System.out.println(d_islemler);
                System.out.println("-----------------------------------");

                System.out.print("Lütfen İşleminizi Seçiniz : ");
                d_islemler = scanner.nextLine();

                if (d_islemler.equals("1")){
                    System.out.print("Yaricap : ");
                    double yaricap= scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.daire_Alan(yaricap);
                }
                else if (d_islemler.equals("2")){
                    System.out.print("Yaricap : ");
                    double yaricap=scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.daire_Cevre(yaricap);
                }

                else if (d_islemler.equals("x")){
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    Thread.sleep(2000);

                }

            }else if (islem.equals("4")){
                String di_islemler = "1.Dikdörtgenin Alanını Hesaplama\n" +
                        "2.Dikdörgenin Çeveresini Hesaplama\n" +
                        "Ana Menü : x";

                System.out.println("-----------------------------------");
                System.out.println(di_islemler);
                System.out.println("-----------------------------------");

                System.out.print("Lütfen İşleminizi Seçiniz : ");
                di_islemler=scanner.nextLine();

                if (di_islemler.equals("1")){
                    System.out.print("Uzun Kenar : ");
                    int uzun_kenar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Kısa Kenar : ");
                    int kisa_kenar = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.dikdortgen_Alan(uzun_kenar,kisa_kenar);
                }
                else if (di_islemler.equals("2")){
                    System.out.print("Uzun Kenar : ");
                    int uzun_kenar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Kısa Kenar : ");
                    int kisa_kenar = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.dikdortgen_Cevre(uzun_kenar,kisa_kenar);
                }

                else if (di_islemler.equals("x")){
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    Thread.sleep(2000);
                }

            }else if (islem.equals("5")){
                String y_islemler ="1. Yamuk Alanını Hesaplama\n" +
                        "Ana Menü : x";

                System.out.println("-----------------------------------");
                System.out.println(y_islemler);
                System.out.println("-----------------------------------");

                System.out.print("Lütfen İşleminizi Seçiniz : ");
                y_islemler=scanner.nextLine();

                if (y_islemler.equals("1")){

                    System.out.print("Alt Taban : ");
                    double alt_taban=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Üst Taban : ");
                    double ust_taban=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yükseklik : ");
                    double yukseklik=scanner.nextInt();
                    scanner.nextLine();

                    Problem.Matematik.yamuk_Alan(alt_taban,ust_taban,yukseklik);
                }

                else if (y_islemler.equals("x")){
                    System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
                    Thread.sleep(2000);
                }
            }
        }
    }
}
