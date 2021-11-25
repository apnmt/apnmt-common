package de.apnmt.common.controller;

import de.apnmt.common.event.ApnmtEvent;

public interface ApnmtEventController<T> {

    void receiveEvent(ApnmtEvent<T> event);

}
