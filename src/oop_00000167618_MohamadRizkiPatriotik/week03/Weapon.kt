package oop_00000167618_MohamadRizkiPatriotik.week03

class Weapon(val name: String, initialDamage: Int) {

    var damage: Int = initialDamage
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai lama ($field) tetap dipertahankan.")
            } else if (value > 1000) {
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property (Custom Getter)
    val tier: String
        get() {
            return if (damage > 800) "Legendary"
            else if (damage > 500) "Epic"
            else "Common"
        }
}
