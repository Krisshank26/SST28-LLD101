package com.example.tickets;

import java.util.ArrayList;
import java.util.List;

/**
 * Service layer that creates tickets.
 *
 * TODO (student):
 * - After introducing immutable IncidentTicket + Builder, refactor this to stop mutating.
 */
public class TicketService {

    public IncidentTicket createTicket(String id, String reporterEmail, String title) {
        /* scattered validation (incomplete on purpose)
        if (id == null || id.trim().isEmpty()) throw new IllegalArgumentException("id required");
        if (reporterEmail == null || !reporterEmail.contains("@")) throw new IllegalArgumentException("email invalid");
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("title required" ) ; */

        /* IncidentTicket t = new IncidentTicket(id, reporterEmail, title ) ; */

        IncidentTicket t= new IncidentTicket.Builder().setId(id ).setReporterEmail(reporterEmail ).setTitle(title ).build() ;

        // It will give Error after refactoring Design With Immutable+ Builder Design Here.
        /* BAD: mutating after creation
        t.setPriority("MEDIUM");
        t.setSource("CLI");
        t.setCustomerVisible(false);

        List<String> tags = new ArrayList<>() ;
        tags.add("NEW") ;
        t.setTags(tags) ; */

        return t;
    }

    public IncidentTicket escalateToCritical(IncidentTicket t) {
        /* BAD: mutating ticket after it has been "created"
        t.setPriority("CRITICAL");
        t.getTags().add("ESCALATED"); list leak */
        List<String > tags= new ArrayList<String >() ;
        tags.add("ESCALATED" ) ;
        IncidentTicket te= new IncidentTicket.Builder().setId(t.getId() ).setTitle(t.getTitle() ).setReporterEmail(t.getReporterEmail() ).setPriority("CRITICAL" ).setTags(tags ).build() ;
        return te ;
    }

    public IncidentTicket assign(IncidentTicket t, String assigneeEmail) {
        /* scattered validation
        if (assigneeEmail != null && !assigneeEmail.contains("@")) {
            throw new IllegalArgumentException("assigneeEmail invalid");
        }
        t.setAssigneeEmail(assigneeEmail ) ; */
        IncidentTicket ta= new IncidentTicket.Builder().setId(t.getId() ).setTitle(t.getTitle() ).setReporterEmail(assigneeEmail ).setPriority(t.getPriority() ).setTags(t.getTags() ).build() ;
        return ta ;
    }
}
