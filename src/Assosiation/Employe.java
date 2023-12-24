package association;

import statickeyword.Employee;

public class Employe {
    String employeName;
    String job;
    String position;
    Family family;
     Bike bike;
    Employe (String employeName,String job,String position,Family family,Bike bike){
        this.employeName = employeName;
        this.job = job;
        this.position = position;
        this.family = family;
        this.bike = bike;
    }

    void display(){
        System.out.println("EmployeName "+employeName);
        System.out.println("job "+job);
        System.out.println("position "+position);
        System.out.println("Family"+family);
        System.out.println("Bike "+bike);
    }
}
class Family {
    String family;
//    int no;
    Family(String family){
        this.family = family;
//        this.no = no;
    }
}

class Bike {
    String bike;
    Bike(String bike){
        this.bike = bike;
    }
}

class EmployeImpl{
    public static void main(String[] args) {
        Family family = new Family("Family");
        Bike  bike = new Bike("NO");
        Employe employe = new Employe("Avinash","TCS","FSD",family,bike);
        employe.display();
    }
}