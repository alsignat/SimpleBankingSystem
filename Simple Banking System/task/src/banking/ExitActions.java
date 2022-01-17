package banking;

public class ExitActions implements UserAction {

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(AccountsDB db, Input input) {
        System.out.println("Bye!");
        System.exit(0);
        return true;
    }

    public void exit() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
