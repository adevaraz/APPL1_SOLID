# Prinsip SOLID dalam OOP

**Latihan mempelajari prinsip SOLID dalam Object Oriented Programming
Oleh: 181524031 - 2A/D4 - Zara Veda Mahendra**

Latihan ini mengikuti instruksi pada [laman ini](https://github.com/stefkavasileva/SoftUni-Software-Engineering/tree/master/C%23Fundamentals/OOP-Advanced/Exercises/SOLID-Lab).

Solusi SOLID pada program tersebut ditulis dalam bahasa Java.

## 1. Stream Progress
**_Prinsip yang digunakan: OCP_**

Pada latihan program Stream Progress, diminta melakukan refactor agar kelas `StreamProgressInfo` dapat berjalan dengan jenis `Stream` yang berbeda. Selain itu, diharapkan jika ada stream baru, hanya perlu menambah kelas baru dengan method getter `BytesSend` dan `Length` di dalamnya.

Prinsip yang digunakan adalah **OCP**. Menggunakan prinsip ini, suatu kelas dapat terbuka, tetapi tidak untuk modifikasi. OCP diterapkan dalam bentuk interface `Streamable` yang berisi method getter `BytesSent` dan `Length`.

## 2. Graphic Editor
**_Prinsip yang digunakan: OCP_**

Pada program Graphic Editor, diminta untuk melakukan refactor sehingga kelas `GraphicEditor` dapat menggambar bentuk apapun. Ketika ada penambahan bentuk baru, diharapkan hanya tinggal menambahkan kelas baru saja.

Mirip seperti pada program Stream Progress, prinsip yang diterapkan adalah prinsip **OCP**.

Prinsip OCP yaitu pada interface `Shape`. Interface ini terbuka untuk ekstensi tetapi tertutup untuk modifikasi. Apabila nantinya akan ditambahkan bentuk baru, maka tinggal menambahkan kelas baru yang meng-_implement_ interface `Shape`.

## 3. Detail Printer
**_Prinsip yang digunakan: OCP dan SRP_**

Refactor yang dilakukan pada Detail Printer harus memungkinkan kelas `DetailPrinter` tidak melakukan pemeriksaan jenis employee. Kelas tersebut hanya perlu menampilkan rincian dari setiap jenis employee yang ada.

Prinsip **OCP** diterapkan dengan mengubah `Employee` menjadi superclass dan `Manager` menjadi subclassnya. Maka, polymorphism melalui kelas tersebut. Sehingga, `DetailsPrinter` dapat menerapkan **SRP**, yaitu hanya melakukan _print_ saja tanpa harus memeriksa jenis employee.

## 4. Recharge
**_Prinsip yang digunakan: -_**

_Sudah mencoba mengerjakan, tetapi belum berhasil memahami penerapan SOLID pada program Recharge._

## 5. Security Door
**_Prinsip yang digunakan: ISP_**

Pada program ini, terdapat kelas `SecurityManager`, kelas abstrak `SecurityCheck`, dan interface `SecurityUI`. Kelas `KeyCardCheck` dan `PinCodeCheck` meng-_implement_ kelas `SecurityCheck`. Namun, karena keduanya membutuhkan method yang berbeda. Maka prinsip **ISP** digunakan agar keduanya memiliki interface yang berisi method khusus milik masing-masing.

### Sumber Pemahaman
1. Robert C. Martin. _Design Principles and Design Patterns_
2. [Grace Hopper Academy. _S.O.L.I.D. Principles of Object-Oriented Design - A Tutorial on Object-Oriented Design_](https://www.youtube.com/watch?v=GtZtQ2VFweA) 
