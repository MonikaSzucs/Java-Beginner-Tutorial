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
