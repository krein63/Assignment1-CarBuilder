# Assignment 1 — Builder Pattern

A Java implementation of the **Builder Design Pattern** using a car configuration example.

## Project Structure

- `Cars` — immutable Product
- `CarsBuilder` — Builder interface
- `CarsObjectBuilder` — Concrete Builder that creates `Cars` objects
- `CarsSpecSheetBuilder` — Concrete Builder that creates text specification sheets
- `CarsDirector` — Director with predefined car configurations
- `Main` — Client/demo application

## Builder Pattern

The project demonstrates how the same construction steps can produce different results:

1. `CarsObjectBuilder` builds an immutable `Cars` object.
2. `CarsSpecSheetBuilder` builds a text specification sheet.
3. `CarsDirector` defines reusable construction sequences through the `CarsBuilder` interface.

The builders use a fluent API, allowing chained method calls.

## Validation

`CarsObjectBuilder` validates that all required car fields are set before creating the final `Cars` object.

## Technologies

- Java
- Builder Design Pattern

## How to Run

From the project root:

```bash
javac src/*.java
java -cp src Main
```

The program prints the configured cars and their specification sheets.
