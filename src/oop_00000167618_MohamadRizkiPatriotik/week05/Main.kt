package oop_00000167618_MohamadRizkiPatriotik.week05

fun main() {

    // ===================================================================
    // GUIDED LAB: Polymorphic Collection & Smart Casting (LANGKAH 4)
    // ===================================================================

    // val p = Pegawai("Test") // <-- Compiler Error: Cannot create an instance
    //                             of an abstract class. Sudah dihapus sesuai instruksi.

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List bertipe Parent (Pegawai), isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Runtime Polymorphism: method yang dipanggil ditentukan oleh objek aslinya
        pegawai.bekerja()

        // pegawai.mengajar() // ERROR karena tipe referensinya adalah Pegawai

        // Smart Casting dengan operator "is" dan blok "when"
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast, tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    // ===================================================================
    // TUGAS MANDIRI 1: Compile-Time Polymorphism (Overloading)
    // ===================================================================

    println("\n=== TEST MATH HELPER (METHOD OVERLOADING) ===")
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas persegi (sisi = 5)        : $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    println("Luas persegi panjang (4 x 6)    : $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas lingkaran (jari-jari = 7.0): $luasLingkaran")

    // ===================================================================
    // TUGAS MANDIRI 2: Sistem Pembayaran (Abstraction & Smart Casting)
    // ===================================================================

    println("\n=== SISTEM PEMBAYARAN E-COMMERCE ===")

    val eWallet = EWallet(accountName = "Budi", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Ani", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    // Percobaan pembayaran pertama (EWallet seharusnya gagal, saldo < 75000)
    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)
    }


