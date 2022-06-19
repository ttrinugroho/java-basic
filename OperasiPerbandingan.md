## Operasi Perbandingan di Java
Operasi perbandingan adalah operasi untuk membandingkan 2 (dua) buah data yang menghasilkan nilai boolean (benar atau salah).

Jika hasil operasinya adalah `benar`, maka nilainya adalah `true` dan jika `salah` nilainya adalah `false`;

| Operator | Keterangan              |
|:---------|:------------------------|
| >        | Lebih dari              |
| <        | Kurang Dari             |
| >=       | Lebih dari sama dengan  |
| <=       | Kurang dari sama dengan |
| ==       | Sama dengan             |
| !=       | Tidak Sama dengan       |

Contoh penggunaan sangat sederhana :
```java
public class OperasiPerbandingan {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        System.out.println( a > b); // false
        System.out.println( a < b); // false
        System.out.println( a >= b); // true
        System.out.println( a <= b); // true
        System.out.println( a == b); // true
        System.out.println( a != b); // false
    }
}
```
Operasi perbandingan dapat dilakukan di semua tipe data number.

#### Selanjutnya [Operasi Boolean](./OperasiBoolean.md)
> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);