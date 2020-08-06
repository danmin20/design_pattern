package animal

import food.Food

class Cat(var energy: Double) {

    fun eat(f: Food) {
        energy += f.getNutrition()
    }

}
