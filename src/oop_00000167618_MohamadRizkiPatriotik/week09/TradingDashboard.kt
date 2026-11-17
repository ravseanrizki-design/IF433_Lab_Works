package oop_00000167618_MohamadRizkiPatriotik.week09

fun main() {
    // Data uji: campuran OPEN/CLOSED, roe positif/negatif, 3 koin berbeda
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 8.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 22.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -12.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 3.4, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -2.0, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 30, -18.9, "CLOSED")
    )
    // Pipeline 1: hanya transaksi CLOSED
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // Pipeline 2: winning trades (roe > 0)
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // Pipeline 3: losing trades (roe <= 0)
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // Pipeline 4: profit tertinggi -> terendah, lalu jadi String
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline 5: loss terbesar (paling negatif) di atas, lalu jadi String
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline tambahan: pasangan koin unik (OPEN maupun CLOSED)
    val uniquePairs = tradeHistory
        .map { it.pair }

    // Dashboard
    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    worstPerformersString.forEach { println(it) }
    println("Unique Pairs: $uniquePairs")

}