public class PdfValidator implements FormatValidation<Void > {

    public Void validate(ExportRequest req )
    {
        if(req.body!= null && req.body.length()> 20 ) {
            throw (new IllegalArgumentException("PDF cannot handle content > 20 chars"));
        }
        return null ;
    }
}
