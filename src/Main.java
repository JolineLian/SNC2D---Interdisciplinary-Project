import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDone = false;

        System.out.println("would you like to view the rules?");
        String rules = in.nextLine();
        if (rules.equalsIgnoreCase("yes") || rules.equalsIgnoreCase("Y")) {
            Instructions ins = new Instructions();
            ins.options();
        } else {
            System.out.println("ok");
        }

        while (!isDone) {
        System.out.println("what would you like to practice (elements or compounds)");
        String choice = in.nextLine();
        if (choice.equalsIgnoreCase("elements")) {
            Elements el = new Elements();
            el.options();
        } else if (choice.equalsIgnoreCase("compounds")) {
            Compounds el = new Compounds();
            el.options();
        } else {
            System.out.println("invalid input, please enter \"elements\" or \"compounds\"");
        }
    }

        in.close();
    }
}
