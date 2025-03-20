package com.srijan.SpringDemo;

public class Alien {
    int age ;

    private Computer com ;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


    public Alien() {
        System.out.println("Alien created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Code(){
        System.out.println("HI, this is anand");
        com.compile();
    }
}
