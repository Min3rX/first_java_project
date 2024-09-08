# first_java_project

Select "Open in Codespaces" to get started

# how to create a Java class

you need to create a file with the ending `.java` The filename needs to be the same than the class name in the file.

E.g. `Sample. java` and `public class Sample{...}`

# how to build a Java class

you need to execute `javac` (Java compiler) on the source Java file, e.g. `javac Sample.java`.
This will result in a Java.class file.

# how to run a Java class

you need to execute `java` on the class file, e.g. `java Sample` (you don't need to append the `.class`)
This will only run, if the class contains the following method:
```
public static void main(String[] args){

    ...
}
```
This method is the entry point of every Java application.

# how to print to the console

you can print any String to the console using `System.out.print(String s)` or .println(..) will add a new line.

