package de.apnmt.common.event;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class ApnmtEvent<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private ApnmtEventType type;

    private LocalDateTime timestamp;

    private T value;

    public ApnmtEventType getType() {
        return this.type;
    }

    public void setType(ApnmtEventType type) {
        this.type = type;
    }

    public ApnmtEvent<T> type(ApnmtEventType type) {
        this.setType(type);
        return this;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public ApnmtEvent<T> timestamp(LocalDateTime timestamp) {
        this.setTimestamp(timestamp);
        return this;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ApnmtEvent<T> value(T value) {
        this.setValue(value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ApnmtEvent<?> that = (ApnmtEvent<?>) o;
        return this.getType() == that.getType() && this.getTimestamp().equals(that.getTimestamp()) && this.getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getType(), this.getTimestamp(), this.getValue());
    }

    @Override
    public String toString() {
        return "ApnmtEvent{" + "type=" + this.type + ", timestamp=" + this.timestamp + ", value=" + this.value + '}';
    }
}
