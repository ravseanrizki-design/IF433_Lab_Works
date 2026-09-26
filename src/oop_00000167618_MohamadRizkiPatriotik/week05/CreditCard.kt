package oop_00000167618_MohamadRizkiPatriotik.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - CreditCard] Pembayaran sebesar $amount berhasil. Total terpakai: $usedAmount / $limit")
        } else {
            println("[$accountName - CreditCard] Transaksi ditolak, melebihi limit ($limit). Sudah terpakai: $usedAmount")
        }
    }
}
