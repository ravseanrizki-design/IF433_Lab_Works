package oop_00000167618_MohamadRizkiPatriotik.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' menyala.")
        startRecord() // otomatis merekam saat menyala
    }

    override fun turnOff() {
        println("CCTV '$name' dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam...")
    }
}
