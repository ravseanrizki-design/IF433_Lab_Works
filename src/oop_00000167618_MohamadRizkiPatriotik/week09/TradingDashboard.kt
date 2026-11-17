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

}