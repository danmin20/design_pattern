package shop.order

import java.util.*

interface Shipping {
    fun getCost(order: Order): Double
    fun getDate(order: Order): Date
}