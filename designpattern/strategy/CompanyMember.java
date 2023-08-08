package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;
    SalaryCalculation salaryCalculationStrategy;

    StringValidationStrategy nameStrategy;
    IntegerValidationStrategy salaryStrategy;
    StringValidationStrategy managerNameStrategy;

    CompanyMember(
            StringValidationStrategy nameStrategy,
            IntegerValidationStrategy salaryStrategy,
            StringValidationStrategy managerNameStrategy
    ){
        this.nameStrategy=nameStrategy;
        this.salaryStrategy=salaryStrategy;
        this.managerNameStrategy=managerNameStrategy;

    }

    public void setName(String name) {
        validateLength(name, 50);
        this.name = name;
    }

    public void setSalary(int salary) {
        atLeast(salary, 1);
    }

    public void setManagerName(String name) {
        validateLength(name, 50);
    }

    public void setSalaryCalculationStrategy(SalaryCalculation salaryCalculationStrategy){
        this.salaryCalculationStrategy = salaryCalculationStrategy ;
    }
}
