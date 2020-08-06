package shop.order

class Order(var taxCalculator: TaxCalculator, var lineItem: Array<Item>, var country: String, var state: String, var city: String) {

    var total: Double = 0.0

    fun getOrderTotal(): Double {
        if (total == 0.0) {

            for (item: Item in lineItem) {
                total += item.price * item.quantity
            }
            total += total * taxCalculator.getTaxRate(country, state)
        }
        return total
    }

}
