package de.apnmt.common.sender;

import de.apnmt.common.event.ApnmtEvent;

public interface ApnmtEventSender<T> {

    void send(String topic, ApnmtEvent<T> event);

}
