# AFL Number Iterator

A solution to the AFL Number Iterator code challenge. 


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

- Maven
- GIT
- JDK 1.8 


### Installing

From the project root run the following maven goals:


```
mvn clean install
```  

## Running the tests

Test cases are automatically run as part of the maven build process.

## Running the program

Once built the program can be run by executing NumberIterator.class

The program provides a command line interface allowing the user to specify a sequence size. Each integer in the sequence is then compared to see if it is divisible by 3 and 5.

To provide alternate divisors the DividesByController.class can be called directly.


## Authors

* **Thomas Ward**
