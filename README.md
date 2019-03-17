# process elements of a list of disparate types
...using methods that apply to only a single type.

## organization
The important thinking/ learning here concerns...

* What information is available to the compiler when
it compiles a .java file?
* What information is available to the JVM when
it runs the instructions that the compiler produces?

The assignment attempts to help people think about these questions by...

* isolating `catElementsStartingWith`, into a file (Accumulator.java)
away from all the other code; and...
* asking you to compile that file separately, with a command
like `javac Accumulator.java`.

Maybe this isolation can help people understand that
**the compiler only knows what it can infer from that file
and any .class files it depends on**.

For example the compiler knows nothing about the data
in a list. That data can change when the programmer 
changes UserOfList.java, after compiling Accumulator.java.
So the compiler can make no decisions that required knowing
the data. The user of Accumulator *could* make a list that contained
only Strings.
But the compiler cannot know that. So the compiler's decisions on what 
Java code is ok cannot depend on the type of data in the list.

The compiler **always** compiles one file at a time, even when you
issue a command like `javac UserOfList.java` that can
result in its compiling compiling several in succession.
So the thinking done in this assignment is broadly useful.
