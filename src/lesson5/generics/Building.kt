package lesson5.generics

class Building <T : BaseBuildingMaterial> (private val buildingMaterial: T) {
    private val baseMaterialsNeeded: Int = 100

    var actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} is required to build the building")
    }



}