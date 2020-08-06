package food

import java.util.*

class Tuna : Food {

    override fun getNutrition(): Double {
        return 0.0
    }

    override fun getColor(): String {
        return "#eeeeee"
    }

    override fun getExpirationData(): Date {
        return Date()
    }

}