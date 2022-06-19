## Operasi Matematika di Java
Ada banyak sekali sebenarnya operasi matematika yang ada di Java. Namun tenang aja karena hanya operasi basic.

| Operator | Keterangan      |
|:---------|:----------------|
| +        | Penjumlahan     |
| -        | Pengurangan     |
| *        | Perkalian       |
| /        | Pembagian       |
| %        | Sisa Pembagian  |

Untuk melakukan operasi matematika cukup sederhana, selama data nya adalah number seperti `int`, `long`, `float` dan sebagainya bisa langsung menggunakan operasi matematika.

```java
public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        
        System.out.println( a + b ); // 110
        System.out.println( b - a ); // 90
        System.out.println( a * b ); // 1000
        System.out.println( b / a ); // 10
        System.out.println( b % a ); // 0
    }
}
```
### Augmented Assignments
Adalah operasi yang hasil operasi matematika dengan dirinya sendiri dimasukkan ke dalam variabel dirinya sendiri.

| Operasi Matematika | Augmented Asignments |
|:-------------------|:---------------------|
| a = a + 10         | a +=10               |
| a = a - 10         | a -=10               |
| a = a * 10         | a *=10               |
| a = a / 10         | a /=10               |
| a = a % 10         | a %=10               |

### Unary Operator
| Unary Operator | Keterangan        | Operator Matematika |
|:---------------|:------------------|:--------------------|
| ++             | Menambah 1        | a = a+1             |
| --             | Mengurang 1       | a = a-1             |
| -              | Negative          | -                   |
| +              | Positif           | -                   |
| !              | Boolean kebalikan | -                   |

Contoh Unary Operator Sebagai Berikut:

```java
public class UnaryOperator {
    public static void main(String[] args) {
        int a = +100; // gak wajib pakai +
        int b = -10;
        a++;
        System.out.println(a);// 101
        a--;
        System.out.println(a);//100
        System.out.println(!true); // false ; kebalikan dari true adalah false
        System.out.println(!false); // true ; kebalikan dari false adalah true

    }
}
```
#### Selanjutnya [Tipe Data Array](./OperasiPerbandingan.md)
> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);