package shop.order

import java.util.*
import kotlin.math.max

class Air : Shipping {
    override fun getCost(order: Order): Double {
        return max(20.0, order.getTotalWeight() * 3.0)
    }

    override fun getDate(order: Order): Date {
        TODO("Not yet implemented")
    }

}