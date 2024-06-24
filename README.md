<!-- omit in toc -->
# EX01: Java warmup

The goal of this exercise is to get familiar with Java and our Java development environment. Specifically, you'll first learn about Java unit testing and IntelliJ's debugger, which will prepare you to debug your own programs. Then, you'll get familiar with Java syntax by writing a program.

<details open>
  <summary>Contents</summary>

- [Repo structure](#repo-structure)
- [JUnit](#junit)
- [Debugger](#debugger)
- [UFO warmup program](#ufo-warmup-program)
    - [Input](#input)
    - [Output](#output)
    - [Notes](#notes)

</details>

## Repo structure

Notice in the file tree that this repo is organized differently from that of EX00. This is a common structure for [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) Java projects [^maven_structure]. We are now using Maven to manage dependencies behind the scenes more easily, but you don't need to worry about this.

[^maven_structure]: Maven projects are often deeply nested, and the package should be named something like `org.comp210.comp210`, but we'll shorten that to just `comp210` for simplicity.

## JUnit

For unit tests, we will use [JUnit](https://junit.org/). First, open [LongestWordFinderTest.java](src/test/java/comp210/LongestWordFinderTest.java). If an import statement at the top is red, hover over it and click "Add to classpath". There are no errors in this file, so if your IDE says there are errors or you have trouble running the tests, the problem will involve missing dependencies. If so, come to office hours.

To run the given tests, right-click the file and click "Run LongestWordFinderTest", which should result in three failing tests and one passing test. Alternatively, you can choose to run a specific test by clicking the button to the left of the method in the code.

Notice that when the tests run, you can click each test to see what the expected and actual values are, which is useful for debugging.

![](img/junit.jpg)

The code in this file should be trivially easy to understand since you've probably already done unit tests in a different language, such as Python.

The code being tested is in [LongestWordFinder.java](src/main/java/comp210/LongestWordFinder.java). You should now inspect this file to see the logic of the method. It contains a subtle logic bug that causes the tests to fail.

Your task in this part is to find and fix the logic bug in [LongestWordFinder.java](src/main/java/comp210/LongestWordFinder.java) so that all four unit tests pass. The intended fix is one line of code (hint: [String.replace](https://www.w3schools.com/java/ref_string_replace.asp) will be useful).

One way to find the bug is to use IntelliJ's debugger. Even if you've already found the bug, please read the following section to learn how to use the debugger, which will be useful in the future for trickier bugs.

## Debugger

We all use print statements to debug, but a problem with this approach is that you need to have an idea of where the issue is to know that you need to put a print statement there. You also need to know which variable's value might be incorrect to know which variable to print. The problem is that we might not always be aware of these, or we might assume something's correct when it isn't.

This is where a debugger is useful. A debugger allows us to pause the program at any point using breakpoints and inspect the values of variables, which can help us understand what's going on in the program.

In [LongestWordFinderTest.java](src/test/java/comp210/LongestWordFinderTest.java), when running tests (either by right-clicking the file or clicking the symbol to the left of the method), you can instead click the Debug button with a red bug icon to run the debugger. If you do so now, nothing will happen because we haven't set any breakpoints.

Go to [LongestWordFinder.java](src/main/java/comp210/LongestWordFinder.java) and set a breakpoint at the `for` loop by clicking to the left of it where the line number is.

![](img/breakpoint.jpg)

As you can see, the line is highlighted red and there is a red circle to the left.

Now run the debugger by clicking the Debug button. You should now see something like this:

![](img/debugger.jpg)

Near the `for` loop, notice that `words: ["Hello,", "world"]` is not a comment! The debugger put that there to show us the value of `words` at the current state of the program.

At the bottom of the screen, you'll notice all of the variables in the current scope. A lot of these are actually dropdowns if you want more detailed information.

![](img/dropdown.jpg)

Finally, to step through the code, use the three buttons Step Over, Step Into, and Step Out.

![](img/step_buttons.jpg)

The method we're debugging is too simple to see the differences between these three buttons. Here are explanations from [IntelliJ's documentation](https://www.jetbrains.com/help/idea/stepping-through-the-program.html). Examples with code are given in the link.

|  Button   |                                                                                                            Description                                                                                                             |
| :-------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Step over | Steps over the current line of code and takes you to the next line even if the highlighted line has method calls in it. The implementation of the methods is skipped, and you move straight to the next line of the caller method. |
| Step into |                                               Steps into the method to show what happens inside it. Use this option when you are not sure the method is returning a correct result.                                                |
| Step out  |                                                                                Steps out of the current method and takes you to the caller method.                                                                                 |

If you haven't yet found the bug in [LongestWordFinder](src/main/java/comp210/LongestWordFinder.java), you certainly will after stepping through it with the debugger. Once you've found it, implement a fix to make all four unit tests pass.

Note: This set of unit tests isn't comprehensive. There are certainly more edge cases, so even after passing these unit tests, our function is still incorrect. Unit testing can only show the presence of errors but cannot prove their absence!

## UFO warmup program

In [Warmup.java](src/main/java/comp210/Warmup.java), let's write a program to get familiar with Java syntax.

### Input

The program's input is a list of UFO sightings, similar to the text files in [resources](src/main/resources/).

For example, [baby.txt](src/main/resources/baby.txt) contains

```text
5
10/15/36 17:00 cigar 181 61.458056 -149.362222
11/24/06 13:30 fireball 901 29.785556 -95.824167
7/18/10 1:16 light 2701 44.848056 -93.042500
3/7/14 20:45 light 121 26.525000 -80.066667
7/17/10 23:45 fireball 121 28.248611 -81.281389
```

More generally, the input has the following form:

* The first line is an integer that indicates the number of sightings.
* Each subsequent line represents a sighting with information in the following form:
    * MM/DD/YY HH:MM Shape Duration Latitude Longitude
* MM/DD/YY is a date.
* HH:MM is a time with hours and minutes in 24-hour format.
* Shape is a single-word descriptor of the UFO shape.
* Duration is an integer representing the duration of the sighting in seconds.
* Latitude and Longitude are real numbers representing the location of the sighting.

### Output

The program's output should be a report that indicates

* The date, time, shape, and location of the sightings with the longest and shortest durations.
    * In case of ties, report the sighting that comes later in the input (not necessarily later by date, but simply later as provided to the program).
* The average duration and location of sightings by shape.
    * The average of the integer durations should be a real number.
    * The average location is the average latitude and average longitude, both real numbers.

For example, the expected output for the input above is

```text
Longest sighting:
    When: 7/18/10 1:16
    Shape: light
    Where: (44.85, -93.04)
Shortest sighting:
    When: 7/17/10 23:45
    Shape: fireball
    Where: (28.25, -81.28)
Averages for cigar:
    Duration: 181.00
    Location: (61.46, -149.36)
Averages for fireball:
    Duration: 511.00
    Location: (29.02, -88.55)
Averages for light:
    Duration: 1411.00
    Location: (35.69, -86.55)
```

### Notes

1. To read input, the program should use [Scanner](https://www.w3schools.com/java/java_user_input.asp). The program must accept input from standard input (`System.in`) (i.e., the program reads input from the console). You can do this simply by passing `System.in` to the `Scanner` constructor, e.g. `Scanner scanner = new Scanner(System.in)`.
2. To test, you can use the provided text files in [resources](src/main/resources). Simply run your program and paste the contents of the file into the console.
3. All real numbers in your report must be reported to two decimal places, as shown in the expected output above. You can do so with [String.format()](https://www.geeksforgeeks.org/java-string-format-method-with-examples/) with the `%.2f` specifier. For example, `String.format("%.2f", 3.14159)` returns `"3.14"`. If you do not do this or do so incorrectly, the autograder will not provide credit.
4. Print the character `"\t"` (tab) wherever you see a tab in the expected output. That is, before the words When, Shape, Where, Duration, and Location. Do not use spaces.
5. Please make your life (and possibly mine) easier by organizing your code into several smaller methods 🙂.
6. Feel free to search online for Java syntax help, useful Java methods, etc.

As a reminder, though you probably don't need it, assignment submission instructions are on the [course website](https://comp210ss2.github.io/docs/assignment_submission/).
