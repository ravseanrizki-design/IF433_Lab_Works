package oop_000_nama.week07

import oop_00000167618_MohamadRizkiPatriotik.week07.BattleState

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone ->
            println("Kamu berada di Safe Zone. Aman untuk istirahat.")

        is BattleState.MonsterEncounter ->
            println("Awas! Bertemu monster: ${event.monsterName}. Bersiap bertarung!")

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item // destructuring data class
            println("Loot didapat: $name (Damage: $damage, Rarity: $rarity)")
        }

        is BattleState.GameOver ->
            println("GAME OVER! Alasan: ${event.reason}")
    }
}
