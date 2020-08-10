package company

import company.employee.Designer
import company.employee.Programmer
import company.employee.Tester

class GameDevCompany() : Company(){
    override fun getEmployee() {
        super.getEmployee()
        employees += Designer("김땡땡")
        employees += Programmer("이땡땡")
        employees += Tester("박땡땡")
    }
}