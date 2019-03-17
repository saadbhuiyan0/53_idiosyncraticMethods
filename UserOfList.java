/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        // Populate the list with values from the assignment
        System.out.println(
          "Populate the list with values from the assignment");
        list.add( "happy pi day");
        list.add( "piazza");
        list.add( 3.14);
        list.add( "pi");
        list.add( 256);
        list.add( Double.POSITIVE_INFINITY);
        list.add( "tau");
        list.add( "pizza");
        list.add( 1e4);
        list.add( Double.NEGATIVE_INFINITY);

        System.out.println("the sample list: "
          + list.size() + " elements:" + System.lineSeparator()
          + list                       + System.lineSeparator()
          );

        // pi-prefixed phrases
        System.out.println(
            "pi-prefixed phrases: "
          + Accumulator.catElementsStartingWith( list, "pi")
          + System.lineSeparator());

        // // list of finite Doubles
        // List_inArraySlots numbers = Accumulator.finites( list);
        // System.out.println( "list of finite Doubles: "
           // + numbers.size() + " elements:" + System.lineSeparator()
           // + numbers
           // + System.lineSeparator());

        // // test ?? template
        // System.out.println( "test ??");
        // System.out.println( list + System.lineSeparator());
    }
}
