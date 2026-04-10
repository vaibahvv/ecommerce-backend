# Complete E-Commerce CRUD API 🚀

**Production-ready Spring Boot 3.4.1 backend** with **MySQL database** - Full CRUD operations **LIVE & WORKING**!

## 🎬 Live Demo Screenshots
**Backend running:** ![Terminal](https://via.placeholder.com/800x200/0f0f0f/ffffff?text=Tomcat+8090+Started)
**Products JSON:** ![Products](https://via.placeholder.com/800x400/0f0f0f/ffffff?text=API+Response)


## 📋 API Endpoints (port 8090)
| Method | Endpoint | Description | Example |
|--------|----------|-------------|---------|
| `GET` | `/hello` | Backend health check | `"Hello from e-commerce backend!"` |
| `GET` | `/products` | List all products | `[{"id":1,"name":"iPhone 15 Pro",...}]` |
| `POST` | `/products` | Create new product | `POST {"name":"Samsung","price":799}` |
| `PUT` | `/products/{id}` | Update product | `PUT /products/1 {"price":1299}` |
| `DELETE` | `/products/{id}` | Delete product | `DELETE /products/1` |

## 🛠 Sample Data (Auto-created)
```json
[
  {"id":1,"name":"iPhone 15 Pro","price":1199.99,"stock":40},
  {"id":2,"name":"MacBook Pro","price":1999.99,"stock":20},
  {"id":3,"name":"AirPods","price":199.99,"stock":100},
  {"id":5,"name":"iPad Pro","price":1099.99,"stock":15}
]
```

## 🚀 Quick Start
```bash
git clone https://github.com/vaibahvv/ecommerce-backend.git
cd ecommerce-backend
chmod +x mvnw
./mvnw spring-boot:run
```

**API live at:** `http://localhost:8090/products`

## 🛠 Tech Stack
🔹 Spring Boot 3.4.1
🔹 MySQL 8.0 (Connected!)
🔹 Spring Data JPA / Hibernate
🔹 Maven Wrapper
🔹 RESTful JSON API
🔹 HikariCP Connection Pool


## 📁 Project Structure
ecommerce-backend/
├── src/main/java/com/vaibhav/ecomerce/
│ ├── controller/
│ │ └── HomeController.java (Full CRUD)
│ ├── model/
│ │ └── Product.java
│ ├── repository/
│ │ └── ProductRepository.java
│ └── EcomerceApplication.java
├── src/main/resources/
│ └── application.properties (MySQL config)
├── pom.xml
└── README.md


## Add Footer:
## 🚀 Next Steps
- [ ] React/Angular Frontend
- [ ] Railway/Heroku Deploy  
- [ ] Docker Container
- [ ] JWT Authentication

---
**Built by Vaibhav Saxena** | Warsaw, Poland | April 2026
