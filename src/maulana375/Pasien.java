package maulana375;

public class Pasien {

    // Atribut untuk menyimpan data pasien
    private String nama;
    private int usia;
    private String jenisKelamin;

    // Konstruktor: dipanggil saat objek dibuat
    public Pasien(String nama, int usia, String jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter (Accessor)
    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Setter (Mutator)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Menampilkan info pasien BPJS
    public String getInfoPasien() {
        return "Nama           : " + nama + "\n" +
               "Usia           : " + usia + "\n" +
               "Jenis Kelamin  : " + jenisKelamin +
               "\nTipe           : BPJS";
    }

    // Overload (opsional)
    public String getInfoPasien(String catatan) {
        return getInfoPasien() + "\nCatatan        : " + catatan;
    }
}
