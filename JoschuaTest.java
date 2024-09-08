public class JoschuaTest {

    static void printString(String s){

        System.out.println("My name really is "+s);

    }

    static String returnString(String s){

        String result = "My name really is "+s;
        return result;

    }

    static int square(int side){

        int result = side * side;
        
        return result;
    }

    static void stringStuff(){

        System.out.print("No new line here:");
        System.out.println("I am in main()");

        // String is a type in Java for handling text
        // s is variable of type String

        String s = "Joschua";

        //System.out.println("My name is Joschua");
        //System.out.println("My name really is "+s);

        printString(s);

        s = "Matthias";

        //System.out.println("My name really is "+s);

        printString(s);

        s = "Hannah";

        printString(s);

        System.out.println(returnString("Joschua"));
        System.out.println(returnString("Matthias"));
        System.out.println(returnString("Hannah"));

    }

    static void intStuff(){

        int side = 5;
        int i = square(side);

        System.out.println("The square of "+side+" is "+i);

        side = 6;
        i = square(side);
        System.out.println("The square of "+side+" is "+i);

        side = 0;

        while(side < 10){

            side = side+1;
            i = square(side);
            System.out.println("The square of "+side+" is "+i);

        }

        side = 0;

        while(side < 10){

           System.out.println("The square of "+(++side)+" is "+square(side));

        }
        
        for(side = 0; side < 20; side++){
            System.out.println("The square of "+side+" is "+square(side));
        } 
        

    }

    public static void main(String[] args){

        //stringStuff();
        intStuff();
        stringStuff();

    }

}