import java.io.BufferedReader;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

/* Prima parte
    public static void printMonkeys(String[] monkeys) throws  Exception
    {
        for(int i = 0 ; i<= monkeys.length; i++)
        {

            System.out.println(monkeys[i]);

        }
        throw new Exception("Exception!!!");

    }


    public static void main(String[] args) {

        int[] myArray = {1, 2, 3};
        for(int variable : myArray)
        {

            System.out.println(variable);

        }

        try{

            for(int i = 0; i<= myArray.length; i++ )
            {

                System.out.println(myArray[i]);

            }

        } catch(ArrayIndexOutOfBoundsException ex ){

            System.out.println(ex.getMessage());


        } finally {

            System.out.println("Am ajuns in finally");

        }

        String[] monkeysArray = {"monkey1" , "monkey2", "monkey3"};
        try{

            printMonkeys(monkeysArray);

        }catch (Exception ex){

            System.out.println("Ceva");

        }

        IFileInputOutputService fileIOService = new FileInputOutputService();
*/


/*        A doua parte
char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
try {
    do {
        c = (char) br.read();
        System.out.println(c);
    } while (c != 'q');
    }catch (Exception ex)
        {
        System.out.println(ex.getMessage());
       }
    }*/


    /* 3
    BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));
    String str;
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'stop' to quit.");
    do {
        str = br.readLine();
        System.out.println(str);
    } while (!str.equals("stop"));*/



}