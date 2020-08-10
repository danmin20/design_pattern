package company.employee

class Programmer(override var name: String) : Employee {

    override fun doWork(): String {
        return "집에 보내주세요"
    }

    override fun whatYourName(): String {
        return name+"이다!"
    }
}