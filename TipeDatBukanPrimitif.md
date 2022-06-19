## Tipe Data Bukan Primitif
Java merupakan bahasa pemrograman berorientasi object, 
Tipe data primitif adalah tipe data bawaan dari bahasa pemrograman, di Java ada delapan tipe data primitif. Seperti yang sudah di bahas di bagian [TipeData.Md](/TipeData.md) yaitu:
`byte` `short` `int` `long` `float` `double` `boolean` `char`
Bagaimana dengan String ? `String` bukanlah tipe data primitif, melainkan tipe data Object.

Di Java semua tipe data primitif memiliki representasi tipe data bukan primitifnya:

| Tipe Data Primitif | Tipe Data Bukan Primitif |
|:------------------:|:------------------------:|
|        byte        |           Byte           |
|       short        |          Short           |
|        int         |         Integer          |
|        long        |           Long           |
|       float        |          Float           |
|       double       |          Double          |
|        char        |        Character         |
|      boolean       |         Boolean          |

Saat bikin variable dengan tipe data bukan primitif, maka default value nya adalah `null` . Sebagai contoh: saat bikin variable dengan tipe data `int` default value nya adalah `0`, sedangkan saat menggunakan tipe data `Integer` maka default value nya adalah `null`.

```java
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10_000L;
        
        Byte iniByte;// default value null
        iniByte = 100;
    }
}
```
### Konversi Tipe Data Primitif ke Bukan Primitif
Gimana kalau ada tipe data primitif lalu ingin diubah ke tipe data bukan primitif ?

Ini sederhana sih, tinggal assign value data primitif ke bukan primitif. Contohnya seperti berikut:
```java
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        int iniInt = 100;
        Integer iniInteger = iniInt;
        int dataInt = iniInteger;
    }
}
```
Dengan metode ini secara otomatis terkonversi ke tipe data bukan primitif.
Begitu sebaliknya, kalau ingin konversi data bukan primitif ke primitif tinggal di masukkan saja value nya ke valiarible primitif.

Nah bagaimana kalau mengkonversi dari tipe data bukan primitif ke tipe data primitif yang tidak compatible ?

Integer ke int itu compatible, sedang Integer ke yang lain itu tidak compatible. harus dikonversi.

Untuk mengkonversi dari data bukan primitif ke tipe data primitif namun tidak compatible, maka menggunakan method atau function bawaan sesuai tipe data yang akan menampungnya. Seperti contoh:
```java
public class KonversiTipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 11000;
        short shortAge = iniInteger.shortValue();
        byte byteAge = iniInteger.byteValue();
        long longAge = iniInteger.longValue();
        float floatAge = iniInteger.floatValue();
    }
}
```
Jadi semua data bukan primitif memiliki function seperti diatas, tinggal digunakan untuk melakukan konversi ke tipe data primitif.

#### Selanjutnya [Tipe Data Array](./TipeDataArray.md)
> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);