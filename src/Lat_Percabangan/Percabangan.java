package Lat_Percabangan;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percabangan {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String menu, jenis;
        System.out.print("Masukkan Menu(Makanan/Minuman) : ");
        menu= br.readLine();
        System.out.print("Masukkan Jenis Menu\n " +
                "Makanan : Snack, Nasi Bungkus\n" +
                "Minuman : Kopi, Teh, Air Mineral.\n" +
                "Pilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("Makanan")) {

            if (jenis.equalsIgnoreCase("Snack")) {
                System.out.println("harga 2000");
            } else {
                System.out.println("Harga 5000");
            }
        } else if (menu.equalsIgnoreCase("Minuman")) {
            if (jenis.equalsIgnoreCase("Kopi")){
                System.out.println("Harga 3000");
            } else if (jenis.equalsIgnoreCase("Teh")) {
                System.out.println("Harga 4000");

            } else if (jenis.equalsIgnoreCase("Air Mineral")) {
                System.out.println("Harga 6000");

            }
        }

    }

    }