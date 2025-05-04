# bank-customer-management
Bank Customer Management System

# Bank Customer Management System 🏦

A Spring Boot-based REST API project to manage bank customers with features like registration, retrieval, update, and deletion.

## 🔧 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (API Testing)
- SLF4J (Logging)

## 📁 Project Structure
- `Controller`: Handles REST endpoints.
- `Service`: Business logic.
- `Repository`: JPA data access layer.
- `Entity`: Customer model.
- `Request/Response`: DTOs for input/output.
  
## 🚀 Features
- Register new customers
- Get customer by ID
- Update customer info
- Delete customer
- Premium customer service (extensible logic)

## 🛠️ Run Locally
1. Clone the repo  
   `git clone https://github.com/yourusername/bank-customer-management.git`

2. Configure `application.properties` with your MySQL DB  
3. Run using your IDE or `mvn spring-boot:run`  

## 📬 API Endpoints
| Method | Endpoint              | Description             |
|--------|-----------------------|-------------------------|
| POST   | /api/customer/register | Register customer       |
| GET    | /api/customer/getbyid/{id} | Get customer by ID |
| PUT    | /api/customer/update/{id} | Update customer       |
| DELETE | /api/customer/delete/{id} | Delete customer       |

## 📸 Screenshots
(Add Postman screenshots or terminal output)

## 📜 License
MIT

---

> Built with ❤️ by Akash Kumar
