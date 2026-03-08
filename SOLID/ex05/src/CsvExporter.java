import java.nio.charset.StandardCharsets;

public class CsvExporter implements Exporter {

    FormatValidation<String > validator ;

    public CsvExporter(FormatValidation<String > valid )
    {
        validator= valid ;
    }

    @Override
    public ExportResult export(ExportRequest req) {
        ExportRequest rb= new ExportRequest(req ) ;
        /* String body = req.body == null ? "" : req.body.replace("\n", " ").replace(",", " " ) ; */
        String body= validator.validate(req ) ;
        String csv = "title,body\n" + req.title + "," + body + "\n" ;
        return new ExportResult("text/csv", csv.getBytes(StandardCharsets.UTF_8));
    }
}
