public class ExportRequest {
    public final String title;
    public final String body;

    public ExportRequest(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public ExportRequest(ExportRequest rb )
    {
        title= rb.title ;
        body= rb.body ;
    }
}
