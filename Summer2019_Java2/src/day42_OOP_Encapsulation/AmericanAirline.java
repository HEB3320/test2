package day42_OOP_Encapsulation;

public class AmericanAirline {


    public static void main(String[] args) {
        
        EmployeeInfo obj1 = new EmployeeInfo();
        System.out.println(obj1.getSSN());
            //  emrah.Name = "Emrah";   // private data is not visible outside the class
        obj1.setName("Emrah");
            
        //  System.out.println( obj1.Name );  //  // private data is not visible outside the class
        
            System.out.println( obj1.getName() ); // Emrah
        
            obj1.setSSN(1234546);
            System.out.println(obj1.getSSN()); 
            
            
            
        
    }

}
