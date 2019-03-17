/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    public static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        String result = "";

        for( int el = 0; el < list.size(); el++)
            result += // dummy for incremental development
                      list.get( el) + " ";

            /* 3.  Stumbling block 0
               Java protects a programmer against applying a method to
               elements in list when some elements of the list might
               omit support for a particular operation.

               This protection is implemented by the ___________ (compiler? JVM?)
               The following code violates the restriction:
              */
            // [code that violates the restriction]

            /*
             predicted error message:

             actual error message:
             */


            /* 4.  Workaround 0
               A programmer should expect there to be a way to
               work around the stumbling block, because
               the ___________ (compiler? JVM?)
               knows the type of an element.

               Java's ___________ operator identifies the type
               of an element to the ___________ (compiler? JVM?).
             */


            /* 5.  Stumbling block 1
               However, use of the operator alone is insufficient,
               because the ___________ (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // [code that illustrates the use of the operator]

            /*
             predicted error message:

             actual error message:
             */


            /* 6. Workaround 1
               Programmers use Java's _____________ operator
               to tell the ___________ (compiler? JVM?)
               that code uses a subclass's method on an object,
               even though the reference to the object is stored
               in a super-class variable.
             */


            /* 7. Stumbling block 2
               However, use of this operator alone is insufficient,
               because the ___________ (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // [code that illustrates the use of the operator]

            /*
             predicted error message:

             actual error message:
             */


            /* 8. Workaround 2
               A programmer can combine use of both operators
               to apply a method to exactly those
               elements in the list that support the method.
             */

            // [working code here, finally]

        return result;
    }


    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
    // public static List_inArraySlots finites(
        // List_inArraySlots list
      // ) {
    // }
}
