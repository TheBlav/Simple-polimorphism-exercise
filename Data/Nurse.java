package Data;

public class Nurse extends Person{
    private  double overTime;
    public Nurse(String name, String lastName, double salary, double overTime) {
        super(name, lastName, salary);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public String printInfo() {
       return super.printInfo()+" Nadgodziny: "+overTime;

    }
}
