# Java-Beginner-Tutorial

## Getting Started
1. What is Java?
It is a programming language. Developed at Sun Microsystems. Created by James Gosling from 1991 to 1995.
Java can be added to any operating system.

2. A simple architecture of Java
Architecture: Platform independant
The Java Program compiles to Bytecode (which can be udnerstood by the machine). This Bytecode will talk to the Java Virtual Machine (JVM). This then works on any operating systems like Linux OS, Windows OS, and Mac OS

3. IDE for Java (to write java programs)
IDE for java - integrated development environment
You can search for these IDE's to use on your computer. 

## How to Install Java on Windows

Step 1: Check if Java is already installed
    Go to command prompt and type in
    java -version

    If it says it is not recognized then you do not have Java installed or reconized in the event variables

Step 2: download Java from the internet
    Go to google and type: download java
    Go to the oracle site
    Download one from teh Java SE Development Kit
    Download the one for Windows x64
    Double click on the .exe file to install it

Step 3: Run the Java .exe file

Step 4: Set the Environment Variables
    Right click This PC in File Explorer > Properties
    Click Advanced System Settings > Environment Variables..
    In the Systems Variable list try to see if Java Home is already there. If it is there you just need to edit it. 
    If it is not there then you just click New.. 

    New..
        Type in Variable Name: JAVA_HOME
        Type in Varaible Value (location of Java): C:\Program Files\Java\jdk1.8.0_321
        Then click ok
    
    Then click on the Path variable under System Variables:
        Click Edit once you highlight Path
        On the Variable Value (go to the end of the text string but make sure you do not delete what is there already)
        Add a semicolon at the end ;
        Then paste the path we copied from before where your Java is located and add bin at the end: 
            C:\Program Files\Java\jdk1.8.0_321\bin
            However we can replace this with 
            %JAVA_HOME%\bin
            then click ok
        
Step 5: Check if Java is installed and available
    Open up Command Prompt then type this to see if Java is installed:
    java --version


## Getting Started with Eclipse IDE
IDE - Integrated development environment

Step 1: Download eclipse
    Search for Eclipse Download
    You can select any release
    Make sure to download the one called Eclipse IDE fro Java EE Developers
    https://www.eclipse.org/downloads/packages/

    Once you install the program and you launch it, it will ask you for a Workspace. This is just where all your projects/development tool will be stored in a particular folder.

Step 2: unzip: start eclipse
    Provide workspace location

Step 3: Open Workbench
    Just click hide on the options that show up


## Making the First Java Program
Step 1: Open Eclipse - select workspace
    Eclipse is platform independent which meants it doesn't matter which operating system you are on.

Step 2: Create a Java Project
    File > New > Java Project
        Project Name: learnJava
        Keep everything else as default then click next

    Click on the src folder then:
        right click new > Package > name is myfirstjavaprogram
        You will categorize codes into different packages (this is types in all lowercase)
    
    Right click on the package we created:
        New > Class
        Name: HelloWorld
        Checkmark (select): public static void main(String args[])
        Then click finish

Step 3: Compile and run
    Run > Run
    or right click run as > Java Application
    or right click on the class in the right side and run as > Java Application
    There is also a play button at the top.

## Command Line Execution
1. How to run the java program from the command line

Step 1: Go to command line / terminal - go to the location of the Java File
    cd into the area where you have saved your file but only go into the src directory


Step 2: Compile Java Program
    javac "name of java file (pacakage name)/(name of your Java file)"
    javac myfirstjavaprogram/HelloWorld.java
    Now you wil lsee a new file created which is called HellowWorld.class

Step 3: Execute java program
    java "name of java file without extension"
    Example: java HelloWorld

*** Make sure the class name and the file name match exactly in order to allow you to run the file.

## JAR (Java Archive) basics
JAR = Java Archive 
    - compressed format of a compiled Java projects
    - contains .class files + meta data and some other resources

Why do we need JAR files?
    - used to distribute java code/libraries for use by other projects
        you can search for javamail jar
        somebody create a project with a source code - compiled the program into a jar file. We get all the source code now and can use it in our java program. 
    - direct execution of java program (W/O without the use of IDE)

How to create JAR file from Java Project?
1. Open the Eclipse IDE with your project open
2. right click the LearnJava > Export
    type jar then click the JAR file
    click next. Then you can select the location where you want to save it.
    C:\Users\monik\OneDrive\Desktop\Java-Beginner-Tutorial\JARTest\HelloWorld.jar
    Click Next then Next. In the Page where it asks you to select the Main class this is where you must select the HelloWorld Class
    Then Next and save.
    To execute this JAR file you need to open a command prompt or terminal. cd into the location of this .jar file. 
    Then type in:
        java -jar HelloWorld.jar

    To Decompress the .jar file
        right click on the .jar file > Open with > then unzip with any program
        Now you will see a folder. Then if you go inside the folder oyou will see the .class folder and the META-INF. If you open this MANIFEST.MF with a text editor you will see that this has information on your main class. 

        The Java Decompiler you can use for example is on jf.benow.ca whcih has a Java Decompiler
            you can download the gui you can also add it as a plugin for eclipse.
        
        Java Decompiler 
             Open it
             locate the jar file
             then you can see it has decompiled and given you the .java file exactly what it used to be.

## What is JDK JRE and JVM?
JDK:    Java Development Kit
        environment to develop, compile and run java application
        JRE + Tools to develop java programs

