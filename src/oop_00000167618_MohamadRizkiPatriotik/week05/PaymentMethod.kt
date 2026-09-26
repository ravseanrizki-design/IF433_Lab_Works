package oop_00000167618_MohamadRizkiPatriotik.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
