
# Software Maintenance Lab

## Objective
Practice identifying code smells, refactoring legacy
logic into maintainable patterns, and implementing
diagnostic observability features.

## Lab Task 1 – Refactoring Legacy Code
- Used String.join() to avoid inefficient string concatenation.
- Removed null comparison risk.
- Created ReportFormatter interface.
- Implemented PDFFormatter and CSVFormatter.
- Used constructor dependency injection through Notifier.
- Removed static email dependency.

## Lab Task 2 – Fail-Fast and Immutable Boundaries
- Created BankTransfer Java Record.
- Used BigDecimal for monetary values.
- Added Objects.requireNonNull() validation.
- Rejected zero and negative transfer amounts.
- Tested invalid input exceptions.

## Lab Task 3 – Structured Tracing
- Implemented PaymentProcessor.
- Simulated Trace ID logging.
- Demonstrated try-finally cleanup.
- Prevented stale context through cleanup logic.

## Lab Task 4 – Automated Quality Gate
- Added JUnit 5 dependency.
- Implemented VipDiscount interface.
- Used constructor injection in OrderService.
- Created an isolated unit test.
- Applied Arrange-Act-Assert pattern.

## Technologies Used
- Java 17
- Apache NetBeans
- Maven
- JUnit 5
- Git and GitHub

## How to Run
1. Clone or download the repository.
2. Open the project in Apache NetBeans.
3. Reload Maven dependencies.
4. Run Task1Main, Task2Main, and Task3Main.
5. Right-click OrderServiceTest and select Test File.
6. Run the complete project test suite using Maven.

## Testing
All demonstrations and JUnit tests should execute
successfully.

## Repository
[Insert your GitHub repository URL here]

