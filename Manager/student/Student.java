package Manager.student;
import java.util.Scanner;

import Manager.Exceptions.InputException;
public class Student{
    private int id;
    private String name;
    private double math;
    private double chemistry;
    private double physics;

    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMath(double math){
        this.math = math;
    }

    public String getName(){
        return name;
    }
    public double getMath(){
        return math;
    }

    public void setPhysics(double physics){
        this.physics = physics;
    }

    public double getPhysics(){
        return physics;
    }

    public void setChemistry(double chemistry){
        this.chemistry = chemistry;
    }

    public double getChemistry(){
        return chemistry;
    }

    public double getAVG(){
        return (math+chemistry+physics)/3;
    }

    public String getRank(){
        if(getAVG()<5){
            return "Yeu";
        }else if(getAVG()>= 5 && getAVG()<6.5){
            return "Trung binh";
        }else if(getAVG()>= 6.5 && getAVG()< 8){
            return "Kha";
        }else{
            return "Gioi";
        }

    }

    public void input(Scanner scanner){
        
        id =  InputException.integerInput(scanner, "Vui long nhap ma sinh vien:");
        // System.out.println();
        System.out.print("Nhap ten sinh vien:");
        name = scanner.nextLine();
        // System.out.println();
        math = InputException.scoreInput(scanner, "Nhap diem toan cho sinh vien:");
        // System.out.println();
        physics = InputException.scoreInput(scanner, "Nhap diem vat ly cho sinh vien:");
        // System.out.println();
        chemistry = InputException.scoreInput(scanner, "Nhap diem hoa hoc cho sinh vien:");
    }

    public void output(){
        System.out.printf("Ma sinh vien: " + id + "\n" + "Ten sinh vien: " + name + "\nDiem trung binh cua sinh vien:" + getAVG() +"\nHoc luc cua sinh vien:"+getRank());
    }
}