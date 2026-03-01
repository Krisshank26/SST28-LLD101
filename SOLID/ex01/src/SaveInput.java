public class SaveInput { 

    DatabaseInstance db= new DatabaseInstance() ; 

    public StudentRecord saveUserData(UserBody body ) 
    { 
        String id = IdUtil.nextStudentId(db.getDb().count()) ; 
        StudentRecord rec = new StudentRecord(id, body.name, body.email, body.phone, body.program) ; 

        db.getDb().save(rec) ; 

        return rec ; 
    } 
} 
