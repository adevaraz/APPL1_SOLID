# Prinsip SOLID dalam OOP

**Latihan mempelajari prinsip SOLID dalam Object Oriented Programming
Oleh: 181524031 - 2A/D4 - Zara Veda Mahendra**

Latihan ini mengikuti instruksi pada laman: https://github.com/stefkavasileva/SoftUni-Software-Engineering/tree/master/C%23Fundamentals/OOP-Advanced/Exercises/SOLID-Lab.

Solusi SOLID pada program tersebut ditulis dalam bahasa Java.

## 1. Stream Progress
**_Prinsip yang digunakan: OCP_**

Pada latihan program Stream Progress, diminta melakukan refactor agar kelas **StreamProfressInfo** dapat berjalan dengan jenis **Stream** yang berbeda. Selain itu, diharapkan jika ada stream baru, hanya perlu menambah class baru dengan method getter **BytesSend** dan **Length** di dalamnya.

Prinsip yang digunakan adalah OCP. Menggunakan prinsip ini, suatu kelas dapat terbuka, tetapi tidak untuk modifikasi. OCP diterapkan dalam bentuk interface **Streamable** yang berisi method getter **BytesSent** dan **Length**.

## 2. Graphic Editor

## 3. Detail Printer