package company.employee

class Designer(override var name: String) : Employee {

    override fun doWork(): String {
        return "디자인 하기 싫어"
    }

    override fun whatYourName(): String {
        return name;
    }
}