import java.util.ArrayList;
import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {
        Instagram_Model[] post = new Instagram_Model[3];
        post[0] = new Instagram_Model();
        post[0].user = "@billa.syaharani";
        post[0].foto = """
                HHHHHHHH    HH
                   HH       HH
                   HH       HH
                   HH       HH""";
        post[0].caption = """
                Teknik Informatika Politeknik Harapan Bersama Tegal
                #PHB""";
        ArrayList komen0 = new ArrayList<>();
        post[0].komen = komen0;
        post[0].like = 0;
        post[0].link = "http://instagram/@billa.syaharani/post0";

        post[1] = new Instagram_Model();
        post[1].user = "@putrii";
        post[1].foto = """
            HHHHHHHH    HH
               HH       HH
               HH       HH
               HH       HH""";
        post[1].caption = """
                Ayo daftar di TI PHB!
                #PHB""";
        ArrayList komen1 = new ArrayList<>();
        post[1].komen = komen1;
        post[1].like = 0;
        post[1].link = "http://instagram/@putrii/post1";

        System.out.println("INSTAGRAM");
        System.out.println("---------------");
        System.out.println("\nPostingan 1");
        post[0].post();
        System.out.println("\nPostingan 2");
        post[1].post();

        Scanner input = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2): ");
            pilihPost = input.next().charAt(0);
            switch (pilihPost) {
                case '1' -> {
                    post[0].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[0].likes(1);
                                post[0].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[0].Comments(komen);
                                post[0].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[0].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Copied: " + post[0].link);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '2' -> {
                    post[1].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[1].likes(1);
                                post[1].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[1].Comments(komen);
                                post[1].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[1].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Copied: " + post[1].link);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                
            }
        } while (pilihPost != '0');
    }
}
