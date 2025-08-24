# Home_Loan_finance Backend
This is the backend API for the Home Loan Finance Management System built with Spring Boot. It provides RESTful services for managing loan applications, customer profiles, disbursements, sanction letters, document verification, and user authentication.

# 🔗 Repository

> 🔗 **Backend Repo**: [Home_loan_Finance Backend](https://github.com/Vishalshinde321/Home_loan_Finance.git)

##  Features
- **User Authentication & Role-based Authorization**

- **Loan Application Management (Apply, View, Update Status)**

- **Document Upload and Verification**

- **Disbursement Management & History**

- **Sanction Letter Generation and Viewing**

- **Credit Evaluation and Loan Stage History Tracking**


## 📂 Project Structure (Backend)

```bash

Home_loan_Finance/
 ├── mvnw, mvnw.cmd          # Maven wrapper scripts
 ├── pom.xml                 # Maven project descriptor
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── com/
 │   │   │       └── sit/
 │   │   │           └── homeloan/
 │   │   │               ├── HomeLoanFinanceApplication.java      # Main Spring Boot app
 │   │   │               ├── config/                             # Configuration classes (e.g., WebConfig)
 │   │   │               ├── controller/                         # REST controllers
 │   │   │               ├── dto/                                # Data Transfer Objects
 │   │   │               ├── enums/                              # Enum definitions (roles, statuses, document types)
 │   │   │               ├── model/                              # JPA Entity classes (User, LoanApplication, Disbursement, etc.)
 │   │   │               ├── repository/                         # Spring Data JPA repositories
 │   │   │               ├── service/                            # Service interfaces
 │   │   │               └── serviceimpl/                        # Service implementations
 │   │   └── resources/
 │   │       └── application.properties                          # Spring Boot configuration
 │   └── test/                                                    # Unit & integration tests
 └── .mvn/
     └── wrapper/
         └── maven-wrapper.properties                            # Maven wrapper config

```
