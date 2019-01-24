package com.progressivecoder.es.eventsourcingaxonspringboot.config;

import org.axonframework.common.jpa.EntityManagerProvider;
import org.axonframework.common.transaction.TransactionManager;
import org.axonframework.eventsourcing.eventstore.jpa.JpaEventStorageEngine;
import org.springframework.context.annotation.Configuration;

/*@Configuration
public class AxonAggregateConfig {

    public JpaEventStorageEngine eventStorageEngine(EntityManagerProvider entityManagerProvider,
                                                    TransactionManager transactionManager){
        return new JpaEventStorageEngine(entityManagerProvider, transactionManager);
    }

}*/
