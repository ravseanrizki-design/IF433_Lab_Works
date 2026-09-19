package oop_00000167618_MohamadRizkiPatriotik.week03

fun main() {
    println("=== TEST LATIHAN TERBIMBING: EMPLOYEE ===")
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 // Harusnya print ERROR dan set ke 0
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Coba uncomment, pasti Merah/Error karena private
    e.printStatus()

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")


    println("\n=== TEST TUGAS 1: WEAPON ===")
    val excalibur = Weapon("Excalibur", 400)
    println("Senjata: ${excalibur.name} | Damage Awal: ${excalibur.damage} | Tier: ${excalibur.tier}")

    // Coba set damage ke -50 (Harus gagal & mempertahankan nilai lama)
    excalibur.damage = -50
    println("Damage setelah set -50: ${excalibur.damage}")

    // Coba set damage ke 9999 (Harus dipaksa menjadi 1000)
    excalibur.damage = 9999
    println("Damage setelah set 9999: ${excalibur.damage}")
    println("Tier sekarang: ${excalibur.tier}") // Harus menjadi Legendary


    println("\n=== TEST TUGAS 2: PLAYER ===")
    val player = Player("GamerPro99")

    // Pengujian Akses Private Property (Akan Error jika di-uncomment)
    // player.xp = 100

    println("User: ${player.username} | Level Awal: ${player.level}")

    // Tambah 50 XP (Total XP = 50, Level tetap 1)
    println("Menambahkan 50 XP...")
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    // Tambah 60 XP (Total XP = 110, Harus memicu Level Up ke level 2)
    println("Menambahkan 60 XP...")
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}
