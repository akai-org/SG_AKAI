package pl.org.akai.sg_akai.data.local

import android.os.Build
import androidx.annotation.RequiresApi
import pl.org.akai.sg_akai.domain.model.Plant

interface PlantsDao {

    fun getPlants() : ArrayList<Plant>? {
        return null
    }

    fun addPlant(plant: Plant) {

    }

    fun getPlantById(id: Int): Plant? {
        return null
    }
}