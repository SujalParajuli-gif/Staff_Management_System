
     //here Tutor is also the sub class of teacher

        public class Tutor extends Teacher
    {
          //creating 5 attributes of teacher class according to que
      
         private double salary;    //applying datatypes according to the que
   
         private String specialization;
   
         private String academicQualifications;   //applying datatypes according to the que
   
         private int performanceIndex;    //applying datatypes according to the que
   
         private boolean isCertified;   //applying datatypes according to the que
   
          /*aboves are all instance variable which have private
          as an access specifier*/
    
          public Tutor(int teacherID,String teacherName, String address, int workingHours,
   
          String workingType,String employmentStatus, String specialization,
   
          double salary, int performanceIndex, String academicQualifications)  //making constructor accept 10 parameters according to the que
     
         {
              super (teacherID,teacherName,address,employmentStatus, workingType);
              
              setWorkingHours(workingHours);
         
              this.salary=salary;
          
              this.specialization=specialization;
          
              this.academicQualifications=academicQualifications;
          
              this.isCertified=false;  //according to que it is set to false  
          
              this.performanceIndex=performanceIndex;
          
            /*above is "This keyword" which is assigning varibable with parameter values, it is used inside the constructor 
            to call another overloaded constructor in the same class which is "Teacher" in our case*/ 
    
         }
      
      //each attributes has a corresponding accessor method i.e a getter method according to que so below we applied getter method
       
              public double getSalary()
          {
       
              return this.salary;
    
          }
  
  
           public String getSpecialization()
      
            {
       
              return this.specialization;
    
           }
   
   
           public boolean getIsCertified()
  
           {
      
               return this.isCertified;
    
           }
  
            public String getAcademicQualifications()
  
           {
              return this.academicQualifications;
    
            }
  
  
              public int getPerformanceIndex()
   
            {
              return this.performanceIndex;
    
             //getter method is used to view/access and return the value of data/attributes
      
            }

            //above is the method to set salary
            public void setSalary(double newsalary,int newPerformanceIndex)
  
            {
                //below we used nested if condition because we use nested if condition when execution of one condition depends upon other condition
             if(!isCertified)
           
             {
                   double appraisalPercentage;
   
             if(newPerformanceIndex >= 5 && getWorkingHours()>20)
              
     
              {
                  if (newPerformanceIndex <=7)
         
             {
                 appraisalPercentage=5;
          
               }
               
              else if(newPerformanceIndex >=8 && newPerformanceIndex <=9)
         
             {
              
               appraisalPercentage=10;  
           
             }
             
             else
          
              {
           
               appraisalPercentage=20;
           
             }
         
                this.salary += appraisalPercentage;
                double appraisal = (appraisalPercentage/100) * newsalary;
                this.isCertified=true;
                System.out.println("Salary" + this.getSalary());
                System.out.println("The Tutor doesn't meet the qualification so, the Salary can't be approved ");
         
              }
         

              else
          
               {
                  System.out.println("Salary can't be approved because the Teacher is Already Certified");
                 
          
               }
         
         
          } 
        }
   
       
       
         //below is a method which will remove the tutor (only if the tutor has not been certified yet)
     
            public void removeTutor()
     
            {
               if( !isCertified )
        
              {
                 this.salary=0;
            
                 this.specialization="";
            
                 this.academicQualifications="";
            
                 this.performanceIndex=0;
            
                 this.isCertified=false;
              }
        
        
               else
           
              {
                     System.out.println("Tutor is certified, Removal cannot be taken place");
              }
           }
        
             //display method to display the output 
      
            public void display()
     
           {
             if( !isCertified )
         
                {
                   
              
         
                super.display();
         
                System.out.println("Salary is = "+this.salary);
             
                System.out.println("Specialization is = "+this.specialization);
             
                System.out.println("Academic qualification is = "+this.academicQualifications);
             
                System.out.println("Performance index is = "+this.performanceIndex);
            }
         
          }
     
     }