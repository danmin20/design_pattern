package company.work

import company.employee.Employee

class TimeSheetReport {
    fun print(employee: Employee):String{
        return "${employee.name}: ${employee.doWork()}"
    }
}