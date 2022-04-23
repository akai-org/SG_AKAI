package pl.org.akai.sg_akai.data.remote

import pl.org.akai.sg_akai.domain.model.Plant

interface PlantsAPI {
    fun getPlants() : ArrayList<Plant>? {
        return null
    }

    fun addPlant(plant: Plant) {

    }

    fun getPlantById(id: Int): Plant? {
        return null
    }
}