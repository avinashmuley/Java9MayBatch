

/**
 * There are 4 types of if statements
 * 1. Simple if
 * 2. if-else stmt
 * 3. if-else-if ladder
 * 4. Nested if
 *
 * *** Switch Statement -
 * switch(expr) //int,short,byte,char,String - java 7{
 * case 1: // cases can not be duplicate
 * stmts;
 * break;// terminates switch block
 * case 2:
 * stmts;
 * break;
 * .
 * .
 * .
 * .case 10;
 * default: // optional
 * stmts
 * }
 */
public class IfStatementDemo {
    public static void main(String[] args) {
        int x = 15;
        int y = 16;
        //Simple if
        if (x  < y)
            System.out.println("Y is greater");

        if (x>y)
            System.out.println("X is greater");

        else
            System.out.println("Y is greater");


        String city = "Mumbai";
        if (city.equals("goa"))
            System.out.println("You are in goa");
        else
        if (city.equals("Mumbai"))
            System.out.println("You are in Mumbai");
        else
            System.out.println("You are in pune");




        String state = "Maharashtra";
        if (state.equals("Maharashtra")){
            if (city.equals("Pune")) {
                System.out.println("You are from Maharashtra");
            }
        }else {
            System.out.println("You are from UP");
        }
    }
}