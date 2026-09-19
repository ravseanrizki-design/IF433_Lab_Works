package oop_00000167618_MohamadRizkiPatriotik.week01

fun main() {
    val gameTitle = "Black Myth: Wukong"
    val price = 700000
    val userNote: String? = null // Simulasi null safety challenge

    val discount = _root_ide_package_.oop_00000167618_MohamadRizkiPatriotik.week01.calculateDiscount(price)
    val finalPrice = price - discount

    // Memanggil fungsi struk menggunakan Named Arguments
    _root_ide_package_.oop_00000167618_MohamadRizkiPatriotik.week01.printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Game         : $title")
    println("Harga Asli   : Rp $originalPrice")
    println("Harga Akhir  : Rp $finalPrice")
    println("Catatan      : ${note ?: "Tidak ada catatan"}")
    println("===============================")
}
