package company.employee

class Tester(override var name: String) : Employee {

    override fun doWork(): String {
        return "으악"
    }

    override fun whatYourName(): String {
        return "테스터입니다"
    }
}