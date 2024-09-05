import entities.Account;
import view.StartMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        StartMenu startMenu  = new StartMenu();

        startMenu.displayStartMenu(scanner, accounts);
    }
}
