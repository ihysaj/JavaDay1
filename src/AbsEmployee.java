public abstract class AbsEmployee implements Employee{

    private double basePay;
    String employeeName;
    private double hourlyRate;
    private double numberOfHoursWorked;


    public  AbsEmployee(double numberOfHoursWorked, double hourlyRate,
                            double basePay, String employeeName) {
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        this.basePay = basePay;
        this.employeeName = employeeName;
    }


    @Override
    public double calculateCommission() {
        return 0;
    }

    @Override
    public abstract double calculatePay();

    @Override
    public abstract boolean checkPromotionEligibility();


    public double getBasePay() {
        return basePay;
    }


    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }


    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }


    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }


    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }





}
