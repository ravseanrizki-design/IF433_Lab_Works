package oop_00000167618_MohamadRizkiPatriotik.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Pembayaran sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName - EWallet] Saldo tidak cukup. Saldo saat ini: $balance, dibutuhkan: $amount")
        }
    }

    // Fungsi spesifik EWallet
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top up sebesar $amount berhasil. Saldo sekarang: $balance")
    }
}
