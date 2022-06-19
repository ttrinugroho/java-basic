## Operasi Boolean
Operasi untuk membandingan 2 (dua) data atau lebih yang diperuntukan untuk tipe data boolean.

Ini ada beberapa operator boolean:

| Operator      | Logic Name | Symbol Name      | Keterangan |
|:--------------|:-----------|:-----------------|:-----------|
| &&            | AND        | Ampersand        | Dan        |
| <code>&#124;&#124;</code> | OR         | vertical bar     | Atau       |
| !             | NOT        | Exclamation mark | Kebalikan  |

### Operasi && (Logical And)

| Nilai1  | Operator  | Nilai2  | Hasil   |
|:--------|:---------:|:--------|:--------|
| `true`  |    &&     | `true`  | `true`  |
| `true`  |    &&     | `false` | `false` |
| `false` |    &&     | `true`  | `false` |
| `false` |    &&     | `false` | `false` |

Nilai1 dan Nilai2 harus true agar mendapat nilai true.

### Operasi || (Logical Or)

| Nilai1  |    Operator    | Nilai2  | Hasil    |
|:--------|:--------------:|:--------|:---------|
| `true`  | <code>&#124;&#124;</code> | `true`  | `true`   |
| `true`  | <code>&#124;&#124;</code> | `false` | `true`   |
| `false` | <code>&#124;&#124;</code> | `true`  | `true`   |
| `false` | <code>&#124;&#124;</code> | `false` | `false`  |

Nilai1 atau Nilai2, salah satu harus berilai true agar mendapat nilai true. 

### Operasi ! (Logical Not)

| Operator | Nilai | Hasil |
|---------:|:-----:|:------|
|        ! | true  | false |
|        ! | false | true  |

Hasil berkebalikan dari Nilai .

### Contoh penerapan Operasi Boolean

```java
public class OperasiBoolean {
    public static void main(String[] args) {
        int absen = 70;
        int nilaiAkhir = 80;
        
        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 85;
        boolean lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
```
### Selanjutnya >> [Method](./Method.md)
> Tonton Semua Materi Pemrograman Dasar Java Basic di [ProgrammerZamanNow](https://www.udemy.com/course/pemrograman-java-pemula-sampai-mahir);