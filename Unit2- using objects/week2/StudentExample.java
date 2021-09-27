package week2;

public class StudentExample {

    public static void main(String[] args) {
    // richie is a variable to an instance of the class student 
        Student richie = new Student("richie", "382934", 12);
        Student yola = new Student ("yola", "123456", 10);
    
    // ritchie and yola are references to 2 different students 

    Student rastin = ritchie;
    // because rastin and ritchie frefer to the same Student object it increase the grade for both (still its only 1 object) 

    rastin.increaseGrade();

    ritchie = null; 
    
    // student tristan; tristan is currently the null reference 

    // ritchie.increaseGrade();   throws java. lang. NullPointerException between ritchie is null
    
    yola.addTest(87);
    yola.displayAverage();
    yola.addTest(91);
    yola.displayAverage();
    yola.addTest(97);
    yola.displayAverage();
    yola.addTest(67);
    yola.displayAverage();


    //Student yola = new Student ("Harrison", "547235");
    double yolaAverage = yola.getAverage(); 

    System.out.println(yola.getName()+ " Has an average of" + yolaAverage());

   


    }
    
}
