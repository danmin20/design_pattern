package company

fun main() {
    val gameDevCompany = GameDevCompany()
    gameDevCompany.getEmployee()
    gameDevCompany.createSoftware()

    val outSourcingCompany = OutSourcingCompany()
    outSourcingCompany.getEmployee()
    outSourcingCompany.createSoftware()
}