import java.nio.charset.StandardCharsets;

public class JsonExporter implements Exporter {

    FormatValidation<ExportResult > validator ;

    public JsonExporter(FormatValidation<ExportResult > valid )
    {
        validator= valid ;
    }

    @Override
    public ExportResult export(ExportRequest req ) {
        /* if (req == null) return new ExportResult("application/json", new byte[0] ) ; */
        ExportResult res= validator.validate(req ) ;
        if(res!= null ) {
            return res ;
        }
        String json = "{\"title\":\"" + escape(req.title) + "\",\"body\":\"" + escape(req.body) + "\"}";
        return new ExportResult("application/json", json.getBytes(StandardCharsets.UTF_8 ) ) ;
    }

    private String escape(String s) {
        if (s == null) return "" ;
        return s.replace("\"", "\\\"" ) ;
    }
}
