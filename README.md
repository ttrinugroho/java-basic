# Belajar Java Dasar
Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995.

Repository ini merupakan hasil rangkuman belajar java dasar yang saya ikuti di course **Pemrogramman Java: Pemula sampai Mahir** dari ProgrammerZamanNow.com.

> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);

## Variable
Membuat `variable` di java kita perlu menentukan tipe data yang akan kita gunakan. Dan setelah `variable` dibuat, `variable` tidak dapat diubah tipe data nya.

Secara teori penulisan variable di java adalah seperti berikut:
```
TipeData NamaVariable;
```
### Syarat Penulisan Variable di Java
Ada syarat penulisan dan penggunaan `variable` di java, diantaranya :
- Variable tidak boleh menggunakan spasi
- Variable tidak boleh angka semua
- Disarankan variable menggunakan format camelCase, seperti firstName, lastName, fullName
```java
public class Variable{
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        boolean married;
        firstName = "Teguh";
        lastName = "Tri Nugroho";
    }
}
```
### Kata Kunci Var
Java mendukung pembuatan variable dengan kata kunci var. Ini bisa mempermudah saat membuat variable, karena kita tidak perlu mengetikan tipe data nya. Java akan secara otomatis mendeteksi tipe datanya sesuai dengan data yang kita masukkan ke dalam variable.
Namun syaratnya untuk menggunakan kata kunci var adalah, pembuatan variable nya harus langsung dengan data nya.

```java
public class Variable {
    public static void main(String[] args) {
        var firstName = "Teguh";
        var value = 1000; // int
        var amount = 1000000L; // long
    }
}
```
[- Fitur ini baru ada di java v10 ke atas. Jadi, pastikan menggunakan versi java 10 keatas -]

### Final Variable
Secara default nilai variable dapat di ubah-ubah. Namun kita kadang ingin membuat variable yang nilainya tidak dapat diubah lagi. Atau orang biasa menyebut ini adalah variable konstan.

Untuk membuat variable constan di java cukup dengan menambahkan kata kunci `final` diawal. Semua variable yang bersifat `final` tidak akan bisa diubah lagi nilainya setelah pertama kali dimasukkan nilainya. Jika kita coba ubah, maka otomatis akan erorr.
```java
public class Variable {
    final var firstName = "Teguh";
    firstName = "Budi"; // Error
    final String lastName;
    lastName = "Tri Nugroho";
    lastName = "Santosa"; // Error
}
```
> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);
#### Selanjutnya [Tipe Data](/TipeData.md);