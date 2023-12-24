package String;

public class Student {
  private int rno;
  private String name;
  private double percentage;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

   public String getName() {
        return name;
   }
   public void setName(String name) {
        this.percentage =percentage;

   }


    @Override
    public String toString() {
        return "student{" +
                "rno=" + rno +
                ",name='" + name + "\'' +" +
                ",percentage=" + percentage +'}';
    }
}

class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRno(17);
        s1.setName("Avi");



        System.out.println(s1.toString());

    }
}