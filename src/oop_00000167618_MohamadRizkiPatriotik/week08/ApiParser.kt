package oop_00000167618_MohamadRizkiPatriotik.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Jika id / name hilang -> throw IllegalArgumentException (ditangkap di main)
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name (ID: $id)" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null // tipe tidak dikenal atau null
        }
    }
