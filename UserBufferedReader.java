package java.fundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main(String[] args) {
        InputStreamReader write = new InputStreamReader(System.in); // dibantu StreamReader agar dapat membaca input dari Keyboard
        BufferedReader read = new BufferedReader(write); // inisialisasi seperti Scanner
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue = 0;

        try {
            System.out.print("Masukan Angka pertama : ");
            value = Integer.parseInt(read.readLine()); // untuk menyimpan nilai pada variabel, maka BufferedReader harud diparsing terlebih dahulu
            System.out.print("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(read.readLine());
//              bila ingin menyimpan data pada int maka nilai yang ada pada read.readLine()
//              harus dikonversi dahulu ke dalam bentuk integer menggunakan Integer.parseInt.

        } catch (IOException e) { // penanganan error BufferedReader
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}