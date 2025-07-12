# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pasien rumah sakit menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input data pasien dengan dua tipe: *BPJS (umum)* dan *VIP (rawat inap berbayar)*. Aplikasi akan menampilkan informasi lengkap pasien, termasuk total biaya inap jika pasien VIP.

Program ini menerapkan berbagai konsep penting dalam OOP (Object-Oriented Programming) seperti: Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Overloading, Overriding, Seleksi, Perulangan, Input/Output, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object.

```java
public class Pasien {
    ...
}

public class PasienVip extends Pasien {
    ...
}

public class RumahSakitApp {
    ...
}
```

2. *Object* adalah instance dari class.

```java
Pasien pasien1 = new Pasien("Ani", 25, "P");
PasienVip pasien2 = new PasienVip("Budi", 30, "L", "VIP-01", 3, 500000);
```

3. *Atribut* adalah variabel yang ada dalam class.

```java
private String nama;
private int usia;
private String jenisKelamin;
```

4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object.

```java
public Pasien(String nama, int usia, String jenisKelamin) {
    this.nama = nama;
    this.usia = usia;
    this.jenisKelamin = jenisKelamin;
}
```

5. *Mutator (Setter)* digunakan untuk mengubah nilai dari suatu atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}
```

6. *Accessor (Getter)* digunakan untuk mengambil nilai dari suatu atribut.

```java
public String getNama() {
    return nama;
}
```

7. *Encapsulation* menyembunyikan data dengan membuat atribut menjadi private.

```java
private String nama; // hanya bisa diakses lewat getter/setter
```

8. *Inheritance* digunakan agar satu class mewarisi class lainnya.

```java
public class PasienVip extends Pasien {
    // pewarisan dari class Pasien
}
```

9. *Polymorphism* mencakup overloading dan overriding.

```java
@Override
public String getInfoPasien() {
    ...
}

public String getInfoPasien(String catatan) {
    ...
}
```

10. *Seleksi* digunakan untuk memilih jalur logika.

```java
if (tipe == 2) {
    daftarPasien[i] = new PasienVip(nama, usia, jk, ruang, lama, biaya);
} else {
    daftarPasien[i] = new Pasien(nama, usia, jk);
}
```

11. *Perulangan* digunakan untuk mengulang masukan dan output data.

```java
for (int i = 0; i < jumlahPasien; i++) {
    System.out.println("[Input Pasien ke-" + (i + 1) + "]");
    ...
}
```

12. *IO Sederhana* digunakan untuk masukan dan keluaran.

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama pasien: ");
String nama = input.nextLine();
```

13. *Array* menyimpan data pasien dalam jumlah banyak.

```java
Pasien[] daftarPasien = new Pasien[jumlahPasien];
```

14. *Error Handling* mencegah crash akibat kesalahan input.

```java
try {
    // input data
} catch (InputMismatchException e) {
    System.out.println("Kesalahan input.");
    input.nextLine(); // flush scanner
}
```

## Usulan Nilai

|  No | Materi         | Nilai |
| :-: | -------------- | :---: |
|  1  | Class          |   5   |
|  2  | Object         |   5   |
|  3  | Atribut        |   5   |
|  4  | Constructor    |   5   |
|  5  | Mutator        |   5   |
|  6  | Accessor       |   5   |
|  7  | Encapsulation  |   5   |
|  8  | Inheritance    |   5   |
|  9  | Polymorphism   |   10  |
|  10 | Seleksi        |   5   |
|  11 | Perulangan     |   5   |
|  12 | IO Sederhana   |   10  |
|  13 | Array          |   15  |
|  14 | Error Handling |   15  |
|     | *TOTAL*        | *100* |

## Pembuat

Nama: Muhammad Maulana
NPM: 2310010375
