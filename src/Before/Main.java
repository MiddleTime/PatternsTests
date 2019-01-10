/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Before;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        comp.createSoftware();
//        new Company().createSoftware();  когда такое нужно?
    }
}

 class Company{
    void createSoftware(){
        System.out.println("Starting company activity");
        Designer desinger = new Designer(); 
        desinger.designArchitecture();
        Programmer programmer = new Programmer();
        programmer.programmingCode();
        Tester tester = new Tester();
        tester.TestingCode();
    }
}

class Designer {
    void designArchitecture(){
        System.out.println("I`m disinger. Create architecture!");
    }
}

 class Programmer {
    void programmingCode(){
        System.out.println("I`m programmer. Programming code!");
    }
}

class Tester {
    void TestingCode(){
        System.out.println("I`m tester. Testing code!");
    }
}

