package Lat_IO_dan_Percabangan;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data_Mahasiswa {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String nim,nama,prodi;
        int semester,sksAmbil;

        try {
            System.out.println("---Data Mahasiswa---");

            System.out.print("NIM : ");
            nim = br.readLine();
            System.out.print("Nama : ");
            nama = br.readLine();
            System.out.print("Prodi : ");
            prodi = br.readLine();
            System.out.print("Semester : ");
            semester = Integer.parseInt(br.readLine());
            System.out.print("Jumlah SKS Yang Akan Diambil  : ");
            sksAmbil = Integer.parseInt(br.readLine());

            System.out.println("---Cetak Data Mahasiswa---");

            System.out.println("NIM Mahasiswa = " + nim);
            System.out.println("Nama Mahasiswa = " + nama);
            System.out.println("Prodi Mahasiswa = " + prodi);
            System.out.println("Semester Mahasiswa = " + semester);
            System.out.println("Jumlah SKS Mahasiswa = " + sksAmbil);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println("Isian Semester Harus Menggunkan Angka");


        }
    }
}
