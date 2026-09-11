package oop_167618_rizki_week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default Argument HP = 100
) {
    // Method simulasi serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Method menerima damage dengan proteksi nilai minimum 0
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    // Mengembalikan status hidup hero
    fun isAlive(): Boolean {
        return hp > 0
    }
}
