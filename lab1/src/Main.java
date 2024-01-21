// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        int sum = 0;
        String[] months = {"January", "February", "March", "April ", "May", "June ", "July", "August", "September", "October", "November", "December "};
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " are " + month_days[i] + " zile.");
            if (month_days[i] == 31) {
                System.out.println(months[i] + " are " + month_days[i] + " zile.");
            }
            if (month_days[i] < 31) {
                System.out.println(months[i] + " are " + month_days[i] + " zile.");
                count++;
                sum = month_days[i] + sum;
            }
        }
        for (int j = 0; j < months.length; j++) {
            String FirstThree = months[j].substring(0, 3);
            System.out.println(FirstThree);
        }
        System.out.println(count + " si suma zilelor " + sum);
    }
    // Press Alt+Enter with your caret at the highlighted text to see how
    // IntelliJ IDEA suggests fixing it.


    // Press Shift+F10 or click the green arrow button in the gutter to run the code.


    // Press Shift+F9 to start debugging your code. We have set one breakpoint
    // for you, but you can always add more by pressing Ctrl+F8.

}