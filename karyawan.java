public class karyawan {
    protected double nip;
    protected String nama;
    protected String alamat;
    protected String ttl;
    protected int thnMasuk;
    protected int gaji;
    protected String jk;

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public int gajiPokok(){
        setGaji(2000000);
        return gaji;

    }

    public double getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTglLahir() {
        return ttl;
    }

    public void setTglLahir(String tglLahir) {
        this.ttl = tglLahir;
    }

    public int getTahunMasuk() {
        return thnMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.thnMasuk = tahunMasuk;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
