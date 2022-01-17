package banking;

public class CreateAccountAction implements UserAction {

    @Override
    public String name() {
        return "Create an account";
    }

    @Override
    public boolean execute(AccountsDB db, Input input) {
        db.addAccount();
        return true;
    }
}
