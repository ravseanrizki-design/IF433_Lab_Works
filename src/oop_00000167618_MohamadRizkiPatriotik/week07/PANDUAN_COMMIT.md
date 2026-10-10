# Panduan 20 Checkpoint Week 07

Semua file ada di folder ini sebagai **versi final**. Supaya riwayat commit-nya asli
(trial & error), masukkan kode secara bertahap seperti di bawah.

**Sebelum mulai:** ganti `oop_000_nama` di semua file dengan package kamu
(contoh `oop_12345_budi`), lalu taruh di `src/oop_<nim>_<nama>/week07/`.

Setiap checkpoint: `git add .` lalu `git commit -m "<pesan>"`.

---

## A. Latihan 1
| CP | File yang dibuat/diubah | Commit message |
|----|--------------------------|----------------|
| 1 | `oop_00000167618_MohamadRizkiPatriotik.week07.DatabaseManager.kt` (salin utuh) | `week07: create singleton DatabaseManager` |
| 2 | `oop_00000167618_MohamadRizkiPatriotik.week07.NetworkClient.kt` **tanpa** companion object (class + `connect()` saja) dan `Main.kt` berisi `val client = NetworkClient("https://api.umn.ac.id")` (sengaja error) | `week07: (trial) trigger private constructor error on NetworkClient` |
| 3 | `oop_00000167618_MohamadRizkiPatriotik.week07.NetworkClient.kt` versi final (tambah companion object) | `week07: implement companion object as factory in NetworkClient` |
| 4 | `Main.kt` diganti: hanya bagian `TEST SINGLETON` + `TEST COMPANION OBJECT` | `week07: test Singleton and Companion Object in main` |

## B. Latihan 2
| CP | Isi | Commit message |
|----|-----|----------------|
| 5 | `UserModels.kt` hanya `RegularUser`; tambah `TEST REGULAR CLASS` di `Main.kt` | `week07: (trial) demonstrate regular class equality failure` |
| 6 | Tambah `DataUser` di `UserModels.kt`; tambah `TEST DATA CLASS` di `Main.kt` | `week07: implement data class for structural equality` |
| 7 | Tambah `copy()` dan destructuring (`data3`, `userName`, `userAge`) di `Main.kt` | `week07: implement copy and destructuring on data class` |

## C. Latihan 3
| CP | Isi | Commit message |
|----|-----|----------------|
| 8 | `SystemStates.kt` hanya `enum class AppState` | `week07: create AppState enum` |
| 9 | Tambah `sealed class ApiResponse` | `week07: create ApiResponse sealed class` |
| 10 | `Main.kt`: tambah `when(response)` **tanpa** cabang `Loading` (sengaja error) | `week07: (trial) trigger non-exhaustive when compiler error` |
| 11 | Tambah `ApiResponse.Loading -> "Tampilkan Spinner"` dan `println(uiMessage)` | `week07: resolve sealed class exhaustive check` |

## D. Tugas Mandiri
| CP | Isi | Commit message |
|----|-----|----------------|
| 12 | `GameManager.kt` | `week07: (task) create GameManager singleton` |
| 13 | `GameModels.kt` hanya `enum ItemRarity` | `week07: (task) create ItemRarity enum` |
| 14 | Tambah `data class GameItem` di `GameModels.kt` | `week07: (task) create GameItem data class` |
| 15 | `WeaponForge.kt` | `week07: (task) implement factory pattern in WeaponForge` |
| 16 | `BattleEvent.kt` | `week07: (task) create BattleState sealed class hierarchy` |
| 17 | `GameExecutor.kt` | `week07: (task) implement exhaustive processEvent` |
| 18 | `Main.kt`: tambah blok `SIMULASI GAME MANAGER` (`startGame()` 2x) | `week07: (task) test GameManager singleton in main` |
| 19 | `Main.kt`: tambah blok `SIMULASI FACTORY & ENUM` | `week07: (task) simulate rarity and factory instantiation` |
| 20 | `Main.kt`: tambah blok `BLACKSMITH & EVENT` (copy + 4 `processEvent`) | `week07: (task) test data class copy and sealed class event dispatch` |

Terakhir: `git push`, lalu cek tab **Commits** di GitHub (harus 20 commit).

---

## Output yang diharapkan dari Main.kt final (bagian tugas)
```
=== SIMULASI GAME MANAGER ===
Memulai Game Engine...
Game sudah berjalan! Mencegah instansiasi ganda.

=== SIMULASI FACTORY & ENUM ===
Drop chance LEGENDARY: 1%
Senjata awal: Weapon(name=Pedang Kayu Bapuk, damage=5, rarity=COMMON, durability=50)

=== BLACKSMITH & EVENT ===
Setelah upgrade: GameItem(name=Pedang Kayu Bapuk, damage=25, rarity=COMMON)
Senjata awal tetap utuh: GameItem(name=Pedang Kayu Bapuk, damage=5, rarity=COMMON)
Kamu berada di Safe Zone. Aman untuk istirahat.
Awas! Bertemu monster: Goblin Nakal. Bersiap bertarung!
Loot didapat: Pedang Kayu Bapuk (Damage: 25, Rarity: COMMON)
GAME OVER! Alasan: Terkena jebakan racun
```
