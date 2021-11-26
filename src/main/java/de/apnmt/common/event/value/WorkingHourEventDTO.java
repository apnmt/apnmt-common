package de.apnmt.common.event.value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class WorkingHourEventDTO implements Serializable {
    private static final long serialVersionUID = -1104357406681245134L;

    private Long id;

    private LocalDateTime startAt;

    private LocalDateTime endAt;

    private Long employeeId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkingHourEventDTO that = (WorkingHourEventDTO) o;
        return getId().equals(that.getId()) && getStartAt().equals(that.getStartAt()) && getEndAt().equals(that.getEndAt()) && getEmployeeId().equals(that.getEmployeeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStartAt(), getEndAt(), getEmployeeId());
    }

    @Override
    public String toString() {
        return "WorkingHourEventDTO{" +
                "id=" + this.id +
                ", startAt=" + this.startAt +
                ", endAt=" + this.endAt +
                ", employeeId=" + this.employeeId +
                '}';
    }
}
