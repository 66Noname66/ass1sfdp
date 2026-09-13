package builder;

public class OfficeComputerBuilder extends BaseComputerBuilder {

    public OfficeComputerBuilder() {
        this.cpu = "Intel Core i5";
        this.ram = 16;
        this.gpu = "integrated Graphics";
        this.storage = "512GB SSD";
        this.operatingSystem = "Windows 11";

    }
    @Override
    public Computer build(){
        return new Computer(
                cpu,
                ram,
                gpu,
                storage,
                operatingSystem
        );
    }
}