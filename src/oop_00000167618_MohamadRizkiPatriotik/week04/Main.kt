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
}