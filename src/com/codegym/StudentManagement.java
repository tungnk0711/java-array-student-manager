package com.codegym;

public class StudentManagement {

    private Student[] students = new Student[10];
    private int count = 0;

    public boolean add(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
            return true;
        }
        return false;
    }

    public boolean update(Student student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == student.getId()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            students[index].setName(student.getName());
            students[index].setAge(student.getAge());
            students[index].setAddress(student.getAddress());
            students[index].setGpa(student.getGpa());
            return true;
        }
        return false;
    }

    public boolean remove(int id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
            count--;
            return true;
        }

        return false;
    }

    public boolean show() {
        if (count != 0) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    System.out.println("\nID:" + students[i].getId() + "\nName:" + students[i].getName() + "\nAge:" + students[i].getAge() + "\nAddress:" + students[i].getAddress() + "\nGPA:" + students[i].getGpa());
                }
            }
            return true;
        }
        return false;
    }
}
