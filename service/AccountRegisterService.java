package service;

import entities.Account;

import java.util.List;
import java.util.Scanner;

public class AccountRegisterService {
    CheckValid check = new CheckValid();
    public Account registeripunt (Scanner scanner) {
        System.out.printf("Nhap Username: ");
        String username = scanner.nextLine();
        String password = check.checkPassword(scanner);
        String email = check.checkEmail(scanner);
        return new Account(username, password, email);
    }


    public Account register (Scanner scanner, List<Account> accounts) {
        Account account = registeripunt(scanner);
        int size = accounts.size();
        if ( size == 0 ) {
            accounts.add(account);
            System.out.println("Dang ky tai khoan thanh cong!");
        }
        else {
            for (int i = 0; i < size; i++) {
                if (account.getUsername().equals(accounts.get(i).getUsername()) && account.getEmail().equals(accounts.get(i).getEmail()) ) {
                    System.out.println("Username va Email da ton tai, vui long nhap Username va Email kahc!");
                }
                else if (account.getUsername().equals(accounts.get(i).getUsername())) {
                    System.out.println("Username da ton tai, vui long nhap Username khac!");
                }
                else if (account.getEmail().equals(accounts.get(i).getEmail())) {
                    System.out.println("Email da duoc su dung, vui long nhap Email khac!");
                }
                else if (i == size - 1){
                    System.out.println("Dang ky tai khoan thanh cong!");
                    accounts.add(account);
                }
            }
        }

        return new Account(account.getUsername(), account.getPassword(), account.getEmail());
    }
}
