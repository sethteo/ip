import java.util.*;

public class Duke {
    public static void main(String[] args) {
        String DIVIDER = "____________________________________________________________";
        Scanner sc = new Scanner(System.in);
        String WELCOME_TEXT = "Hello! I'm SlayBot\nWhat can I do for you?";
        String BYE_TEXT = "Bye. Hope to see you again soon!";
        String logo = "\n" +
                "   _____ _             ____        _   \n" +
                "  / ____| |           |  _ \\      | |  \n" +
                " | (___ | | __ _ _   _| |_) | ___ | |_ \n" +
                "  \\___ \\| |/ _` | | | |  _ < / _ \\| __|\n" +
                "  ____) | | (_| | |_| | |_) | (_) | |_ \n" +
                " |_____/|_|\\__,_|\\__, |____/ \\___/ \\__|\n" +
                "                  __/ |                \n" +
                "                 |___/                 \n";
        System.out.println(logo);
        System.out.println(DIVIDER + "\n" + WELCOME_TEXT + "\n" + DIVIDER);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("bye")) {
                System.out.println(DIVIDER + "\n" + BYE_TEXT + "\n" + DIVIDER);
                break;
            } else {
                System.out.println(DIVIDER + "\n" + input + "\n" + DIVIDER);
            }
        }

    }
}
