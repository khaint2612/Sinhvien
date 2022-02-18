package Manager.view;

import java.io.IOException;
import java.util.Scanner;

import Manager.Exceptions.InputException;
import Manager.controller.StudentController;

public class viewMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentController stcon = new StudentController();
        do {
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Xuat danh sach sinh vien");
            System.out.println("3.Tim sinh vien theo ma");
            System.out.println("4.Tim sinh vien theo khoang diem");
            System.out.println("5.Sap xep sinh vien theo ten");
            System.out.println("6.Sap xep sinh vien theo diem");
            System.out.println("7.Top 5 sinh vien co diem cao nhat");
            System.out.println("8.Tim tat ca sinh vien theo hoc luc");
            System.out.println("0.Exit");
            System.out.println("---------------------");
            int choose = InputException.integerInput(sc,"Vui long chon chug nang:");
            switch (choose) {
                case 1:
                    stcon.input();
                    break;
                case 2:
                    stcon.output();
                    break;
                case 3:
                    stcon.findStudentById();
                    break;
                case 4:
                    stcon.findStudentByMark();
                    break;
                case 5:
                    stcon.sortStudentByName();
                    break;
                case 6:
                    stcon.sortStudentByMark();
                    break;
                case 7:
                    stcon.Top5Student();
                    break;
                case 8:
                    stcon.findStudentByRank();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon 1 chuc nang");
                    break;
            }
        } while (true);
    }

}
