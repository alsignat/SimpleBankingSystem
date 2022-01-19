package banking;

import org.sqlite.SQLiteConnection;
import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountsDBnew {

    private final SQLiteDataSource dataSource = new SQLiteDataSource();

    public void setDB(String filename) {
        dataSource.setUrl(filename);
        initializeDB();
    }

    public void addAccount() {
        try (Connection con = dataSource.getConnection()) {
            try (Statement statement = con.createStatement()) {
                statement.getResultSet("SELECT * "
                                + "    FROM card"
                                + "    WHERE id = (SELECT MAX(id));");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        accounts.add(new Account());
    }

    public Account getAccount(Input input) {
        System.out.print(System.lineSeparator());
        String accountInput = input.askString("Enter your card number:");
        for (Account account : accounts) {
            if (account.getCardNumber().equals(accountInput))
                return account;
        }
        return null;
    }

    public void initializeDB() {
        try (Connection con = dataSource.getConnection()) {
            try (Statement statement = con.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS card"
                        + "id INTEGER, "
                        + "number TEXT, "
                        + "pin TEXT, "
                        + "balance INTEGER DEFAULT 0"
                );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
