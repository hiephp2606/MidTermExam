package service;

import entities.Account;
import view.UpdateMenu;

import java.util.List;
import java.util.Scanner;

public class AccountLoginService {
    UpdateMenu updateMenu = new UpdateMenu();
    UpdateService updateService = new UpdateService();
    public Account logininput (Scanner scanner) {
        System.out.printf("Nhap Username: ");
        String username = scanner.nextLine();
        System.out.printf("Nhap Password: ");
        String password = scanner.nextLine();
        String email = "";
        return new Account(username, password, email);
    }
    public Account login (Scanner scanner, List<Account> accounts) {
        Account login = logininput(scanner);
        int size = accounts.size();
        for (int i = 0; i < size; i++) {
                if (login.getUsername().equals(accounts.get(i).getUsername()) && login.getPassword().equals(accounts.get(i).getPassword())) {
                    System.out.println("Dang nhap thanh cong!\n");
                    updateMenu.displayUpdateTheRest(scanner, accounts, i);
                    break;
                }
                else if (login.getUsername().equals(accounts.get(i).getUsername())) {
                    System.out.println("Password vua nhap sai!\n");
                    updateMenu.displayUpdatePassword(scanner, accounts, i);
                }
                else {
                    System.out.println("Username khong ton tai, xin vui long kiem tra lai\n");
                }
        }
        return new Account(login.getUsername(), login.getPassword(), "");
    }
}
