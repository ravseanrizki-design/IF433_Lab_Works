package oop_00000167618_MohamadRizkiPatriotik.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {

        println("Connecting to $url...")
    }
}
