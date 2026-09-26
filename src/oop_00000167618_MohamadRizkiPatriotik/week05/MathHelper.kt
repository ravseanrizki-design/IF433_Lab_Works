package oop_00000167618_MohamadRizkiPatriotik.week05

class MathHelper {

    // Overload 1: luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Overload 2: luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Overload 3: luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}
