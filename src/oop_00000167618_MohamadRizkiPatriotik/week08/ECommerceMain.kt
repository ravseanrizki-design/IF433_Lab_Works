package oop_00000167618_MohamadRizkiPatriotik.week08

// Ubah baris import menjadi nested class seperti di bawah ini:
import oop_00000167618_MohamadRizkiPatriotik.week08.Product.Electronic
import oop_00000167618_MohamadRizkiPatriotik.week08.Product.Clothing

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    println("=== E-COMMERCE API PIPELINE ===")
    for (raw in rawApiData) {
        try {
            parser.parseProduct(raw)?.let { prod ->
                // Menggunakan cakupan objek 'prod' agar tidak perlu menulis nama variabel berulang kali
                when (prod) {
                    is Electronic -> println("Produk: ${prod.name} (Warranty ${prod.warrantyMonths})")
                    is Clothing -> println("Produk: ${prod.name} (Size ${prod.size})")
                }
                // Hapus tulisan 'product =' agar parameter dipanggil secara normal
                parser.checkout(prod)
            } ?: println("[SKIP] Tipe produk tidak dikenal untuk data: ${raw["name"]} (type=${raw["type"]})")
        } catch (e: IllegalArgumentException) {
            println("[WARNING] Data korup ditangkap: ${e.message}")
        }
    }


    }
