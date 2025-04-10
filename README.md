# 🧾 Fawry Pay Instance Project

A Spring Boot-based simulation of the Fawry system — a platform that allows users to pay for a wide range of services such as mobile recharge, internet bills, landline receipts, and donations. The system supports both **user** and **admin** functionalities and includes features like payments, refunds, discounts, and wallet management.

---

## 📌 Project Overview

This project replicates core functionalities of a digital payment gateway like Fawry. It provides:

- User authentication and registration
- Searching and paying for services
- Wallet management and refunds
- Admin control over services and discounts

> ⚠️ **Note**: This project **does not use any external database**. All data is stored and managed in-memory.

---

## ⚙️ Getting Started

### 🧱 Prerequisites

- **Java 11**
- **Maven**
- Any IDE that supports Maven-based Spring Boot projects

### 🚀 How to Run

1. **Clone or download** the project.
2. **Open** it as a Maven project in your IDE.
3. Locate and run the `FawryPayApplication.java` file.
4. Use **Postman** to test API endpoints.

---

## 🔑 Features

### 👤 User Features

1. **Signup/Login**

   - Sign up with a unique username, email, and password.
   - Login using registered email and password.

2. **Service Search**

   - Users can search for any available service by name.

3. **Service Payments**

   - Pay via **credit card**, **wallet**, or (if available) **cash on delivery**.
   - Services are grouped as follows:
     - **Mobile Recharge**
       - Vodafone, Etisalat, Orange, We
     - **Internet Payment**
       - Vodafone, Etisalat, Orange, We
     - **Landline**
       - Monthly receipt, Quarterly receipt
     - **Donations**
       - Cancer Hospital, Schools, NGOs

4. **Refund Requests**

   - Users can request a refund for any completed transaction.
   - Refunds require admin approval.

5. **Wallet**

   - View current wallet balance.
   - Add funds via credit card.

6. **View Discounts**
   - Users can view available discounts on services before payment.

---

### 🛠️ Admin Features

1. **Add Service Providers**

   - Add any new service provider by defining:
     - A form (fields like mobile number, amount, etc.)
     - A handler that processes form input

2. **Add Discounts**

   - **Overall Discount** (e.g., 10% off first transaction)
   - **Specific Discount** (e.g., 20% off mobile recharge services)

   > Both discount types can apply simultaneously if applicable.

3. **Manage Refund Requests**
   - View all refund requests.
   - Accept or reject requests.
   - Process refund transactions on acceptance.

---

## 📬 API Testing

Use **Postman** to:

- Authenticate users
- Submit payments
- Manage wallet
- Request refunds
- Access admin functionalities

> Sample requests and collections can be shared upon request.

---

## 🧰 Tech Stack

- **Java 11**
- **Spring Boot** (via [Spring Initializr](https://start.spring.io/))
- **Maven**
- **No external database** (data stored in memory)

---

## 📎 Notes

- The system is designed for demonstration/learning purposes.
- Data resets on application restart.
- Be sure to test functionality thoroughly using Postman.
