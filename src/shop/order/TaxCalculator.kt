package shop.order

class TaxCalculator {

    fun getTaxRate(country: String, state: String = "", product: String = ""): Double {
        return when (country) {
            "US" -> getUSTax(state)
            "EU" -> getEUTax(country)
            else -> 0.0
        }
    }

    private fun getUSTax(state: String): Double {
        return when (state) {
            "DE" -> 0.08
            else -> 0.07
        }
    }

    private fun getEUTax(country: String): Double {
        return when (country) {
            "FR" -> 0.15
            "UK" -> 0.25
            else -> 0.20
        }
    }
}