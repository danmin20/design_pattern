package shop.order

fun main(args: Array<String>) {

    val itemList: Array<Item> = arrayOf(Item(10, 5), Item(5, 5))
    val order = Order(TaxCalculator(), itemList, "EU", "", "", Ground())

    println(order.getShippingCost())
}
