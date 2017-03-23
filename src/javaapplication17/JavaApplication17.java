/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author My
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Student s1=new Student("RAm",23,"235235");
        String[] names={"Ram23553","Shyam","BKK"};
//        for(int i=0;i<names.length;i++){
//            Student s1=new Student(names[i],(int)(Math.random()*100.0),"235235");
//        }
        Student s1=new Student(names[0],(int)(Math.random()*100.0),"235235");
        s1.setAge(23);
        s1.setName("Rahul");
        
        
//        Student s2=s1;
//        s2.setName("Dummy Name");
//        System.out.println(s1.name);
//        Student[] studentList={s1,s2};
//        s1.setName("Hari");
////        s1.name="sdgdsh";
//        s1.setAge(28);
//        s1.setMobileNumber("346436");
        
//        s1.
//        s1.getStudentInfo();
//        
//        Student s2=new Student();
//        System.out.println(s1.getAge());
        // TODO code application logic here
//        System.out.println("Hello World");
//        for(int i=1;i<65500;i++){
//            System.out.println((char)i);
//        }
//        short score;
//        System.out.println("");
//        String fname="RAm";
//        String lname="Sharma";
//        System.out.println(fname+" "+lname);
        
        

//        String[] names={"Ram","Shyam","Hari","RAhul","Rita","Gita"};
        
//        for(int i=0;i<5;i++){
//            if(names[0].equals("Hari")){
//                break;
//            }
//            System.out.println(names[i]);
//        }
//        for(String name:names){
//            if(name.equals("Hari")){
//                continue;
//            }
//            System.out.println(name);
//        }
//        
//        
        
//        
//        System.out.println(names[0]);
//        System.out.println("THe array has "+names.length+" items");
//        
//        
//        for(String name : names){
//            System.out.println(name);
//            if(name.equals("Shyam") || name.equals("Rita") ){
//                break;
//            }
//        }
//        for(int j=1;j<10;j++){
//            for(int i=1;i<10;i++){
//                System.out.print(j+" X "+i+" = "+j*i+"\t");
//            }
//            System.out.println("");
//        }
        
        

//          int[] numbers=new int[100];
//          for(int i=0;i<100;i++){
//              numbers[i]=i+1;
//          }
//          
//          for(int i=0;i<=100;i+=5){
//              System.out.println(i);
//          }w

//        String fName="Nepal, Kathmandu,Putalisadak";
////        String converted=fName.toUpperCase();
////        System.out.println(converted);
//         System.out.println(fName.substring(7,12));
//         String userInput="Ram Sharma";
//         String userName=userInput.substring(1,3)+userInput.substring(2,4);
//         System.out.println(userName);
//         StringBuilder sb=new StringBuilder("Shyam");
//         System.out.println(sb.reverse());
//            short a,b;
//            int c=0;
//            a=34;
//            b=23;
//            c=a+b;
//            
//            
//            System.out.println(b);
        int max=Util.maximum(34, 67);
//        Math.
        Runtime r=Runtime.getRuntime();
//        r.ring 

        System.out.println("\u2344");
        System.out.println(Math.PI);  
        
        double area=Util.getAreaOfCircle(23);
        System.out.println("THe area of circle is "+area);
        
        Util.printPattern("3");
        Util.printPattern("3");
         
    }
    
}
