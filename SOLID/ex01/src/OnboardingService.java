import java.util.*;

public class OnboardingService {
    /* private final FakeDb db ; */ 

    private final ParseInput parseData= new ParseInput() ; 

    private final ValidateInput validateData= new ValidateInput() ; 

    private final SaveInput saveData= new SaveInput() ; 

    private final LogInput logData= new LogInput() ; 

    /* public OnboardingService(FakeDb db) { this.db = db; } */ 

    // Intentionally violates SRP: parses + validates + creates ID + saves + prints.
    public void registerFromRawInput(String raw) {
        
        try 
        { 
            System.out.println("INPUT: " + raw);

            /* Map<String,String> kv = new LinkedHashMap<>();
            String[] parts = raw.split(";");
            for (String p : parts) {
                String[] t = p.split("=", 2);
                if (t.length == 2) kv.put(t[0].trim(), t[1].trim());
            } 

            String name = kv.getOrDefault("name", "");
            String email = kv.getOrDefault("email", "");
            String phone = kv.getOrDefault("phone", "");
            String program = kv.getOrDefault("program", "") ; */ 

            UserBody parsedBody= parseData.parseRawString(raw ) ; 
            
            /* String name= parsedBody.name ; 
            String email= parsedBody.email ; 
            String phone= parsedBody.phone ; 
            String program= parsedBody.program ; */ 

            // validation inline, printing inline 
            /* List<String> errors = new ArrayList<>();  
            if (name.isBlank()) errors.add("name is required");
            if (email.isBlank() || !email.contains("@")) errors.add("email is invalid");
            if (phone.isBlank() || !phone.chars().allMatch(Character::isDigit)) errors.add("phone is invalid");
            if (!(program.equals("CSE") || program.equals("AI") || program.equals("SWE"))) errors.add("program is invalid");

            if (!errors.isEmpty()) {
                System.out.println("ERROR: cannot register");
                for (String e : errors) System.out.println("- " + e);
                return; 
            } */ 
            
            validateData.validateUserData(parsedBody ) ; 

            /* String id = IdUtil.nextStudentId(db.count()) ; 
            StudentRecord rec = new StudentRecord(id, name, email, phone, program);

            db.save(rec) ; */ 

            StudentRecord rec= saveData.saveUserData(parsedBody ) ; 

            logData.logUserData(rec ) ; 

            /* System.out.println("OK: created student " + id) ; 
            System.out.println("Saved. Total students: " + db.count()) ; 
            System.out.println("CONFIRMATION:") ; 
            System.out.println(rec) ; */ 
        } catch (Exception e ) 
        { 
            throw e ; 
        } 
    } 
} 