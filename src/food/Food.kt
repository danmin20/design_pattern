package food

import java.util.*

interface Food {

    fun getNutrition(): Double
    fun getColor(): String
    fun getExpirationData(): Date

}