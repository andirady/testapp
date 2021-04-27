package com.kendra.testapp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.kendra.pgw.common.eventNotifier.share.EventSubscription;
import com.kendra.testapp.share.MyApi;

public class MyApiImpl extends RemoteServiceServlet implements MyApi {

    @Override
    public EventSubscription getEventSubscription() {
        var es = new EventSubscription();
        es.eventType = "Test";
        es.userType = "Admin";
        es.name = "Hello";
        return es;
    }
}
