# Prinsip SOLID dalam OOP

**Latihan mempelajari prinsip SOLID dalam Object Oriented Programming
Oleh: 181524031 - 2A/D4 - Zara Veda Mahendra**

Latihan ini mengikuti instruksi pada [laman ini] (https://github.com/stefkavasileva/SoftUni-Software-Engineering/tree/master/C%23Fundamentals/OOP-Advanced/Exercises/SOLID-Lab).

Solusi SOLID pada program tersebut ditulis dalam bahasa Java.

## 1. Stream Progress
**_Prinsip yang digunakan: OCP dan LSP_**

Pada latihan program Stream Progress, diminta melakukan refactor agar kelas **StreamProgressInfo** dapat berjalan dengan jenis **Stream** yang berbeda. Selain itu, diharapkan jika ada stream baru, hanya perlu menambah kelas baru dengan method getter **BytesSend** dan **Length** di dalamnya.

Prinsip yang pertama digunakan adalah **OCP**. Menggunakan prinsip ini, suatu kelas dapat terbuka, tetapi tidak untuk modifikasi. OCP diterapkan dalam bentuk interface **Streamable** yang berisi method getter **BytesSent** dan **Length**.

Kemudian, prinsip **LSP** diterapkan dalam pengaksesan jenis stream yang berbeda oleh **StreamProgressInfo**. Akses tersebut dilakukan melalui base stream, yaitu interface **Streamable**.

## 2. Graphic Editor
**_Prinsip yang digunakan: OCP dan LSP_**

Pada program Graphic Editor, diminta untuk melakukan refactor sehingga kelas **GraphicEditor** dapat menggambar bentuk apapun. Ketika ada penambahan bentuk baru, diharapkan hanya tinggal menambahkan kelas baru saja.

Mirip seperti pada program Stream Progress, prinsip yang diterapkan adalah prinsip **OCP** dan **LSP**. 

Prinsip OCP yaitu pada interface **Shape**. Interface ini terbuka untuk ekstensi tetapi tertutup untuk modifikasi.

Prinsip LSP diterapkan dalam pengaksesan bentuk yang berbeda oleh kelas **GraphicEditor**. Akses oleh **GraphicEditor** dilakukan melalui interface **Shape**.

Apabila nantinya akan ditambahkan bentuk baru, maka tinggal menambahkan kelas baru yang meng-_implement_ interface Shape.

## 3. Detail Printer
**_Prinsip yang digunakan: OCP dan SRP_**

Refactor yang dilakukan pada Detail Printer harus memungkinkan kelas **DetailPrinter** tidak melakukan pemeriksaan jenis employee. Kelas tersebut hanya perlu menampilkan rincian dari setiap jenis employee yang ada.

Prinsip **OCP** diterapkan dengan mengubah **Employee** menjadi superclass dan **Manager** menjadi subclassnya. Maka, polymorphism melalui kelas tersebut. Sehingga, **DetailsPrinter** dapat menerapkan **SRP**, yaitu hanya melakukan _print_ saja tanpa harus memeriksa jenis employee.
