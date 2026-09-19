package oop_00000167618_MohamadRizkiPatriotik.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Budi", baseSalary = 10_000_000)
    val developer = Developer(name = "Sari", baseSalary = 8_000_000, programmingLanguage = "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}