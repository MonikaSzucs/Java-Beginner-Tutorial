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









