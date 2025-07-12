package maulana375;

public class PasienVip extends Pasien {

    // Atribut tambahan untuk pasien VIP
    private String ruangVip;
    private int lamaInap;
    private double biayaPerHari;

    // Konstruktor
    public PasienVip(String nama, int usia, String jenisKelamin,
                     String ruangVip, int lamaInap, double biayaPerHari) {
        super(nama, usia, jenisKelamin);
        this.ruangVip = ruangVip;
        this.lamaInap = lamaInap;
        this.biayaPerHari = biayaPerHari;
    }

    // Getter
    public String getRuangVip() {
        return ruangVip;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public double getBiayaPerHari() {
        return biayaPerHari;
    }

    // Hitung total biaya
    public double hitungTotalBiaya() {
        return lamaInap * biayaPerHari;
    }

    // Override info pasien
    @Override
    public String getInfoPasien() {
        return super.getInfoPasien().replace("Tipe           : BPJS", "") + "\n" +
               "Tipe           : VIP\n" +
               "Ruang VIP      : " + ruangVip + "\n" +
               "Lama Inap      : " + lamaInap + " hari\n" +
               "Biaya per Hari : Rp" + biayaPerHari + "\n" +
               "Total Biaya    : Rp" + hitungTotalBiaya();
    }
}
