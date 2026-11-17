package oop_00000167618_MohamadRizkiPatriotik.week09

// roe = Return on Equity (dalam persen), status = "OPEN" atau "CLOSED"
data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)
