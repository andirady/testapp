package com.kendra.testapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.kendra.pgw.common.eventNotifier.share.EventSubscription;
import com.kendra.testapp.share.MyApi;
import com.kendra.testapp.share.MyApiAsync;

public class Main implements EntryPoint {

    @Override
    public void onModuleLoad() {
        MyApiAsync rpc = GWT.create(MyApi.class);
        rpc.getEventSubscription(new AsyncCallback<EventSubscription>() {
            public void onSuccess(EventSubscription es) {
                FlowPanel panel = new FlowPanel();
                Label eventTypeLabel = new Label(es.eventType);
                Label userTypeLabel = new Label(es.userType);
                Label nameLabel = new Label(es.name);

                panel.add(eventTypeLabel);
                panel.add(userTypeLabel);
                panel.add(nameLabel);
                RootPanel.get().add(panel);
            }

            public void onFailure(Throwable caught) {
                RootPanel.get().add(new HTML(caught.getMessage()));
            }
        });
    }
}
