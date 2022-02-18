package Manager.controller;

import java.util.*;

import Manager.Exceptions.InputException;
import Manager.student.Student;

public class StudentController {
    List<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void input() {
        while (true) {

            if (!list.isEmpty()) {
                System.out.println("Ban co muon nhap tiep khong?\nY/N");
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    Student student = new Student();
                    student.input(sc);
                    list.add(student);
                } else if (answer.equals("n")) {
                    break;
                } else {
                    System.err.println("Vui long nhap y/n");
                }
            } else {
                Student student = new Student();
                student.input(sc);
                list.add(student);
            }
        }
    }

    public void output() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
        }
    }

    public void findStudentById() {
        int idFound = InputException.integerInput(sc, "Nhap ma sinh vien can tim:");
        boolean find = false;
        for (int i = 0; i < list.size(); i++) {
            if (idFound == list.get(i).getId()) {
                list.get(i).output();
                find = true;
            }
        }
        if (!find) {
            System.out.println("Khong co sinh vien co ma " + idFound);
        }
    }

    public void findStudentByMark() {
        double min = InputException.scoreInput(sc, "Nhap diem thap nhat can tim:");
        double max = InputException.scoreInput(sc, "Nhap diem cao nhat can tim:");
        boolean find = false;
        for (Student student : list) {
            if (student.getAVG() >= min && student.getAVG() <= max) {
                student.output();
                find = true;
            }
        }
        if (!find) {
            System.out.println("Khong co sinh vien co trong khoang diem");
        }
    }

    public void sortStudentByName() {
        Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));
        for (Student student : list) {
            student.output();
        }
    }

    public void sortStudentByMark() {
        Collections.sort(list, (a, b) -> (int) (a.getAVG() - b.getAVG()));
        for (Student student : list) {
            student.output();
        }
    }

    public void Top5Student() {
        Collections.sort(list, (a, b) -> (int) (b.getAVG() - a.getAVG()));
        for (int i = 0; i < 5; i++) {
            list.get(i).output();
        }
    }

    public void findStudentByRank() {
        System.out.println("Ban muon tim sinh vien co hoc luc nao?");
        System.out.println("1.Gioi");
        System.out.println("2.Kha");
        System.out.println("3.Trung binh");
        System.out.println("4.Yeu");
        System.out.println("0.Exit");
        int choose = InputException.integerInput(sc, "");
        List<Student> listFound = new ArrayList<>();
        switch (choose) {
            case 1:
                for (Student student : list) {
                    if (student.getRank().equals("Gioi")) {
                        listFound.add(student);
                    }
                }
                break;
            case 2:
                for (Student student : list) {
                    if (student.getRank().equals("Kha")) {
                        listFound.add(student);
                    }
                }
                break;
            case 3:
                for (Student student : list) {
                    if (student.getRank().equals("Trung binh")) {
                        listFound.add(student);
                    }
                }
                break;
            case 4:
                for (Student student : list) {
                    if (student.getRank().equals("Yeu")) {
                        listFound.add(student);
                    }
                }
                break;
            default:
                System.out.println("Vui long nhap dung chuc nang");
                break;
        }
        for (int i = 0; i < listFound.size(); i++) {
            listFound.get(i).output();
            System.out.println();
        }
    }
}