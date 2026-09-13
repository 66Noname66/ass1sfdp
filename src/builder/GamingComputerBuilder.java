package builder;

public class GamingComputerBuilder extends BaseComputerBuilder {

    public GamingComputerBuilder() {
        this.cpu = "Intel core i7";
        this.ram = 32;
        this.gpu = "RTX 5070";
        this.storage = "2TB SSD";
        this.operatingSystem = "Windows 11";

    }
    @Override
    public Computer build(){
        return new Computer(cpu,
                ram,
                gpu,
                storage,
                operatingSystem
        );
    }
}
