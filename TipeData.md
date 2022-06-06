## Tipe Data
Java adalah bahasa yang sangat diketik; Oleh karena itu Anda harus mendeklarasikan tipe data untuk semua variabel.

Karena itu Kamu harus tahu tipe data yang ada di di Java.

### Tipe Data Number
Data number sering kali kita gunakan dalam kehidupan sehari-hari seperti uang, jumlah, nilai ujian sekolah, harga barang, dan lain-lain.

Di Java tidak hanya memiliki 1 tipe data number, dan masing-masing memiliki kapasitas daya tampung yang berbeda. Oleh karena itu ada banyak sekali tipe data number, dan kita bisa gunakan sesuai dengan kebutuhan kita.

Di Java Tipe Data Number dikelompokan menjadi dua 
- Integer; yaitu tipe data number bilangan bulat
- Floating Point; yaitu tipe data number bilangan desimal

Masing-masing kelompok di bagi lagi menurut batas minimal dan maksimal yang bisa ditampung serta annya pun berbeda-beda.

#### Tipe Data Interger
| Tipe Data |       Minimal        |       Maximal       | Ukuran | Nilai Default |
|:---------:|:--------------------:|:-------------------:|:------:|:-------------:|
|   byte    |         -128         |         127         | 1 byte |       0       |
|   short   |        -32768        |        32767        | 2 byte |       0       |
|    int    |     -2147483648      |     2147483647      | 4 byte |       0       |
|   long    | -9223372036854775808 | 9223372036854775807 | 8 byte |       0       |
#### Tipe Data Floating Point
| Tipe Data |       Minimal       |      Maximal       | Ukuran  | Nilai Default |
|:---------:|:-------------------:|:------------------:|:-------:|:-------------:|
|   float   |      3.4e−038       |      3.4e+038      | 4 bytes |      0.0      |
|  double   |      1.7e−308       |      1.7e+308      | 8 byte  |      0.0      |
### Membuat Variable Tipe Data Number
Sekarang kita coba membuat variable dengan macam-macam tipe data number di Java
```java
public class TypeDataNumber {
    byte thisByte = 100;
    short thisShort = 1000;
    int thisInt = 10000000;
    long thisLong = 1000000000;
    long thisLong2 = 1000000000L;

    float thisFloat = 10.10F;
    double thisDouble = 10.10;
}
```
Untuk tipe data `float` dan `long` agak sedikit berbeda;
- long ;kita bisa (red: tidak wajib) menambahkan `L` (besar atau kecil) di belakang angka untuk menandakan bahwa itu adalah `long` .
- float ;kita wajib menambahkan `F` (besar atau kecil) di belakang angka.

Di Java kita juga bisa menambahkan garis bawah (`_`) pada data. Java tidak mengartikannya khusus karena ini biasanya digunakan untuk memudahkan ita ketika membaca angka.

```java
public class TypeDataNumber {
    byte thisByte = 100;
    short thisShort = 1_000;
    int thisInt = 10_000_000;
    long thisLong = 1_000_000_000;
    long thisLong2 = 1_000_000_000L;

    float thisFloat = 10.10F;
    double thisDouble = 10.10;
}
```
Sekarang kita bisa membaca angka pada kode program diatas lebih mudah dibandingkan tanpa garis bawah.

### Literals
Tipe data number di Java secara default merupakan _decimal_ literals, yaitu bilangan basis 10. Kadang kita butuh membuat number dengan literals lain. Dan Java mendukung beberapa literals, diantaranya:
1. Decimal:  : Basis 10, yang artinya digitnya adalah 0 sampai 9. Secara default number di Java adalah decimal (basis 10).
2. Hexadecimal : Basis 16, dimana digitnya adalah 0 sampai 9 dan A sampai F. Untuk membuatan hexadecimal, kita wajib menambahkan 0x (nol + x) diawal angka.
3. Binary : Basis 2, dimana digitnya adalah 0 dan 1. Untuk membuat binary, kita wajib menambahkan 0b (nol + b) di awal angka.

```java
public class TypeDataNumber {
    public static void main(String[] args) {
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;
    }
}
```
Untuk penulisan :
- hexadesimal diawali dengan 0x....
- binary diawali dengan 0b....

### Konversi Tipe Data Number
Misal kita ingin melakukan konversi dari tipe data long ke int, atau dari double ke long, dan lain-lain. Konversi tipe data number di Java bisa dilakukan secara :
- Widening Casting (otomatis),dan
- Narrowing Casting (manual)
#### Widening Casting (otomatis)
Widening Casting terjadi dimana tipe data dengan daya tampung lebih kecil di konversi ke tipe data dengan daya tampung yang lebih besar. Seperti ini urutannya:
```
byte -> short -> int -> long -> float -> double
```
Artinya, jika kita konversi dari byte ke int, maka itu akan dikonversi secara otomatis. Atau kita konversi dari int ke double, itu juga akan dikonversi secara otomatis.

```java
public class WideningCasting {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
    }
}
```

#### Narrowing Casting (manual)
Sedangkan Narrowing Casting terjadi dimana tipe data dengan data tampung lebih besar dikonversi ke tipe data dengan daya tampung lebih kecil. Seperti ini urutannya:

```double -> float -> long -> int -> short -> byte```
Untuk melakukan narrowing casting, kita wajib menyebutkan tipe datanya secara eksplicit ketika melakukan konversi:
```TipeData variable = (TipeData) dariVariable;```
```java
public class NarrowingCasting {
    public static void main(String[] args) {
        int iniInt = 1000;
        byte iniByte = (byte) iniInt;
        short iniShort = (short) iniInt;
    }
}
```
### Masalah
Hati-hati jika melakukan konversi tipe data number secara narrowing, terutama ketika data nya melebihi kapasitas yang dituju. Misal ketika data int 1000000 di konversi ke short, maka 1000000 tersebut tidak bisa ditampung oleh short, maka secara otomatis akan terjadi number overflow (kelebihan number)

Hal ini tidak akan menjadikan error, hanya saja, number di variable byte nilainya akan berbeda dari int, number overflow akan kembali lagi ke bilangan minimal awal sebuah tipe data number.

```java
public class KonversiNumberOverflow {
  public static void main(String[] args) {

    int iniInt = 128;
    byte iniByte = (byte) iniInt;
    System.out.println(iniByte); // -128
    
    int iniInt2 = 129;
    byte iniByte2 = (byte) iniInt2;
    System.out.println(iniByte2); // -127
  }
}
```
Pada kode diatas, iniByte akan menghasilkan -128, karena maksimal data tampung byte adalah 127, sehingga terjadi number overflow, dan kelebihan 1 nya akan berputar ke angka paling awal lagi, yaitu -128.

Sedangkan iniByte2 akan bernilai -127, karena 129 melebihi maksimal data tampung byte adalah 127, sehingga menjadi number overflow, dan kelebihannya dalah 2, sehingga berputar ke angka byte paling awal yaitu -128, namun karena overflow nya sebesar 2 angka, berarti setelah -128, dia naik ke -127.