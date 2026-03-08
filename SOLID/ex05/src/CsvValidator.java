public class CsvValidator implements FormatValidation<String > {

    public String validate(ExportRequest req )
    {
        if(req.body== null ) {
            return "";
        }
        ExportRequest rb= new ExportRequest(req ) ;
        String body= req.body.replace("\n", " " ).replace(",", " " ) ;
        return body ;
    }
}
