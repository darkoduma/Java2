
package computer;

public class Computer {
    private double procesTact;
    private double memory;
    private int hardDrive;
    
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
    
}