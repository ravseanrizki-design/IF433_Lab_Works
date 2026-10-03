package oop_00000167618_MohamadRizkiPatriotik.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu '$name' menyala terang.")
    }

    override fun turnOff() {
        println("Lampu '$name' dimatikan.")
    }
}
