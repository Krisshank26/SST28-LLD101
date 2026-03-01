import java.util.ArrayList ; 
import java.util.List ; 

public class ValidateInput {
    
    public void validateUserData(UserBody body ) throws RuntimeException 
    { 
        List<String > errors= new ArrayList<String >() ; 
        try 
        { 
            String name= body.name ; 
            String email= body.email ; 
            String phone= body.phone ; 
            String program= body.program ; 

            if (name.isBlank()) errors.add("name is required");
            if (email.isBlank() || !email.contains("@")) errors.add("email is invalid");
            if (phone.isBlank() || !phone.chars().allMatch(Character::isDigit)) errors.add("phone is invalid");
            if (!(program.equals("CSE") || program.equals("AI") || program.equals("SWE"))) errors.add("program is invalid") ; 
            /* System.out.println(errors+ "Here" ) ; */ 

            if (!errors.isEmpty()) { 
                /* System.out.println("ERROR: cannot register");
                for (String e : errors) System.out.println("- " + e);
                return ; */ 
                String errorCause= "" ; 
                for(String error: errors ) 
                { 
                    errorCause= (errorCause+ ("- "+ error+ "\n" ) ) ; 
                } 
                errorCause= (errorCause+ "ERROR: Cannot Register " ) ; 
                /* System.out.println(errorCause ) ; */ 
                throw (new RuntimeException(errorCause ) ) ; 
            } 
        } catch (RuntimeException e ) 
        { 
            throw e ; 
        } 
    } 
} 
