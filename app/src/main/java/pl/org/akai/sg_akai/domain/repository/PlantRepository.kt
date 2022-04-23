package pl.org.akai.sg_akai.domain.repository

import android.os.Build
import androidx.annotation.RequiresApi
import pl.org.akai.sg_akai.domain.model.Condition
import pl.org.akai.sg_akai.domain.model.Plant
import java.time.LocalDate

class PlantRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    fun getPlants() : ArrayList<Plant> {
        return mockPlants()
    }

    fun addPlant(plant: Plant) {

    }

    fun getPlantById(id: Int): Plant? {
        return null
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun mockPlants() : ArrayList<Plant>{
        return arrayListOf(
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MIN
            ),
            Plant(
                id = 1,
                name = "drzewko",
                descriptionnn = "drzewko z domkiem na drzewie",
                specie = "dab ogromny",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX
            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),
            Plant(
                id = 1,
                name = "drzewko",
                descriptionnn = "drzewko z domkiem na drzewie",
                specie = "dab ogromny",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX
            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),

            Plant(
                id = 1,
                name = "drzewko",
                descriptionnn = "drzewko z domkiem na drzewie",
                specie = "dab ogromny",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX,

            ),


            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),

            Plant(
                id = 1,
                name = "drzewko",
                descriptionnn = "drzewko z domkiem na drzewie",
                specie = "dab ogromny",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX,

            ),

            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            ),
            Plant(
                id = 1,
                name = "kwiatek",
                descriptionnn = "zolty kwiatek co urosl na polu",
                specie = "kwiatus zolty",
                condition = Condition.GOOD,
                lastWatered = LocalDate.now(),
                planted = LocalDate.MAX

            )
        )
    }
}