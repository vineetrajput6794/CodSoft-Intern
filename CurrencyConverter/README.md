# 💱 Task 1: Currency Converter

A Java console application that converts currency amounts in **real-time** using live exchange rates fetched from the **ExchangeRate-API** via HTTP requests and JSON parsing.

---

## 📖 About the Project

This Currency Converter application allows users to convert any amount between different world currencies. Unlike static converters, this app fetches **live exchange rates** from the [ExchangeRate-API](https://www.exchangerate-api.com/) at the time of conversion, ensuring accurate and up-to-date results. The app makes a REST API call, parses the JSON response, extracts the exchange rate, and calculates the converted amount.

---

## ✨ Key Features

- **Live Exchange Rates** – Fetches real-time rates via the ExchangeRate-API (REST API integration).
- **Multi-Currency Support** – Supports all major world currencies (USD, INR, AED, AUD, PKR, EUR, GBP, etc.).
- **Dynamic Rate Extraction** – Parses the JSON API response to extract the exact rate for the chosen target currency.
- **Accurate Conversion** – Calculates and displays the precise converted amount.
- **Error Handling** – Catches HTTP errors and API failures with descriptive messages.
- **Simple CLI Interface** – Easy-to-use prompts for base currency, target currency, and amount.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| **Java** | Core programming language |
| **HttpURLConnection** | Opens an HTTP GET connection to the exchange rate API |
| **BufferedReader / InputStreamReader** | Reads the API response stream |
| **org.json (JSON Library)** | Parses the JSON response to extract conversion rates |
| **ExchangeRate-API v6** | Third-party REST API for live currency exchange rates |
| **Java Scanner** | Console-based user input |

---

## 🏗️ Project Structure

```
CurrencyConverter/
└── src/
    └── currencyConverter.java   # Main class with API call, JSON parsing, and conversion logic
```

---

## 🔑 API Details

- **API Provider**: [ExchangeRate-API](https://www.exchangerate-api.com/)
- **Endpoint**: `https://v6.exchangerate-api.com/v6/{API_KEY}/latest/{BASE_CURRENCY}`
- **Response Format**: JSON with `conversion_rates` object containing target currency rates.

---

## 📦 Dependency Setup

Add the **org.json** library to your project:

**Maven:**
```xml
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20231013</version>
</dependency>
```

**Manual:** Download `json-20231013.jar` and add it to your project classpath.

---

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA** or any Java IDE.
2. Add the `org.json` library dependency (see above).
3. Run the `currencyConverter` class.
4. Enter the base currency, target currency, and amount when prompted.
5. View the live exchange rate and converted amount.

---

## 📋 Sample Output

```
Enter Base Currency (e.g. USD, INR, AED, AUD, PKR): USD
Enter Target Currency (e.g. USD, INR, AED, AUD, PKR): INR
Enter Amount: 100

Exchange Rate: 83.52
100.0 USD = 8352.0 INR
```
