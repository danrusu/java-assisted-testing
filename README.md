# Java assisted testing

***

*I consider time to be the most valuable resource in our life.*

***

*For me, automation scope is to buy time.*
That means, my entire career,
I've tried to design tools that buy time.

The first development language I fell in love with, eight years ago, is **Java**.
It helped me automate different processes, especially on the testing side.

I will try to emphasize a few practices and tools that will make a difference in the long term.

Automation tools only assist us in our attempt to buy time,
we should always *focus on the problem we try to solve*, and the patterns we encounter.

| Contact  |                                                 |         
| ---      | ---                                             |
| LinkedIn | [Profile](https://www.linkedin.com/in/rusu-dan) |
| Email    | danginkgo@yahoo.com                             |
| Skype    | danginkgo                                       |

***

# Roadmap

***

### 1. Generic concepts
  
- **IT career** 
   
  - professionalism 
    
  - continuous learning 
      
  - adaptability  

  - divide and conquer
    

- **Buying time** - *Automation* is about using information technology 
    or machines to handle repetitive processes and tasks, 
    while *freeing humans to do other things*.


- **Jack of all trades ...**

***

### 2. Java assisted testing

`"Testing leads to failure, and failure leads to understanding."` *- Burt Rutan -*
 
***

#### 2.1 Hints

- focus on the goal, add value


- use the IDE as much as possible for static automation


- [clean code](./resource/clean_code.JPG)
  - naming
    
    `"There are only two hard things in Computer Science: cache invalidation and naming things."` *- Phil Karlton -*
  - KISS
  - DRY
  - YAGNI
  - abstract carefully  
  `Sometimes, the elegant implementation is just a function.  Not a method.  Not a class.  Not a framework.  Just a function.` *- John Carmack -* 



- standardize test input (scenarios) and output (reports)
  - choose programmatically interpretable formats (i.e. JSON or XML) 

#### 2.2 Tools and libraries

- *IDE* - [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows)


- *project management tool* 
  - [Maven](https://maven.apache.org/)
  - [Gradle](https://gradle.org/)


- *unit test framework*
  - [TestNG](https://testng.org/doc/)
  - [Junit5](https://junit.org/junit5/docs/current/user-guide/)


- *logger* 
  - [SLF4J](http://www.slf4j.org/)
  - [Log4j 2](https://logging.apache.org/log4j/2.x/)
  - [Logback](http://logback.qos.ch/)


- *mocking* - [Mockito](https://site.mockito.org/)
    

- *UI test* - [Selenium](https://www.selenium.dev/)


- *API test* - [RestAssured](https://rest-assured.io/) 


- *fluent assertions* - [AssertJ](https://joel-costigliola.github.io/assertj/)


- *matchers* - [Hamcrest](http://hamcrest.org/JavaHamcrest/)


- *BDD test* - [Cucumber](https://cucumber.io/)
  - [Gherkin](https://cucumber.io/docs/gherkin/reference/) 


- *[Lombok](https://projectlombok.org/features/all)*

#### 2.3 Test projects POCs

- [template-testng-cucumber](https://github.com/danrusu/template-testng-cucumber)


- [template-junit5-cucumber](https://github.com/danrusu/template-junit5-cucumber)


- [templateTestNg](https://github.com/danrusu/templateTestNG)


- [REST helper](https://github.com/danrusu/simple-calculator-javalin)

***

#### 3. Declarative data processing - the Stream API

- [@FunctionalInterface](https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html)
  

- [java.util.Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)


- lambda and method reference


- lazy evaluation


- parallelism

***

#### 4. Resources

- **Clean Code** - A Handbook of Agile Software Craftsmanship - Robert C. Martin


- **Effective Java** - Third edition - Joshua Bloch


- **Modern Java IN ACTION** - Raoul-Gabriel Urma, Mario Fusco, Alan Mycroft

***

`"There are two ways of constructing a software design: 
One way is to make it so simple that there are obviously no deficiencies, 
and the other way is to make it so complicated that there are no obvious deficiencies.
The first method is far more difficult."` *- C. A. R. Hoare -*