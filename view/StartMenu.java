package view;

import entities.Account;
import service.AccountLoginService;
import service.AccountRegisterService;

import java.util.List;
import java.util.Scanner;

public class StartMenu {
    AccountRegisterService accountRegisterService = new AccountRegisterService();
    AccountLoginService accountLoginService = new AccountLoginService();

    public void displayStartMenu (Scanner sc, List<Account> accounts) {
        System.out.println("");
        do {
            System.out.println("============Techmaster_start============");
            System.out.println("    1. Dang nhap");
            System.out.println("    2. Dang ky\n");
            System.out.print("Lua chon (1 hoac 2): ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Account accountlogin = accountLoginService.login(sc, accounts);
                    break;
                case 2:
                    Account accountregister = accountRegisterService.register(sc, accounts);
                    break;
            }
            System.out.println(accounts);
        } while (true);
    }
}
