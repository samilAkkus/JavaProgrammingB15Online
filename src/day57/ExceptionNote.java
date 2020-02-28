package day57;

public class ExceptionNote {



    /*

    Murodil, i am java instructor in B15 VA Campus.

OOP concepts:
	- Encapsulation
	- Inheritance
	- Abstraction
	- Polymorphism
----------------------

Exception Handling In Java.
---------------------------

Exception -> Exception event, situation
---------------

In Java, Exceptions are ERRORs that happen during runtime.

Lets say you have code with 200 lines, that is running and at line 105 some exception happens.

2 options:
	- you let your code to fail and stop
	- you can handle the exception programmatically
----------------------------


java program writing and execution process:

We write our java code and save it with .java extension.

HelloWorld.java --> Compiler --> HelloWorld.class --> Run

As we see in the flow, it needs to be compiled first then executed. So Compiler will check everything: syntax, data types matching(int n = "java") etc before completing compilation process. If compiler sees something is wrong, we will see COMPILE ERROR.

COMPILE ERROR -> happens during compile process, and it is due to programmer's mistake. We need to fix them for our program to be able to successfully run.


When your code is running, it will run top to bottom line by line, when java sees a line that has error, it will THROW EXCEPTION. RUNTIME EXCEPTION.

---------------

COMPILE ERROR -> error during compile process

EXCEPTION   -> error during running process
--------------------------------------------

Since java is object oriented language, even Exceptions are also OBJECTS that are created.
-------------

For each Exception type in java, there is a Class. Whenever error happens during runtime, object is created from a matching class.

If your code is reading from invalid index, then object from ArrayIndexOutOfBoundsException class is created and THROWN.
---

Runtime Exceptions stop the normal execution of the program.

------
create package day56_exceptions

package day57
--------

class ExceptionExample, main method

--------------

ArrayIndexOutOfBoundsException, ArithmeticException are classes in Java, and when we had matching issues in our code during runtime, object is created from those classes and thrown, it caused the program to stop.


ArrayIndexOutOfBoundsException -> is thrown when our code tries to access invalid index. object from this class is created and thrown.

ArithmeticException -> is thrown during runtime when our code divides by zero.

==========================

Since we know now , that exceptions are also objects from classes, we can look at their hierarchy.

In Java, exception classes use Inheritance. There are many classes for exceptions in java, we just need to learn few.

There are different main types of exceptions.

=============================

Throwable -> Parent of all exception classes in java

Throwable has 2 main direct subclasses:
	-> Error
	-> Exception
		 -> RuntimeException
------------------
Throwable has 2 main direct subclasses:
	-> Error:
			-> OutOfMemoryError
			-> StackOverflow
	-> Exception
		 -> RuntimeException

Error vs Exception difference:
	Error -> impossible to recover
	      -> Happen during runtime
	      -> normally caused by environment where application is running
	Exceptions:
		  -> possible to recover from them (we can HANDLE them)
          -> Caused by programmer's code.
 ----------------------------------

Throwable has 2 main direct subclasses:
	-> Error:
			-> OutOfMemoryError
			-> StackOverflow
	-> Exception
		 -> RuntimeException


Exception has 2 types:
	-> Checked exceptions:
		-> are exceptions that programmer MUST handle, otherwise code will not compile
		-> Exceptions that is checked by compiler during compile time.

	-> UnChecked Exceptions:
		-> These exceptions happen during runtime and it is optional for a programmer to handle them.
		-> Code will still compile even if programmer does not handle
		-> These are also called RunTimeExceptions

Checked exceptions: are Throwable, Exception and all of its subclasses , except RuntimeException.

UnCheckedExceptions: are RunTimeException class and all of its sub classes.
=============================

How to handle exceptions in Java?

try catch statement.
------------------------

Class TryCatch


TOMORROW:
	6:30-9:30
	.........





     */
}
