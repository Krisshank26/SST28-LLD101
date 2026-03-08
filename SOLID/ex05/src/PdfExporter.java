import java.nio.charset.StandardCharsets;

public class PdfExporter implements Exporter {

    FormatValidation<Void > validator ;

    public PdfExporter(FormatValidation<Void > valid )
    {
        validator= valid ;
    }

    @Override
    public ExportResult export(ExportRequest req) throws IllegalArgumentException {
        /* if (req.body != null && req.body.length() > 20) {
            throw new IllegalArgumentException("PDF cannot handle content > 20 chars" ) ;
        } */
        try {
            validator.validate(req) ;
            String fakePdf = "PDF(" + req.title + "):" + req.body;
            return new ExportResult("application/pdf", fakePdf.getBytes(StandardCharsets.UTF_8));
        } catch (IllegalArgumentException ex ) {
            throw ex ;
        }
    }
}
