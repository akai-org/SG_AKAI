package pl.org.akai.sg_akai.presentation.navigation

object Route {
    const val WELCOME = "welcome"
    const val HOME = "Home"
    const val Statistics = "Statistics"
    const val PlantList = "List"

    fun getList(): List<String> {
        return listOf(WELCOME, HOME, Statistics, PlantList)
    }
}