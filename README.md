Pharma Supply Chain System
Overview
The Pharma Supply Chain System is a Java-based application designed to enhance the security, transparency, and efficiency of pharmaceutical supply chains. It addresses common challenges in the industry, such as counterfeiting, theft, and inefficiencies in traditional paper-based management systems. This system provides a secure and immutable record of every transaction from manufacturing to distribution, ensuring the integrity of the supply chain.

Features
Drug Registration: Register new drugs with a unique batch number and initial owner (manufacturer).
Ownership Transfer: Transfer ownership of drugs across different entities in the supply chain (e.g., from manufacturer to distributor, from distributor to pharmacy).
Transaction History: Maintain and verify a complete transaction history of each drug, allowing for tracking from manufacture to final sale.
Drug Verification: Verify the transaction history and current ownership of any drug using its batch number.
How It Works
Drug Registration:

A new drug is registered in the system with a name, batch number, and the initial owner's name.
The drug is stored in the system, and its transaction history starts with the manufacturing event.
Ownership Transfer:

Drugs can be transferred between entities (e.g., from a manufacturer to a distributor).
Each transfer is recorded in the drug's transaction history, maintaining a transparent and traceable record.
Drug Verification:

The system can verify a drug’s details by displaying its current owner and the entire transaction history.
Technologies Used
Java SE: The core programming language used for implementing the system.
Java Collections Framework: Specifically, HashMap and ArrayList are used for storing and managing drug data and transaction history.
Project Structure
Drug.java:

A class representing a drug in the system.
Contains attributes like name, batchNumber, currentOwner, and transactionHistory.
Provides methods to transfer ownership and retrieve transaction history.
PharmaSupplyChainSystem.java:

The main class that manages the entire supply chain system.
Uses a HashMap to store drugs by their batch number.
Contains methods for registering drugs, transferring ownership, and verifying drugs.
Getting Started
Prerequisites
Java Development Kit (JDK): Make sure JDK is installed on your machine.
Compilation and Execution
Compile the Code:

bash
Copy code
javac Drug.java PharmaSupplyChainSystem.java
Run the Program:

bash
Copy code
java PharmaSupplyChainSystem
Example Workflow
Upon running the program, you will see the following sequence of actions:

A drug named "Paracetamol" is registered by "ABC Pharmaceuticals."
The drug is transferred first to "XYZ Distributors" and then to "HealthPlus Pharmacy."
The system verifies the drug and displays its entire transaction history.
Future Enhancements
Integration with a Database: To persist drug data across sessions and provide advanced querying capabilities.
User Interface: Implement a user-friendly GUI using Java Swing or JavaFX.
Smart Contract Integration: Further enhance security by implementing blockchain-based smart contracts for automatic and transparent transaction processing.
