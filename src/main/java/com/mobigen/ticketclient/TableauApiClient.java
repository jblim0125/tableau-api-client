package com.mobigen.ticketclient;

import com.mobigen.ticketclient.api.tableauApi;
import feign.Feign;

public class TableauApiClient {
    private final tableauApi api;
    private final String tableauBaseUrl;

    public TableauApiClient( String tableauBaseUrl ) {
        this.tableauBaseUrl = tableauBaseUrl;
        this.api = Feign.builder()
                .target( tableauApi.class, tableauBaseUrl );
    }

    public String getTicket( String username, String siteName ) {
        return api.getTicket( username, siteName );
    }
}
