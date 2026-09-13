 Builder Pattern — Computer Builder

 Description

This project demonstrates the Builder Creational Design Pattern in Java.

The chosen product is a Computer. A computer can contain several configuration options such as CPU, RAM, GPU, storage and operating system.

The Builder Pattern is useful because it allows the computer to be created step by step using a fluent API.

 Project Structure

 `Computer` — Product
 `ComputerBuilder` — Builder interface
 `BaseComputerBuilder` — common builder logic
 `GamingComputerBuilder` — Concrete Builder for gaming computers
 `OfficeComputerBuilder` — Concrete Builder for office computers
 `ComputerDirector` — Director for predefined configurations
 `Main` — Client/demo class

 Requirements

 Java JDK 17
 IntelliJ IDEA

 How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is selected.
3. Open `Main.java`.
4. Run the `main()` method.

 Available Representations

 Gaming Computer

A high-performance computer designed for gaming:

 Intel Core i7
 32 GB RAM
 RTX 5070
 2 TB SSD
 Windows 11

 Office Computer

A simpler computer designed for everyday office tasks:

 Intel Core i5
 16 GB RAM
 Integrated Graphics
 512 GB SSD
 Windows 11

 Builder Pattern

The Builder Pattern separates the construction of a complex object from its representation.

The same construction process can be used to create different configurations of a Computer.

 Author

Individual Assignment — ShP-2216
Astana IT University
