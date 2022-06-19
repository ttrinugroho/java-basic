## Tipe Data Array di Java
Array adalah tipe data yang berisikan kumpulan data dengan tipe data yang sama.

Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.

### Membuat Array
Ada banyak cara untuk membuat data array.
- 1 membuat array dengan cara manual
```java
public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3]; // 3: array ini hanya mampu nenampung 3 data;
        arrayString[0] = "Teguh";
        arrayString[1] = "Tri";
        arrayString[2] = "Nugroho";
        
    }
}
```

- 2 Membuat array dengan cara ***Array Initializer***
```java
public class TipeDataArray {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        
        long[] arrayLong = {
                100, 1_000, 10_000, 100_000
        };
    }
}
```

### Operasi di Array
Ada 3 operasi array yang biasa digunakan. yaitu:

| Operasi Array               | Keterangan              |
|:----------------------------|:------------------------|
| variableName[index]         | Mengambil data di Array |
| variableName[index] = value | Mengubah data di Array  |
| variableName.length         | Mengambil panjang array |

### Membuat Array didalam Array

```java
public class ArrayDalamArray {
    public static void main(String[] args) {
        String[][] members= {
                {"Teguh","Tri","Nugroho"},
                {"Eko","Kurniawan","Khanedi"},
                {"Mrkus","Horison"}
        };
        // Cara mengambil value array;
        System.out.println(members[0][0]); // Teguh
        System.out.println(members[1][0]); // Eko
    }
}
```

#### Selanjutnya [Operasi Matematika](./OperasiMatematika.md)

> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);