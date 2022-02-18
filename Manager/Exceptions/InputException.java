package Manager.Exceptions;

import java.util.Scanner;

public class InputException {
    public static int integerInput(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ban da nhap sai dinh dang, vui long nhap lai");
            }
        }
    }

    public static double scoreInput(Scanner sc, String msg){
        while (true) {
            try {
                System.out.println(msg);
                double score = Double.parseDouble(sc.nextLine());
                if(score<=10 && score>=0) {
                    return score;
                }else{
                    System.err.println("Ban phai nhap tu 0 den 10,vui long nhap lai");
                }
            } catch (Exception e) {
                System.err.println("Ban nhap sai dinh danh, vui long nhap lai");
            }
        }
    }
}
