/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class contoh3 {
    public static void main(String[] args) {
        String nama;
        String tanggallahir;
        String nomorhandphone;
        int pilih;
        
        Scanner identitas = new Scanner (System.in);
        
        System.out.println("     BINUS/012  (021)234567      ");
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
        
        String pilihan;
        System.out.print("Apakah anda yakin dengan data di atas? (Y/N): ");
        pilihan = identitas.next();
        
        if (pilihan.equalsIgnoreCase("Y"))
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
                    String nama2, alamat, nomorhandphone2, tanggallahir2, status, nomorKTP;
                    System.out.println("");
                    System.out.println("Menu: \n 1. Nama \n 2. Alamat \n 3. Nomor handphone \n 4. Tgl lahir \n 5. Status \n 6. Nomor KTP \n 7. Cancel");
                    System.out.print("Masukkan Pilihan: ");
                    pilih2 = identitas.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Nama: ");
                            nama2 = identitas.next();
                        break;
                        case 2: 
                            System.out.print("Alamat: ");
                            alamat = identitas.next();
                        break;
                        case 3: 
                            System.out.print("Nomor handphone: ");
                            nomorhandphone2 = identitas.next();
                        break;
                        case 4: 
                            System.out.print("Tgl lahir: ");
                            tanggallahir2 = identitas.next();
                        break;
                        case 5: 
                            System.out.print("Status: ");
                            status = identitas.next();
                        break;
                        case 6: 
                            System.out.print("Nomor KTP: ");
                            nomorKTP = identitas.next();
                        case 7:
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
                    int pilih3;
                    String nama3, alamat2, nomorhandphone3, tanggallahir3, status2, nomorKTP2;
                    System.out.println("");
                    System.out.println("Menu: \n 1. Nama \n 2. Alamat \n 3. Nomor handphone \n 4. Tgl lahir \n 5. Status \n 6. Nomor KTP \n 7. Cancel");
                    System.out.print("Masukkan Pilihan: ");
                    pilih2 = identitas.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Nama: ");
                            nama2 = identitas.next();
                        break;
                        case 2: 
                            System.out.print("Alamat: ");
                            alamat = identitas.next();
                        break;
                        case 3: 
                            System.out.print("Nomor handphone: ");
                            nomorhandphone2 = identitas.next();
                        break;
                        case 4: 
                            System.out.print("Tgl lahir: ");
                            tanggallahir2 = identitas.next();
                        break;
                        case 5: 
                            System.out.print("Status: ");
                            status = identitas.next();
                        break;
                        case 6: 
                            System.out.print("Nomor KTP: ");
                            nomorKTP = identitas.next();
                        case 7:
                            
                        break;
                    }
            }
                    }
            }
    }
}