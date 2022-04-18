package HW6;

public class Person {

    String name;
   private int age;
   private String gender;

   Person (String name, int age, String gender) {
       this.name = name;
       this.age = age;
       this.gender = gender;
   }

public String getName () {
       if (gender.equals("F")) {
           return "Ms. " + this.name;
       } else if (gender.equals("M")){
           return "Mr. " + this.name;
       } else {
           return this.name;
       }
}



}
