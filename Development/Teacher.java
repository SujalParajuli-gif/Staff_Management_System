

    public class Teacher//this class is the parent class

{
    //creating 6 attributes of teacher class according to que
    
     private int teacherID;
    
     private int workingHours;//applying datatypes according to the que
    
     private String teacherName;
    
     private String workingType;
    
     private String employmentStatus;//applying datatypes according to the que
    
     private String address;
     
     /*aboves are all instance variable which have private
     as an access specifier*/
    
     public Teacher(int teacherID,String teacherName,String workingType,String employmentStatus, String address)//making constructor accept 5 parameters according to the que
    
     //creating Teacher as a Constructor with above parameters,it is mainly used to initialize instance variable in a class
     
     //we are using constructor overloading method because we are using the same name in constructor which is also our class name i.e "Teacher"
    
     {
        
        this.teacherID=teacherID;
    
        this.teacherName=teacherName;
    
        this.address=address;
    
        this.workingType=workingType;
    
        this.employmentStatus=employmentStatus;
    
        /*above is "This keyword" which is assigning varibable with parameter values, it is used inside the constructor 
     
       to call another overloaded constructor in the same class which is "Teacher" in our case*/ 
    
    
     }
    
    //each attributes has a corresponding accessor method i.e a getter method according to que so below we applied getter method
    
      public int getTeacherID()
    
       {
         return this.teacherID;
        
       }
    
    
      public String getTeacherName()
     
       {
        return this.teacherName;
        }
    
    
      public String getAddress()
    
        {
        return this.address;
        }
    
    
     public String getWorkingType()
    
       {
        return this.workingType;
        
        }
   
    
      public int getWorkingHours()
    
       {
        return this.workingHours;
        
       }
    
    
      public String getEmploymentStatus()
    
       {
        return this.employmentStatus;
        
        //getter method is used to view/access and return the value of data/attributes
       }
    
       /*method to set the workinghrs which accepts a new workinghrs as a parameter
     
       i.e we need to create a setter method(mutator method) */
    
      public void setWorkingHours(int newWorkingHours)
    
       {
        this.workingHours=newWorkingHours;
        
        }
    
       //display method to display the output
    
      public void display()
        {
         System.out.println("The teacherID is =" +getTeacherID() +"\nThe Address is ="
         +this.getAddress()+ "\nworking Type is =" + this.getWorkingType() + "\nName of the teacher is ="
         + this.getTeacherName()+  "\nworking hours is =" + this.getWorkingHours() +
         "\nthe employment status is = " + this.getEmploymentStatus());
        
        
        //using if and else condition to display a suitable message when working hour is not assigned and when it is assigned
        
        if(workingHours>0)
        
        {
            System.out.println("working hours" + workingHours); //which it is assigned
        }
        
        else
        
        {
            System.out.println("Value not assigned");  //when not assigned
        }
        
       }
}   
