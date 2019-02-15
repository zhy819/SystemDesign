package com.ds.systemdesign.visitorpattern;


public class FinanceDepartment extends VisitorBase
{
    public FinanceDepartment() {
        this.addHandler(FulltimeEmployee.class, (v) -> {
            FulltimeEmployee employee = (FulltimeEmployee)v;
            int workTime = employee.getWorkTime();
            double weekWage = employee.getWeeklyWage();
            if(workTime > 40)
            {
                weekWage = weekWage + (workTime - 40) * 100;
            }
            else if(workTime < 40)
            {
                weekWage = weekWage - (40 - workTime) * 80;
                if(weekWage < 0)
                {
                    weekWage = 0;
                }
            }
            System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元。");
        });

        this.addHandler(ParttimeEmployee.class, (v) -> {
            ParttimeEmployee employee = (ParttimeEmployee)v;
            int workTime = employee.getWorkTime();
            double hourWage = employee.getHourWage();
            System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");		
        });
    }
}