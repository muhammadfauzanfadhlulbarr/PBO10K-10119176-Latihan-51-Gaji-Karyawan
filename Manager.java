/**
 * Latihan51
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Gaji Karyawan
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganKehadiran, tunjanganJabatan;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equalsIgnoreCase("Manager")){
            tunjanganJabatan = 2000000;
        return tunjanganJabatan;
        }else if (jabatan.equalsIgnoreCase("Kabag")){
            tunjanganJabatan = 1000000;
        return tunjanganJabatan;
        }
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan){
        if (golongan == 1){
            tunjanganGolongan = 500000;
            return tunjanganGolongan;
        }
        else if (golongan == 2){
            tunjanganGolongan = 1000000;
            return tunjanganGolongan;
        }
        else if (golongan == 3){
            tunjanganGolongan = 1500000;
            return tunjanganGolongan;
        }
        return tunjanganGolongan;
    }

    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
