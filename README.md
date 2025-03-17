# Java-first_project

## Develop a Java Implementation Based on Layered Architecture Principles
This assignment will span the entire semester, with the following requirements to be completed for the next lab session.

## Non-functional Requirements
- The application should be structured into layers, including domain, repository, services, and user interface.

- Define repository operations using either an interface or an abstract class. The repository implementation should utilize Java generics.

- Instantiate a generic repository for each entity in the program (e.g., Repository<Car>, Repository<Rental>). Add at least five instances to each repository directly in the source code.

- All domain entities must have a unique identifier. All entities should be derived from the same abstract class or interface, with each object having a unique Domain.ID.

## Requirements for the Next Lab
- The user interface should be implemented as a console-based application with a menu.

- The user interface should support CRUD operations (Create, Read, Update, Delete) for at least one domain entity (e.g., Car).

## Implement basic validations (e.g.:
  - Objects in the repository must have a unique Domain.ID.
  - Handle cases where an object is not found in the repository.
  - Prevent overlapping appointments or rentals, etc.).
  - Use Java’s exception mechanism to enforce validations. Thrown exceptions should be caught in the user interface, where an appropriate error message will be displayed to the user.
## Problem Statements (mine)
  ### Cake Order Management

Implement a Java application for managing cake orders in a bakery.
The domain entities are:
    - Order (Domain.ID: int, cakes: List<Cake>, date: Date).
    - Cake (Domain.ID: int, type: String).
Each order must contain at least one cake.

## Bonus (0.1 points)
- Implement an ID generator for object Domain.IDs.
  
- The generator should start from 100 and increment by 1 with each call.

- The last generated ID should be saved in a text file, so that after restarting the program, generated IDs remain unique and sequential.
