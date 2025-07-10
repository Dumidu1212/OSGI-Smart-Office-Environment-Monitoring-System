# 🏢 OSGi Smart Office Environment Monitoring System

A modular, real-time smart office system built with **Java OSGi** to monitor and control environmental conditions like temperature, humidity, and light using simulated sensors and services.

---

## 📚 Contents

- [🎯 Overview](#-overview)
- [🔧 Key Features](#-key-features)
- [⚙️ Tech Stack](#️-tech-stack)
- [📁 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
  - [🧰 Prerequisites](#-prerequisites)
  - [🔨 Build the Bundles](#-build-the-bundles)
  - [▶️ Run with Apache Felix](#️-run-with-apache-felix)
- [🖥️ Simulated Output](#️-simulated-output)


---

## 🎯 Overview

This project uses the **OSGi (Open Services Gateway Initiative)** framework to create a flexible and loosely-coupled system for smart office monitoring. It demonstrates dynamic service registration, inter-bundle communication, and event-driven sensor simulation.

---

## 🔧 Key Features

| Feature                      | Description                                                                 |
|-----------------------------|-----------------------------------------------------------------------------|
| 🌡️ Temperature Monitoring      | Simulated sensor reports temperature changes in real-time.                |
| 💧 Humidity Monitoring         | Humidity sensor provides periodic updates.                                |
| 💡 Light Sensor & Control      | Monitor and toggle lighting system automatically or manually.             |
| 📦 Modular Design             | Implemented as separate OSGi bundles for high decoupling.                 |
| 🔄 Dynamic Service Discovery  | Automatically loads/unloads modules using OSGi service registry.          |
| 📊 Console-Based UI           | Displays current sensor readings and system state in the terminal.        |

---

## ⚙️ Tech Stack

| Technology       | Usage                           |
|------------------|----------------------------------|
| **Java 11+**      | Main programming language        |
| **Apache Felix**  | OSGi container/runtime           |
| **Maven**         | Build and dependency management  |
| **OSGi Bundles**  | Modular sensor/service logic     |

---

## 📁 Project Structure
```
OSGI-Smart-Office-Environment-Monitoring-System/
├── sensor.temperature/ # Temperature sensor bundle
├── sensor.humidity/ # Humidity sensor bundle
├── sensor.light/ # Light sensor + control
├── display.console/ # UI bundle for CLI display
├── controller.main/ # Main controller/manager logic
├── pom.xml # Parent Maven build file
└── README.md
```

---

## 🚀 Getting Started

### 🧰 Prerequisites

- Java 11 or later
- Apache Felix (or any OSGi runtime)
- Maven

### 🔨 Build the Bundles

```bash
# Clone the repo
git clone https://github.com/Dumidu1212/OSGI-Smart-Office-Environment-Monitoring-System.git
cd OSGI-Smart-Office-Environment-Monitoring-System

# Build all bundles
mvn clean install
```
---
### ▶️ Run with Apache Felix

Download Apache Felix Framework
Start the Felix shell:

```bash
java -jar bin/felix.jar
```

In the Felix console, install and start your bundles:

```bash
install file:/path/to/sensor.temperature/target/sensor.temperature.jar
install file:/path/to/sensor.humidity/target/sensor.humidity.jar
install file:/path/to/sensor.light/target/sensor.light.jar
install file:/path/to/display.console/target/display.console.jar
install file:/path/to/controller.main/target/controller.main.jar

start <bundle-id>  # Repeat for each installed bundle
```

---

## 🖥️ Simulated Output
```
[Temperature Sensor]  Room Temp: 24.6 °C
[Humidity Sensor]     Humidity: 42%
[Light Sensor]        Brightness: ON

[Controller] Lights turned off due to high ambient light.

```
