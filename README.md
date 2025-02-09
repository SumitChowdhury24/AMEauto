#Framework Desc.
This is a Selenium based auromation framework which uses Java as the coding languagues, TestNG as the unit test framework. The test steps are designed using Cucumber BDD for easier readibility. Also, it generates an Extent report for knowing execution status.

#Setup
To setup the framework onto any machine, below softwares must be installed.
- **Java 8** (JDK)
- **Maven** (for dependency management and test execution)
- **Selenium WebDriver** (for browser automation:-to be managed through maven dependency)
- **Cucumber** (for writing BDD-style feature files:- plugin is required in the IDE)
- **TestNG** (for running the tests:- to be managed by maven dependency)
- **ChromeDriver** (to host the execution)

#Running the Test
The testRunner class can be used for running the test

#Report generation
output folder can be checked for getting the extent report for execution status

#Folder Structure
│
├── src/
│   ├── test/
│   │   └── java/
│   │       │   ├── listeners/
│   │       │        └── hooks/ 
│   │       │   ├── pages/                   # POM   
│   │       │   ├── stepdefinitions/         # Step Definition Classes
│   │             └── testRunner/            # TestNG Runner Class
│   │       └── utilities/
│   │           └── extentReporter           # To define Extent Reporter
│   │           └── WebDriverSetup           # To define WebDriver setup
│   │   └── features/                        # To contain feature files
│   │   └── output/                          # To contain output result 
│   └── main/
│       ├── java/
│       └── resources/
├── target/                                      # Build Artifacts
│   ├── cucumber-reports/
│   └── test-classes/
└── pom.xml   

#Note
**This framework is build with all Page navigations for AmExp FR page.**
