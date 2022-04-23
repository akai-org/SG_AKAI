package pl.org.akai.sg_akai.domain.model

import java.time.LocalDate

data class Plant(
    val id: Int,
    val name: String,
    val descriptionnn: String,
    val specie: String,
    val imageBase64: String? = null,
    val condition: Condition,
    val lastWatered: LocalDate,
    val planted: LocalDate,
    val imageStory: HashMap<LocalDate, String> = hashMapOf(),
    val hints: String? = null,
    val diseases: String? = null

)

enum class Condition {
    POOR, NORMAL, GOOD
}