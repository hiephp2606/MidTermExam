package view;

import entities.Account;
import service.UpdateService;

import java.util.List;
import java.util.Scanner;

public class UpdateMenu {

    UpdateService updateService = new UpdateService();
    public void displayUpdatePassword (Scanner scanner, List<Account> accounts, int i) {
        System.out.printf("Quen mat khau? (Y/N): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            System.out.printf("Password moi: ");
            Account changepassword = updateService.updatePasswordService(accounts, i, scanner);
        }
        else {}
    }


    public void displayUpdateTheRest (Scanner scanner, List<Account> accounts, int i) {
        boolean loop = true;
        do {
            System.out.println("============WELCOME " + accounts.get(i).getUsername() + "============" );
            System.out.println("   1 - Thay đổi username\n" +
                    "   2 - Thay đổi email\n" +
                    "   3 - Thay đổi mật khẩu\n" +
                    "   4 - Đăng xuất ");

            System.out.printf("Xin vui long nhap lua chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.printf("Usrname: ");
                    Account changeusername = updateService.updateUsernameService(accounts, i, scanner);
                    break;
                case 2:
                    System.out.printf("Password: ");
                    Account changepassword = updateService.updatePasswordService(accounts, i, scanner);
                    break;
                case 3:
                    System.out.printf("Email: ");
                    Account changeemail = updateService.updateEmailService(accounts, i, scanner);
                    break;
                case 4:
                    loop = false;
                    break;
            }
        } while (loop = true);
    }
}
