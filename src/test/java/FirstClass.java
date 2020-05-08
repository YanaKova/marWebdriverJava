import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void test0001() {
        System.out.println("This is will be printed");
    }

    @Test
    public void test0002() {

        int myNumber = 5;
        System.out.println(myNumber);

    }

    @Test
    public void test0003() {

        String messageOne = new String("Who let the dogs out?");
        String messageTwo = "Who who who who!";
        String completeMessage = messageOne + messageTwo;
        System.out.println(completeMessage);
    }

    @Test
    public void test0004() {

        int num = 5;
        String message = "I have " + num + "cookies";
        System.out.println(message);
    }

    @Test
    public void test0005() {

        boolean toBe = false;
        boolean b = toBe || !toBe;
        if (b) {

            System.out.println(toBe);
            int children = 0;
            int a = 0;
            b = true;
            boolean c = false;
        }

    }
//Homework:change to accept parameters so it will always print correct message
    @Test
    public void test006(){
        int a = 5;
        if (a == 5){
            System.out.println("Ohh! So A is 5");
        } else {
            System.out.println("A IS NOT EQUAL TO 4");
        }
    }

    @Test
    public void test007(){
        int[] array0Integers = {1, 9, 9, 5};
        for (int i = 0; i < array0Integers.length; i++){
            int currentElement = array0Integers[i];
            System.out.print(currentElement + ", ");
        }
    }
}
