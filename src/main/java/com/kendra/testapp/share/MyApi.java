package com.kendra.testapp.share;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import com.kendra.pgw.common.eventNotifier.share.EventSubscription;

@RemoteServiceRelativePath("myapi")
public interface MyApi extends RemoteService {

    EventSubscription getEventSubscription();
}
