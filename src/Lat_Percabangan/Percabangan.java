package Lat_Percabangan;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percabangan {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int usia;
        System.out.println("Masukkan Usia Anda : ");
        usia=Integer.parseInt(br.readLine());
        if (usia>=17) {
            System.out.println("Sudah Memenuhi Syarat");
        } else {
            System.out.println("Belumn Memenuhi Syarat");
        }


        String nim;
        int nilaiUas;
        System.out.print("Masukkan NIM Anda : ");
        nim= br.readLine();
        nilaiUas=Integer.parseInt(br.readLine());

        if (nim.equalsIgnoreCase("22410100045") && nilaiUas == 80) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100045") && nilaiUas == 70) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100045") && nilaiUas == 65) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100045")&& nilaiUas <65) {
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("Nilai Tidak Ditemukan");
        }


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