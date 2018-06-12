package computer;

public class Computer {

    private double procesTact;
    private double memory;
    private int hardDrive;

    public Computer() {

    }

    public Computer(double procesTact, double memory, int hardDrive) {
        this.procesTact = procesTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void setProcesTact(Double procesTact) {
        this.procesTact = procesTact;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getProcesTact() {
        return this.procesTact;
    }

    public double getMemory() {
        return this.memory;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public void info() {
        System.out.println("Proces takt " + getProcesTact());
        System.out.println("Memory " + getMemory());
        System.out.println("Hard drive " + getHardDrive());
    }

}
