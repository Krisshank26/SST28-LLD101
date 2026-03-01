import java.util.* ; 
public class ParseInput {
    
    public UserBody parseRawString(String raw ) 
    { 
        Map<String,String> kv = new LinkedHashMap<>();
        String[] parts = raw.split(";");
        for (String p : parts) {
            String[] t = p.split("=", 2);
            if (t.length == 2) kv.put(t[0].trim(), t[1].trim());
        } 

        String name = kv.getOrDefault("name", "");
        String email = kv.getOrDefault("email", "");
        String phone = kv.getOrDefault("phone", "");
        String program = kv.getOrDefault("program", ""); 

        UserBody body= new StudentBody(name, email, phone, program ) ; 
        /* System.out.println(kv ) ; */ 

        return body ; 
    } 
} 
