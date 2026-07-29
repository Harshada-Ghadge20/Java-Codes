import java.util.ArrayList;
public class Main{
    public static void main(String args[]){

ArrayList<String>Subject = new ArrayList<>();

Subject.add("Python");
//Subject.add("Java");
Subject.add("DBMS");
Subject.add("HTML");
Subject.add("CSS");


System.out.println("Subject");


if (Subject.contains ("Java")){
    System.out.println("Java is present in the subject list");
}
else{
    System.out.println("Java is not present in the subject list");
}
    }
}
