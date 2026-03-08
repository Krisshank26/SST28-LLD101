public class JsonValidator implements FormatValidation<ExportResult > {

    public ExportResult validate(ExportRequest req )
    {
        if(req== null ) {
            ExportResult res = new ExportResult("application/json", new byte[0]);
            return res ;
        }
        return null ;
    }
}
