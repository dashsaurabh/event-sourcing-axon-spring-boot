package com.progressivecoder.es.eventsourcingaxonspringboot.events;

import com.progressivecoder.es.eventsourcingaxonspringboot.aggregates.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
