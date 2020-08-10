package company

import company.employee.Programmer

class OutSourcingCompany :Company(){
    override fun getEmployee() {
        super.getEmployee()

        employees += Programmer("개발자1")
        employees += Programmer("개발자2")
        employees += Programmer("개발자3")
        employees += Programmer("개발자4")
        employees += Programmer("개발자5")
        employees += Programmer("개발자6")
        employees += Programmer("개발자7")
        employees += Programmer("개발자8")
        employees += Programmer("개발자9")
    }
}