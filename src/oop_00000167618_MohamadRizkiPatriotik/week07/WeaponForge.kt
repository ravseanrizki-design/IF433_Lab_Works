package oop_000_nama.week07

import oop_00000167618_MohamadRizkiPatriotik.week07.ItemRarity

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Pedang Naga Api", 85, ItemRarity.EPIC), 200)
        }
    }

    override fun toString(): String =
        "Weapon(name=${item.name}, damage=${item.damage}, rarity=${item.rarity}, durability=$durability)"
}
