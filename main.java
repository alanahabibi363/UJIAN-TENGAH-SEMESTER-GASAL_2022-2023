import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nama    : Maulana Yusuf Habibi");
        System.out.println("NIM     : 2100018200");
        System.out.println("Kelas   : D");
        System.out.println("UTS");
        System.out.println("\n");

        tendik tndk = new tendik();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        tndk.nama = input.next();
        System.out.println("Masukkan NIP : ");
        tndk.nip = input.nextInt();
        System.out.println("Masukkan TTL (DD/MM/YYYY): ");
        tndk.ttl = input.next();
        System.out.println("Masukkan Alamat : ");
        tndk.alamat = input.next();
        System.out.println("Masukkan Jenis Kelamin : ");
        tndk.jk = input.next();
        System.out.println("Masukkan Tahun Masuk : ");
        tndk.thnMasuk = input.nextInt();

        dosen dsn = new dosen();
        dsn.setJurusan("Managemen");
        dsn.setNidn(86571253);
        dsn.setNama("Eko Prayitno, M.Pd.");
        dsn.setNip(1975010817);
        dsn.setTglLahir("08/01/1975");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("BREBES");
        dsn.setTahunMasuk(2017);

        System.out.println("Rekap Penghasilan Tendik\n");
        System.out.println("Nama                : "+ tndk.getNama());
        System.out.println("NIP                 : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("Rekap Penghasilan Dosen\n");
        System.out.println("\n");
        System.out.println("Nama dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("NIP  dosen          : "+ dsn.getNip());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));

    }
}