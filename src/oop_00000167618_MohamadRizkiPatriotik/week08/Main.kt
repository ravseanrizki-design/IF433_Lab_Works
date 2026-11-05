package oop_00000167618_MohamadRizkiPatriotik.week08

fun main() {
    // ===== C. Safe Calls & Elvis =====
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
