import java.util.Scanner;   //IMPORT SCANNER CLASS
    class GetInputFromUser
    {
        public static void main(String args[])
        {
                    Scanner in = new Scanner(System.in); //MAKE OBJECT OF CLASS "Scanner" USING "new" KEYWORD
            String s = in.nextLine();  //USE OBJECT TO CALL FN'S("nextLine() : for string)
            System.out.println("You entered string "+s);
            int a = in.nextInt();  //"nextInt() : for int
            System.out.println("You entered integer "+a);
            float b = in.nextFloat();  //"nextFloat() : for float
            System.out.println("You entered float "+b);
        }
    }
