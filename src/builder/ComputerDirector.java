package builder;

public class ComputerDirector {

    public Computer buildGamingComputer() {
        return new GamingComputerBuilder()
                .setCpu("Intel Core i7")
                .setRam(32)
                .setGpu("RTX 5070")
                .setStorage("2TB SSD")
                .setOperatingSystem("Windows 11")
                .build();
    }

    public Computer buildOfficeComputer() {
        return new OfficeComputerBuilder()
                .setCpu("Intel Core i5")
                .setRam(16)
                .setGpu("Integrated Graphics")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 11")
                .build();
    }
}
