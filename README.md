# Skincare Routine Builder

This project demonstrates the Builder Design Pattern in Java using a skincare routine.

## Description

The project creates two different representations of a skincare routine using the same building steps:

- `SkincareObjectBuilder` creates a `SkincareRoutine` object.
- `SkincareGuideBuilder` creates a text skincare guide.

`SkincareDirector` provides two predefined configurations:
- Morning Routine
- Evening Routine

## Builder Pattern Components

- **Product:** `SkincareRoutine`
- **Builder:** `SkincareRoutineBuilder`
- **Concrete Builder 1:** `SkincareObjectBuilder`
- **Concrete Builder 2:** `SkincareGuideBuilder`
- **Director:** `SkincareDirector`
- **Client:** `Main`

## Author

Alua Kurmanbay  
Group: SE-2535
