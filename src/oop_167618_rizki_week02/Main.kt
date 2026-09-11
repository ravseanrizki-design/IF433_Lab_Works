package oop_167618_rizki_week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // ========================================================
    // B. LATIHAN TERBIMBING (GUIDED LAB)
    // ========================================================
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    // Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        // Pilihan Jalur Pendaftaran
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // Memanggil Primary Constructor (Lengkap dengan Jurusan)
            val s1 = Student(name, nim, major = major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
            println("Status: Pendaftaran Selesai.")

        } else if (type == 2) {
            // Memanggil Secondary Constructor (Jurusan otomatis "Non-Matriculated")
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
            println("Status: Pendaftaran Selesai.")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    // ========================================================
    // D. TUGAS MANDIRI 1: LIBRARY FINE SYSTEM (CHECKPOINT 8)
    // ========================================================
    println("\n--- TUGAS MANDIRI 1: LIBRARY SYSTEM ---")
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine() // Bersihkan buffer

    // Validasi input durasi tidak boleh minus
    if (duration < 0) {
        duration = 1
    }

    // Instansiasi Objek Loan
    val loan = Loan(title, borrower, duration)
    println("Detail Peminjaman: Buku \"${loan.bookTitle}\" oleh ${loan.borrower} selama ${loan.loanDuration} hari.")
    println("Total Denda: Rp ${loan.calculateFine()}")


    // ========================================================
    // E. TUGAS MANDIRI 2: MINI RPG BATTLE (CHECKPOINT 10)
    // ========================================================
    println("\n--- TUGAS MANDIRI 2: MINI RPG BATTLE ---")
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine() // Bersihkan buffer

    // Membuat objek Hero
    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    // Loop pertempuran
    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu RPG: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()
        scanner.nextLine() // Bersihkan buffer

        if (choice == 1) {
            // Hero menyerang musuh
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")

            // Musuh membalas jika belum mati
            if (enemyHp > 0) {
                val randomDamage = (10..20).random()
                hero.takeDamage(randomDamage)
                println("Musuh membalas! Sisa HP ${hero.name}: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("Anda memilih kabur!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
    }

    // Pengumuman pemenang
    if (!hero.isAlive()) {
        println("Hero ${hero.name} telah mati. Pertandingan Selesai.")
    } else if (enemyHp <= 0) {
        println("Selamat! Anda memenangkan pertandingan!")
    }
}
