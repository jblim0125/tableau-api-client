package com.mobigen.ticketclient.api;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface tableauApi {
    @RequestLine("POST /trusted")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    String getTicket(@Param("username") String username, @Param("target_site") String siteName);
}
