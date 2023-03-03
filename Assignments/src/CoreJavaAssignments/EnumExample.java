package CoreJavaAssignments;

public enum EnumExample {
	 
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	public static void main(String[] args) {
        
 
 
        /*
         * for (EnumExample e : EnumExample.values()) { System.out.println(e); }
         * 
         * System.out.println(EnumExample.valueOf("THURSDAY"));
         * System.out.println(EnumExample.valueOf("THURSDAY").ordinal());
         */
        
        EnumExample e = EnumExample.WEDNESDAY;
        
        switch(e) {
        case MONDAY:
        System.out.println("day is monday");
            break;
        case WEDNESDAY:
            System.out.println("day is wednesday");
            break;
        default:
            System.out.println("day is incorrect");
        }
        
        } 
        int id;String name;
        
        void print()
        {System.out.println("hello");}
        
        
        
        }
        

    
        
        

            
        

        
        
 

