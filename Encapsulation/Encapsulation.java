class Student{
    private String name;
    private int age;
    private int rollno;
     


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name ;
    }

    public void setAge(int age){
      this.age=age;
    }
    public int getAge(){
         return age;
    }

    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public int getRollno(){
        return rollno;
    }
}


public class Main{
    public static void main(String []args){

        Student student = new Student();

        student.setName("Sudarshan");
        

        student.setAge(23);
    

        student.setRollno(15);
    

        System.out.println("Name: "+ student.getName());
        System.out.println("Age:"+ student.getAge());
        System.out.println("Rollno:"+ student.getRollno());

    }
}
