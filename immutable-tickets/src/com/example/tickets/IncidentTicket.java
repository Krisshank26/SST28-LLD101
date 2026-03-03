package com.example.tickets;

import java.util.ArrayList ;
import java.util.List ;

/**
 * INTENTION: A ticket should be an immutable record-like object .
 *
 * TODO (student): refactor to immutable + Builder.
 */
public class IncidentTicket {

    /* private String id;
    private String reporterEmail;
    private String title;

    private String description;
    private String priority;       LOW, MEDIUM, HIGH, CRITICAL
    private List<String> tags;     mutable leak
    private String assigneeEmail;
    private boolean customerVisible;
    private Integer slaMinutes;    optional
    private String source;         e.g. "CLI", "WEBHOOK", "EMAIL" */

    private Builder bi ;

    public static class Builder
    {
        private String id;
        private String reporterEmail;
        private String title;

        private String description;
        private String priority;       // LOW, MEDIUM, HIGH, CRITICAL
        private List<String> tags;     // mutable leak
        private String assigneeEmail;
        private boolean customerVisible;
        private Integer slaMinutes;    // optional
        private String source;         // e.g. "CLI", "WEBHOOK", "EMAIL"

        public Builder()
        {
            tags= new ArrayList<String >() ;
        }

        // Setters
        public Builder setId(String id) { this.id = id ; return this ; }
        public Builder setReporterEmail(String reporterEmail) { this.reporterEmail = reporterEmail ; return this ; }
        public Builder setTitle(String title) { this.title = title ; return this ; }
        public Builder setDescription(String description) { this.description = description ; return this ; }
        public Builder setPriority(String priority) { this.priority = priority ; return this ; }
        public Builder setTags(List<String> tags)
        {
            List<String > tagLists= new ArrayList<String >() ;
            int sz= tags.size() ;
            for(int i= 0 ; i< sz ; ++i ) {
                tagLists.add(tags.get(i));
            }
            this.tags = tagLists ;
            return this ;
        }
        public Builder setAssigneeEmail(String assigneeEmail) { this.assigneeEmail = assigneeEmail ; return this ; }
        public Builder setCustomerVisible(boolean customerVisible) { this.customerVisible = customerVisible ; return this ; }
        public Builder setSlaMinutes(Integer slaMinutes) { this.slaMinutes = slaMinutes ; return this ; }
        public Builder setSource(String source) { this.source = source ; return this ; }

        public IncidentTicket build()
        {
            Validation.requireTicketId(id ) ;
            Validation.requireEmail(reporterEmail, "reporterEmail" ) ;
            Validation.requireNonBlank(title, "title" ) ;
            Validation.requireMaxLen(title, 80, "title" ) ;
            Validation.requireOneOf(priority, "priority", "LOW", "MEDIUM", "HIGH", "CRITICAL" ) ;
            Validation.requireRange(slaMinutes, 5, 7200, "slaMinutes" ) ;
            IncidentTicket incidentTicket= new IncidentTicket(this ) ;
            return incidentTicket ;
        }
    }

    private IncidentTicket(Builder b ) {
        bi= b ;
    }

    /* public IncidentTicket(String id, String reporterEmail, String title) {
        this();
        this.id = id;
        this.reporterEmail = reporterEmail;
        this.title = title;
    } */

    /* public IncidentTicket(String id, String reporterEmail, String title, String priority) {
        this(id, reporterEmail, title);
        this.priority = priority;
    } */

    // Getters
    public String getId() { return bi.id ; }
    public String getReporterEmail() { return bi.reporterEmail ; }
    public String getTitle() { return bi.title ; }
    public String getDescription() { return bi.description ; }
    public String getPriority() { return bi.priority ; }
    public List<String> getTags()
    {
        List<String > tagList= new ArrayList<String >() ;
        int sz= bi.tags.size() ;
        for(int i= 0 ; i< sz ; ++i ) {
            tagList.add(bi.tags.get(i) ) ;
        }
        return tagList ;
    }
    public String getAssigneeEmail() { return bi.assigneeEmail ; }
    public boolean isCustomerVisible() { return bi.customerVisible ; }
    public Integer getSlaMinutes() { return bi.slaMinutes ; }
    public String getSource() { return bi.source ; }

    /* Setters (BROKEN: should not exist after refactor)
    public void setId(String id) { this.id = id; }
    public void setReporterEmail(String reporterEmail) { this.reporterEmail = reporterEmail; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setPriority(String priority) { this.priority = priority; }
    public void setTags(List<String> tags) { this.tags = tags; } // BROKEN: retains external reference
    public void setAssigneeEmail(String assigneeEmail) { this.assigneeEmail = assigneeEmail; }
    public void setCustomerVisible(boolean customerVisible) { this.customerVisible = customerVisible; }
    public void setSlaMinutes(Integer slaMinutes) { this.slaMinutes = slaMinutes; }
    public void setSource(String source) { this.source = source; } */

    @Override
    public String toString() {
        return "IncidentTicket{" +
                "id='" + bi.id + '\'' +
                ", reporterEmail='" + bi.reporterEmail + '\'' +
                ", title='" + bi.title + '\'' +
                ", description='" + bi.description + '\'' +
                ", priority='" + bi.priority + '\'' +
                ", tags=" + bi.tags +
                ", assigneeEmail='" + bi.assigneeEmail + '\'' +
                ", customerVisible=" + bi.customerVisible +
                ", slaMinutes=" + bi.slaMinutes +
                ", source='" + bi.source + '\'' +
                '}' ;
    }
}
