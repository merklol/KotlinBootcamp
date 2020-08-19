package lesson5.generics

fun main() {
    val wood = Wood()
    val building = Building(wood)
    building.build()
    isSmallBuilding(building)
}

fun<T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("small building") else println("large building")
}