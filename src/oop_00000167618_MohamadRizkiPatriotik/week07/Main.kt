package oop_00000167618_MohamadRizkiPatriotik.week07

fun main() {
    // ===== LATIHAN 1: Singleton & Companion Object =====
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

}