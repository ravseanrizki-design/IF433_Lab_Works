package oop_00000167618_MohamadRizkiPatriotik.week06

interface Clickable {
    // ERROR: Property  in an interface cannot  have a backing field
    val name: String = "Tombol Rahasia"

    // Function Without body (implicitly Abstract)
    fun click()
}
