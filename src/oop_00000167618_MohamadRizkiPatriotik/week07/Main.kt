package oop_000_nama.week07

import oop_00000167618_MohamadRizkiPatriotik.week07.DatabaseManager
import oop_00000167618_MohamadRizkiPatriotik.week07.NetworkClient

fun main() {
    // ===== LATIHAN 1: Singleton & Companion Object =====
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    // ===== LATIHAN 2: Data Class =====
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    // ===== LATIHAN 3: Sealed Class =====
    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // ===== TUGAS MANDIRI: RPG Core =====
    println("\n=== SIMULASI GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame() // Kedua kali: harus ditolak oleh Singleton

    println("\n=== SIMULASI FACTORY & ENUM ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: $starterWeapon")

    println("\n=== BLACKSMITH & EVENT ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Setelah upgrade: $upgradedItem")
    println("Senjata awal tetap utuh: ${starterWeapon.item}")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
