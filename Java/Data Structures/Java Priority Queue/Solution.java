import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
       PriorityQueue <Student> pq = new PriorityQueue< >
           (Comparator.comparing (Student::getCgpa).reversed().
               thenComparing(Student::getFname).
            thenComparing(Student::getToken));
        String name;int id;double cgpa;
        Student st ;
      while(totalEvents>0){
         String event = in.next();
           switch(event){
                case "ENTER" : 
                    name = in.next();
                    cgpa = in.nextDouble();
                    id = in.nextInt();
                    st = new Student(id,name,cgpa); 
                    pq.add(st); break;
                case "SERVED" :
                    pq.poll();
                    break;
            } 
           
         totalEvents--;
      }
        if(pq.isEmpty()){
            System.out.println("EMPTY");
        }else
        {
            while(!pq.isEmpty()){
                System.out.println(pq.poll().getFname());
            }
        } 
    }
}
