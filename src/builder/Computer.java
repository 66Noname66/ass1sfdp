package builder;

public final class Computer {
    private final String cpu;
    private final int ram;
    private final String gpu;
    private final String storage;
    private final String operatingSystem;

    public Computer(String cpu, int ram, String gpu, String storage, String operatingSystem) {

        if (cpu == null || cpu.isBlank()) {
            throw new IllegalArgumentException("cpu cannot be null or blank");
        }
        if (ram <= 0 ) {
            throw new IllegalArgumentException("ram must be more than 0");


        }
        if (storage == null || storage.isBlank()) {
            throw new IllegalArgumentException("storage cannot be null or blank");

        }
        if (operatingSystem == null || operatingSystem.isBlank()) {
            throw new IllegalArgumentException("operatingSystem cannot be null or blank");
        }
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }
    public String getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public String getGpu(){
        return gpu;
    }
    public String getStorage(){
        return storage;
    }

    @Override
    public String toString(){
        return "Computer: " + "CPU=" + cpu + ", RAM=" + ram + ", GPU=" + gpu + ", STORAGE=" + storage + ", OPERATING SYSTEM=" + operatingSystem;
    }

}
