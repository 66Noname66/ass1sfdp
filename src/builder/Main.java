package builder;

public class Main {

    public static void main(String[] args) {

        Computer gamingComputer = new GamingComputerBuilder()
                .setCpu("AMD Ryzen 7")
                .setRam(32)
                .setGpu("RTX 5070")
                .setStorage("2TB NVMe SSD")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officeComputer = new OfficeComputerBuilder()
                .setCpu("Intel Core i5")
                .setRam(16)
                .setGpu("Integrated Graphics")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 11")
                .build();

        ComputerDirector director = new ComputerDirector();

        Computer predefinedGamingComputer =
                director.buildGamingComputer();

        Computer predefinedOfficeComputer =
                director.buildOfficeComputer();

        System.out.println("Custom Gaming Computer:");
        System.out.println(gamingComputer);

        System.out.println();

        System.out.println("Custom Office Computer:");
        System.out.println(officeComputer);

        System.out.println();

        System.out.println("Director Gaming Computer:");
        System.out.println(predefinedGamingComputer);

        System.out.println();

        System.out.println("Director Office Computer:");
        System.out.println(predefinedOfficeComputer);
    }
}
