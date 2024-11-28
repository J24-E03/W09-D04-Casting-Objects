# Lab: Practicing Upcasting and Downcasting in Java

## Objective
In this lab, you will:
- Understand and implement **upcasting** and **downcasting**.
- Use the `instanceof` keyword to safely perform type checks.
- Learn how to avoid `ClassCastException` through safe casting techniques.

---

## Instructions

### Part 1: Upcasting and Downcasting Basics

1. **Create the Class Structure:**

    Create a base class called `Vehicle` and two derived classes: `Car` and `Bike`.

    - The `Vehicle` class should have a method `move()`.
    - The `Car` class should override the `move()` method and have an additional method `honk()`.
    - The `Bike` class should override the `move()` method and have an additional method `ringBell()`.

2. **Upcasting Example:**
   In your `main` method, create instances of `Car` and `Bike` and assign them to `Vehicle` references.

    - Use upcasting to store a `Car` and a `Bike` object in `Vehicle` type variables.
    - Call the `move()` method on both variables (using polymorphism).

3. **Downcasting Example:**
   After the upcasting, downcast the `Vehicle` references back to `Car` and `Bike` respectively to access subclass-specific methods.

    - Use downcasting to call the `honk()` method for the `Car` object and `ringBell()` method for the `Bike` object.

    - What happens if you try to downcast a `Vehicle` object that is actually not an instance of the expected class?

---

### Part 2: Safe Casting with `instanceof`

1. **Use `instanceof` to Prevent `ClassCastException`:**

    Modify your program to safely check the type of the object using the `instanceof` keyword before downcasting.

    - Check if the `Vehicle` reference is an instance of `Car` before downcasting it to `Car`.
    - Check if the `Vehicle` reference is an instance of `Bike` before downcasting it to `Bike`.

    This will prevent runtime errors when performing downcasting.

---

### Part 3: Bonus Challenge

1. **Use `instanceof` in a Polymorphic Array:**

    - Create an array of `Vehicle` objects that includes instances of both `Car` and `Bike`.
    - Loop through the array and use `instanceof` to check the type of each object.
    - Call the `move()` method polymorphically and also call the specific methods (`honk()` or `ringBell()`) using safe downcasting.

---

## Deliverables
- A `.java` file containing your solutions.
- Ensure all code compiles and runs without errors.
- Add comments explaining the purpose of each upcast, downcast, and `instanceof` check.

---

## Discussion Questions
1. What is the purpose of upcasting and why is it useful in object-oriented programming?
2. How does downcasting differ from upcasting, and why is it necessary in some situations?
3. Why is using `instanceof` considered a best practice when downcasting?
4. Can you think of a real-world scenario where you would need to use upcasting and downcasting? How would `instanceof` help in such cases?
