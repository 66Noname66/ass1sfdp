package builder;

public interface ComputerBuilder {

    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setOperatingSystem(String operatingSystem);
    builder.Computer build();


}
