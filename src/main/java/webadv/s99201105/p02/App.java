package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println("username:");
        String username = sc.next();
        System.out.println("password:");
        String password = sc.next();
        if(username!=null&&password!=null){
            System.out.println("欢迎"+username);
            System.out.println("密码："+sha256hex(password));
        }
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
