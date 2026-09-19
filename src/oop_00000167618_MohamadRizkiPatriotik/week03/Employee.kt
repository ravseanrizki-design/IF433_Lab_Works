package oop_00000167618_MohamadRizkiPatriotik.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Gunakan field, bukan this.salary untuk menghindari StackOverflow
            } else {
                field = value // Gunakan field untuk assign nilai asli
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}
