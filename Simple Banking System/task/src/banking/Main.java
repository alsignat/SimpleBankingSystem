package banking;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AccountsDB database = new AccountsDB();
        Input input = new Input();
        boolean running = true;
        while (running) {
            List<UserAction> actions = List.of(
                    new ExitActions(),
                    new CreateAccountAction(),
                    new LogginAction()
            );
            for (int i = 1; i < actions.size(); i++) {
                System.out.println(i + ". " + actions.get(i).name());
            }
            System.out.println("0" + ". " + actions.get(0).name());
            int select = input.askInt("");
            UserAction selected = actions.get(select);
            running = selected.execute(database, input);
        }

    }
}