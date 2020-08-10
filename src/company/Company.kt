package company

import company.employee.Employee
import company.work.TimeSheetReport

open class Company() {

    var timeSheetReport = TimeSheetReport();

    var employees = arrayOf<Employee>()

    fun createSoftware() {
        employees.forEach { employee ->
            println(timeSheetReport.print(employee))
        }
    }

    open fun getEmployee() {

    }
}