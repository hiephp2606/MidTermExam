package service;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValid {
    public String checkEmail (Scanner sc) {
        String email;
        while (true){
            System.out.printf("Email: ");
            email = sc.nextLine();
            Pattern p =  Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+)+$");
            if( p.matcher(email).find()) {
                break;
            }
            else {
                System.out.println("Email nhap khong hop le,xin vui long nhap lai");
            }
        }

        return email;
    }

    public String checkPassword (Scanner sc) {
        String password;
        while (true){
            System.out.printf("Password: ");
            password = sc.nextLine();
            Pattern p =  Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?!.* ).{7,15}$");
            if( p.matcher(password).find()) {
                break;
            }
            else {
                System.out.println("Password nhap khong hop le (7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt),xin vui long nhap lai");
            }
        }

        return password;
    }
}
