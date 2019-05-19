package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    Student student = inputStudent();
                    studentManagement.add(student);
                    break;
                }
                case 2: {
                    Student student = inputStudent();
                    studentManagement.update(student);
                    break;
                }
                case 3: {
                    boolean res = studentManagement.show();
                    if(res == false){
                        System.out.println("Ko co sinh vien");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhap ID:");
                    int id = input.nextInt();
                    studentManagement.remove(id);
                    break;
                }
            }
        } while (choice != 0);


    }

    public static void menu() {
        System.out.println("\n");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Cap nhat sinh vien");
        System.out.println("3. Hien thi sinh vien");
        System.out.println("4. Xoa sinh vien");
        System.out.println("0. Thoat");
        System.out.println("--Nhap vao chon lua:");
    }

    public static Student inputStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Name:");
        String name = input.nextLine();
        System.out.println("Nhap Age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Address:");
        String address = input.nextLine();
        System.out.println("Nhap GPA:");
        float gpa = input.nextFloat();

        Student student = new Student(id, name, age, address, gpa);
        return student;
    }


}
