/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programidentitaskompleks;
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class ProgramIdentitasKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        String tanggallahir;
        String nomorhandphone;
        String alamat;
        String status;
        String nomorKTP;
        // tambahkan di sini untuk data siswa 
        
        String pilihan = "y";
        int pilih;
        
        Scanner identitas = new Scanner (System.in);
        
        System.out.println("        BINUS/012  (021)234567        ");
        System.out.println("======================================");
        System.out.println("   PROGRAM IDENTITAS PERUSAHAAN XYZ   ");
        System.out.println("======================================");
        System.out.println("");
        
        System.out.print("Nama             : ");
        nama = identitas.next();  
        
        System.out.print("Tanggal Lahir    : ");
        tanggallahir = identitas.next();

        System.out.print("Nomor Handphone  : ");
        nomorhandphone = identitas.next();       
        
        System.out.print("Apakah anda yakin dengan data di atas? (Y/N): ");
        pilihan = identitas.next();
        
        while(pilihan.equalsIgnoreCase("Y")) {
            System.out.println("");
            System.out.println("Menu: \n 1. Lihat Data Diri \n 2. Update Data Diri \n 3. Keluar \n");        
            System.out.print("Masukkan Pilihan: ");
            pilih = identitas.nextInt();
            
            switch (pilih)  {
                case 1: 
                    System.out.println("");
                    System.out.println("                DATA DIRI               ");
                    System.out.println("");
                    System.out.println("Nama             : "+nama);
                    System.out.println("Alamat           : -");
                    System.out.println("Nomor Handphone  : "+nomorhandphone);
                    System.out.println("Tgl Lahir        : "+tanggallahir);
                    System.out.println("Status           : -");
                    System.out.println("Nomor KTP        : -");
                    break;
                case 2:
                    int pilih2;
                     
                    System.out.println("");
                    System.out.println("Menu: \n 1. Nama \n 2. Alamat \n 3. Nomor handphone \n 4. Tgl lahir \n 5. Status \n 6. Nomor KTP \n 7. Cancel");
                    System.out.print("Masukkan Pilihan: ");
                    pilih2 = identitas.nextInt();
                    
                    switch (pilih2) {
                        case 1:
                            System.out.print("Nama: ");
                            nama = identitas.next();
                        break;
                        case 2: 
                            System.out.print("Alamat: ");
                            alamat = identitas.next();
                        break;
                        case 3: 
                            System.out.print("Nomor handphone: ");
                            nomorhandphone = identitas.next();
                        break;
                        case 4: 
                            System.out.print("Tgl lahir: ");
                            tanggallahir = identitas.next();
                        break;
                        case 5: 
                            System.out.print("Status: ");
                            status = identitas.next();
                        break;
                        case 6: 
                            System.out.print("Nomor KTP: ");
                            nomorKTP = identitas.next();
                        break;
                        default:
                        break;
                    }
                break;
                case 3:
                    pilihan = "n";
                    System.out.println("Keluar . .");
                    break;
                default:
                    break;
            }
        }
    }
}



