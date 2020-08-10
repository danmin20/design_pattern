package shop.order

import java.util.*
import kotlin.math.max

class Ground : Shipping {
    override fun getCost(order: Order): Double {
        if (order.getTotalWeight() > 100) {
            return 0.0
        }
        return max(10.0, order.getTotalWeight() * 1.5)
    }

    override fun getDate(order: Order): Date {
        TODO("Not yet implemented")
    }

}