package builder;

public abstract class BaseComputerBuilder implements ComputerBuilder {
    protected String cpu;
    protected int ram;
    protected String gpu;
    protected String storage;
    protected String operatingSystem;

    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    @Override
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;

    }
    @Override
    public ComputerBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
}
