
   public class Lecturer extends Teacher
  /*here Lecturer is a sub class (child class) of Teacher which is a parent class,
   To achieve inheritance we use the keyword extends*/

  { 
    
    private String department;
    
    private int yearsOfExperience;
    
    private int gradedScore;
    
    private boolean hasGraded;
    
    //these are all instance variable which there respective datatypes according to the que
    
     public Lecturer(int teacherID, String teacherName,String address,String workingType,String employmentStatus, String department,int yearsOfExperience,int workingHours)
    
    /*creating Leacturer as a Constructor with above parameters,it is mainly used to initialize instance variable in a class.
     * 
    we are using constructor overloading method because we are using the same name in constructor which is also our class name.*/
    
    {
        super(teacherID,teacherName,address,workingType,employmentStatus);
        
        this.department=department;
        
        this.yearsOfExperience=yearsOfExperience;
        
        this.gradedScore=0;
        
        this.hasGraded=false;
        
        //instance varibale to parameter
    }
    //each attributes has a corresponding accessor method i.e a getter method according to que so below we applied getter method
    
    public String getDepartment()
    
    {
        return this.department;
    }
    
      public int getGradedScore()
    {
        return this.gradedScore;
    } 
    
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    
     public boolean getHasGraded()
    {
        return this.hasGraded;
        
         //getter method is used to view/access and return the value of data/attributes
    }
    
       //creating a mutator method for attribute gradedScore i.e a setter method
       
       public void setGradedScore(int gradedScore)
       
       { 
           this.gradedScore=gradedScore;
           
       }
       
       public void gradeAssignment(int gradedScore,String Department,int yearsOfExperience)
       
       {
           //if ,else if and else statement to print the output which is shown in the question 
           
           if(yearsOfExperience >=5 && this.department.equals(department))
           
           {
               if (gradedScore >=70)
               
               {
                   System.out.println("A");
               }
               
               else if(gradedScore >=60)
               
               {
                   System.out.println("B");
                   
               }
               
               else if(gradedScore >=50)
               
               {
                   System.out.println("C");
                   
               }
               
               else if(gradedScore >=40)
               
               {
                   System.out.println("D");
                   
               }
               
               else if(gradedScore >=30)
               
               {
                   System.out.println("E");
                   
               }
               
               else
               
               {
                   System.out.println("Grade Not Assigned");
                   
               }
               
               //overriding
               
           }
        }
        
        //using diplay method to dislay the output
        
           public void display()
           {
               super.display();
               
               //here parent class is called from display method to override
               
               System.out.println("Department" +this.department);
               
               System.out.println("YearsOfExperience" +this.yearsOfExperience);
               
               System.out.println("gradedScore" +this.gradedScore);
               
               if(hasGraded)
               
               {
                    System.out.println(this.hasGraded);
                    System.out.println("Grading was a success");
                    
               }
               
               else
               
               {
                   System.out.println("Grade is not Assigned");
                   
               }
           
       }
       
    }
        
    