JRE:    Java Runtime Environment
        Environment to run java applications
        JVM + Libraries to run java program

JVM:    Java Virtual Machine
        interpreter to execute java programs (byte code) line by line
        JVM runs and interprets our Byte code
        execute repcompiled java programs (.class, .jar files / bytecode)

Java program  -- (abc.java)--> Java Compiler --( abc.java )--> Java Interpreter --(1010101)--> Computer

When you download a file you will usually be downloading a JRE. 


## What is Object Oriented PRogramming 
1. What is OOP?
It is a method of programming whre code is designed a based on the functions and attributes of the objects

2. How did OOP come into existence
    - Nonstructured Programming
        Developers woudl create a linear code. No models. All actiosn coded in a single program. Used Basic, Cobol, Fortran etc. This is hard to read over time with no models.
    - Structured Programming
        Code was organized into structures. Code could talk to each other. example C and Pascal.
    - OOP - Object Oriented Programming
        Example mostly used in C++ and Java

3. Understand OOP with Real Life Examples
    A Bank Account Holder withdraws monet from a ATM.
    Steps:
        1. Insert Card
        2. Enter Passcode (PIN)
        3. Enter Amount
        4. Withdraw Cash
        5. Withdraw Card

    Nonstructure programming it will look like:
        Program { 
                    Everything will be in this one area 
        }
        - this is linear programming
        - No modules
        - Maintenance + enhancements is difficult

    Structure programming
        - there will be different Modules
        withdrawMoney(){
            Code here for this action
        }
        depositMoney(){
            Code here
        }
        openAccoint(){
            Code here
        }
        - these modules can all talk to each other. 
        - if there is a new action/scenario then we can just create another module and make it communicate with the other modules
        - works on ACTIONS
        Example: A person opens account with a bank and deposits money and uses his Credit Card to withdraw moeny from ATM. 
            The three action words this this sentence are opens account, deposits money, withdraw money.
        - Modular Programming
        - Maintenance + Change + Enhancements are easier

    Object Oriented Programming (OOP)
        - Does not work on ACTIONS
        - Works with Class and Objects
        - is inspired by real life scenarios and depicts real life entities in the form of OBJECTS that are created using CLASSES

        Class
            A template or BluePrint for creating objects
        
        Objects
            Are like many houses that someoen creates which is under the same class

        Example:
            An Account holder withdraws money from his Bank Account using Credit Card
            - we will need to work on entities
            - the nouns in the sentence are Account Holder, Bank Account, Credit Card

            Account Holders:
                - Tom
                - Henry
                - Sarah
            * Each account holder had its own attributes such as:
                - Name
                - Age
                - DOB
                - Address
            * There are functions each account holder can do such as:
                - Deposit Money
                - Withdraw Money
                Transfer Funds
        
            Example Code structure:
                class AccountHolder{
                    String name;
                    int age;
                    Date dob;
                    String address;

                    depositMoney(){
                        Code here
                    }
                    withdrawMoney(){
                        Code here
                    }
                }
            
            - Class is a template to definte OBJECTS
            - Using a class (template) multiple objects can be defined (created)
            - each class can have its own functions 

## How to create Classes and Objects

1. Convert information into tables
    - Any account holder will have its own attributes or variables with the same functions involved

    Example:
        class AccountHolder {
            String firstName;
            String lastName;
            int age;
            float accountBalance;
            boolean eligibleForCreditCard;

            testCreditCardEligibility(){
                Code here
            }
        }

2. Create Class and variables using tables
    Step 1: 
        Represent Account Holder details in a simple table
        Account holder can include:
            - First Name                    Tom
            - Last NAme                     Smith
            - Age                           21
            - Account Balance               10000
            - Eligible for Credit Card
        
        We can write conditions on this entity which is for Eligibility for Credit Card: Age > 25, Account Bal >= 20000

    Step 2: 
        Create a Java Class with name as TableName and Variables as column names

3. Create Objects
    - Open up Eclipse
    - right click erc and create a new java package called: classesandobjects
    - right click this package and create a new java class called AccountHolder

    Step 3:
    - Create another class where we will create objects for Account Holder class

    Step 4:
    - Create objects for Tom, Henry, and Sarah and provide details as below

4. Run the OO (object oriented) program

    Step 5 
    - Run and validate


## How to Add Eclipse Project to GitHub

    Step 1: Create a GitHub Account and Sign-In
    Step 2: Start a Project = Create a Repository
    Step 3: Start Eclipse
    Step 4: Go to Perspective
        there should be a button/icon at the top right that says open perspective if you hover over it
        Then select Git Repository or you can search for git repositories to Add Git Repositories
        Then at the bottom left you will see a dialogue box which will then allow you to Clone a Git Repository you have created
        In the dialogue box add the URL from the github repository and paste it in the URI
        You can then give the Authentaton of your username and password. If you do not it will still ask you to log in. 
        You can save the project where you want on your computer.
    Step 5:
        Create a project in eclipse. 
    Step 6: 
        then right click the new project then go to Team > Share Project > Then add to git repository
        This will then allow you to select the repostiory you want to share with. 
        Then finish
    Step 7: 
        Commit and Push the project to the repo
        After you made your changes you can right click the file and click Teams > Commit..
        You can drag and drop teh iteams from Unstanged Changes to Stages Changes then add you commit Message then Commit and Push.
    Step 8: 
        Commit and Push every change to the repo


