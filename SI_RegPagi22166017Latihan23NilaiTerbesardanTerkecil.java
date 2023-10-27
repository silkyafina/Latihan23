import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan nilai terbesar dan terkecil yang inputannya
 * berasal dari user
 */
public class SI_RegPagi22166017Latihan23NilaiTerbesardanTerkecil {
    public static void main(String[] args) {
    // scanner berfungsi untuk menginputkan nilai
        Scanner input = new Scanner(System.in);
     
     System.out.println("========== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ==========");
   // input nama petugas
     System.out.print("Masukkan Nama Petugas : ");
     String nama_petugas=input.nextLine();
     
   // input banyaknya nilai mahasiwa
     System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
     int jml_mhs = input.nextInt();
     
     System.out.println("========== Hasil Nilai Mahasiswa ==========");
     
     // deklarasi nilai terbesar dan terkecil
     double nilai_terbesar= Double.MIN_VALUE; // untuk mengetahui nilai terbesar
     double nilai_terkecil= Double.MAX_VALUE; // untuk mengetahui nilai terkecil
     
   // input nilai mahasiswa 
     for(int nilai_ke=1; nilai_ke<= jml_mhs; nilai_ke++){
        System.out.print ("Masukkan Nilai Mahasiswa ke-"+nilai_ke+": ");
        double nilai = input.nextDouble();
     
        if(nilai > nilai_terbesar){
        nilai_terbesar = nilai;
        }
        
        if (nilai < nilai_terkecil){
         nilai_terkecil =nilai;
        }
     }
    // output nilai terbesar dan terkecil
        System.out.println("Nilai terbesar adalah "+nilai_terbesar);
        System.out.println("Nilai terkecil adalah "+nilai_terkecil);
        
     System.out.println("Petugas : "+nama_petugas);
    
        
    }
    
}
