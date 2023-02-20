# T&E Accounting Project

## Table of contents

1. Decription
2. Notable Problems
3. Requirements
4. Setting Things Up
5. Parts of the Program
6. FAQ

## 1. Description

**This was a group project with another person.** The goal of the application was to create a demo that an accounting firm might use for its internal bookkeeping, using a MySQL database in the background to keep information, with a GUI made using JavaFX and Java. In this example, the application is called T&E Accounting, taking the initial from each group projects last name. There are 2 different login screens, one for admins and another for users (or clients in this example), each displaying information on orders made, as well as making a new order or talking to a client through a command prompt.

## 2. Notable Problems

There are two main issues with the program:

1. JavaFX not being populated with data:

One caveat of the project was that JavaFX and the code used in Java had problems when it came to displaying some information in the UI. Specifically, on the order screens for both, JavaFX would through an error about a null value and fail to populate the screen, however, the information would be in the database and as a workaround, the information is displayed to the console in case a user would like to see or know about the information.

2. JavaFX windows are constantly redrawn

Another caveat is that JavaFX windows are redrawn each time that a button, object, or another part of the application is interacted with. The main reason was a lack of information about JavaFX, and with some work this can be readjusted in the future.

## 3. Requirements

- An IDE with:
	- JavaFX setup
	- JDBC Driver for SQL Connecting
- MySQL (8+) Installed

## 4. Setting Things Up

1. It is recommended that an IDE is setup with JavaFX and JDBC Connector libaries configured
2. MySQL needs to be preconfigured to have:
	-  A database cofingured with a username of **root** and password of **cs380**
 - The database running on port 3306 on localhost

## 5. Part of the Program

There are two logins to access diferent screens of the program: Employee and Client. The credentials are given when running the program in the log, but these are:

- Client: **PhilipFry** and a password of **pass**
- Employee: **HubertFry** and a password of **admin**

**Client**: Clients are presented with options to check order history, or to make a new order. Clicking on ``` Order... ``` will present an order screen to select an employee to work with, location, and budget. Pressing submit will give a conformation number with a randomly generated order number, with information being pushed into the SQL database. Order history will prsent past orders done, however due to problems with JavaFX this is not populated and will instead populate in console.

**Employee**: Employees are presented with options to check client history or to work with a client. ```Work with a client``` presents a screen to choose which client to work with, the cost, and comments about the work. Pressing submit will give a randomly generated order number, and the information will be pushed into the SQL database. Client Orders will show past clients the employee worked with and their orders, however due to problems with JavaFX this is not populated and instead will populate in the console. 

## 6. FAQ

#### Why do I need a login with 'root' and 'cs380' as the password?
- As this project was a part of a class, the defaults that were set with previous assignments were these. Due to my minimal knowledge of MySQL and databases in general, I left them as such and stuck to using these credentials.

#### Can I use a different login for the database?
- **Yes**, Lines 31 - 33 of ``` Main.java ``` are the strings that handle the database url, username, and password. These can be altered to your liking, just make sure that they match up with the database you want to use it with.
