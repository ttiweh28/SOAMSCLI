package cs425swemidterm202503hewitt;

import cs425swemidterm202503hewitt.model.Patient;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome the SmartOnline Appointment Management System!");


        var Patients = List.of(
                new Patient(1,"Hewitt","Tusiime","(456) 245 345", "h@miu.edu","28-03-1998","4th St IA"),
                new Patient(1,"Henrietta","Atwine","(234) 278 115", "hen@miu.edu","28-12-2000","5th St IA"),
                new Patient(1,"Hezlee","Kihembo","(456) 945 675", "hez@miu.edu","19-04-1996","6th St IA"),
        new Patient(1,"Hezlee","Kihembo","(456) 945 675", "hez@miu.edu","19-04-1996","6th St IA")

        );

        Patients.forEach(System.out::println);


    }
}