package oop_00000167618_MohamadRizkiPatriotik.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' (${device.id}) ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA PERANGKAT ===")
        for (device in devices) {
            if (device is Switchable) { // Smart casting
                device.turnOff()
            }
        }
    }

