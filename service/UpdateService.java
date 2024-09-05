package service;

import entities.Account;

import java.util.List;
import java.util.Scanner;

public class UpdateService {
    public Account updatePasswordService (List<Account> accounts, int i, Scanner scanner) {
        String updatepassword = scanner.nextLine();
        accounts.get(i).setPassword(updatepassword);
        return new Account(accounts.get(i).getUsername(), updatepassword, accounts.get(i).getEmail());
    }
    public Account updateUsernameService (List<Account> accounts, int i, Scanner scanner) {
        String updateusername = scanner.nextLine();
        accounts.get(i).setUsername(updateusername);
        return new Account(updateusername, accounts.get(i).getPassword(), accounts.get(i).getEmail());
    }
    public Account updateEmailService (List<Account> accounts, int i, Scanner scanner) {
        String updateemail = scanner.nextLine();
        accounts.get(i).setUsername(updateemail);
        return new Account(accounts.get(i).getUsername(), accounts.get(i).getPassword(), updateemail );
    }
}
