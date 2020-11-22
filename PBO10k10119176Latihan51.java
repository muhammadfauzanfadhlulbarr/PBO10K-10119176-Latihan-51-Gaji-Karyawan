import java.util.Scanner;
/**
 * Latihan51
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Gaji Karyawan
 */
public class PBO10k10119176Latihan51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan kry = new Karyawan();
        Manager mng = new Manager();
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan NIK : ");
        String Nik  = (sc.nextLine());
        System.out.print("Masukkan Nama : ");
        String Nama = (sc.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int Golongan = (sc.nextInt());
        System.out.print("Masukkan Jabatan(Manager/Kabag) : ");
        String Jabatan = (sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = sc.nextInt();
        
        mng.setNik(Nik);
        mng.setNama(Nama);
        mng.setGolongan(Golongan);
        mng.setJabatan(Jabatan);
        mng.setKehadiran(hadir);
        
        

        System.out.println(" ");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("NIK     : "+mng.getNik());
        System.out.println("NAMA    : "+mng.getNama());
        System.out.println("GOLONGAN: "+mng.getGolongan());
        System.out.println("JABATAN : "+mng.getJabatan());
        System.out.println(" ");
        
        float tunjGolongan = mng.tunjanganGolongan(mng.getGolongan());
        float tunjJabatan = mng.tunjanganJabatan(mng.getJabatan());
        float tunjKehadiran = mng.tunjanganKehadiran(mng.getKehadiran());
        float gajiTotal = mng.gajiTotal();

        System.out.println("TUNJANGAN GOLONGAN  : "+ tunjGolongan);
        System.out.println("TUNJANGAN JABATAN   : "+tunjJabatan);
        System.out.println("TUNJANGAN KEHADIRAN : "+tunjKehadiran);
        System.out.println(" ");
        System.out.println("GAJI TOTAL          : " + gajiTotal);
        
                
    }
    
}
