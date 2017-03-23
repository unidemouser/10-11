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
public class Student {
    
    public String name;
    private int age;
    private String mobileNumber;
    private String password="sldglksdbglk";
    final private int a=23;
//    private Teacher teacher;
    
    public Student(String name,int age,String mobileNumber){
        setName(name);
        this.setAge(age);
        this.mobileNumber=mobileNumber;
//        a=56;
        getStudentInfo();
    }
    
    public Student(String name){
        this.name=name;
        this.age=16;
        this.mobileNumber="defaultNo";
    }
    
    public void setName(){
        this.name="Dt nameefaul";
    }
    
    public void setName(String name){
//       int noOfChar=name.length();
        if(name.length()>=8){
//            name.
            if(name.matches("[a-zA-Z]")){
                this.name=name;
            }
            
        }
        getStudentInfo();
        
    }
    /**
     * This class return a new instance of Student class.
     * @return 
     */
    public static Student getStudent(){
        Student s=new Student("",3,"");
        return s;
    }
    public void setAge(int op){
        if(op<30){
            this.age=op;
        }else{
        
        }
        getStudentInfo();
    }
    
    public void setMobileNumber(String nos){
        this.mobileNumber=nos;
        getStudentInfo();
//        age
//        setAge(34);
    }
    private void getStudentInfo(){
        System.out.println("Student name is "+name+"\nAge is "+age+"\nMobile no is "+mobileNumber);
        int a=23;
        int b=45;
        if(true){
            int c=45;
        }
        
//        System.out.println(34);
//        System.out.println('A');

    }
    
    public int getAge(){
        
        return age;
    }
    
    
    
}
