package de.apnmt.common.event.value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class ClosingTimeEventDTO implements Serializable {
    private static final long serialVersionUID = 4190513058753088973L;

    private Long id;

    private LocalDateTime startAt;

    private LocalDateTime endAt;

    private Long organizationId;

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

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClosingTimeEventDTO that = (ClosingTimeEventDTO) o;
        return getId().equals(that.getId()) && getStartAt().equals(that.getStartAt()) && getEndAt().equals(that.getEndAt()) && getOrganizationId().equals(that.getOrganizationId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStartAt(), getEndAt(), getOrganizationId());
    }

    @Override
    public String toString() {
        return "ClosingTimeEventDTO{" +
                "id=" + this.id +
                ", startAt=" + this.startAt +
                ", endAt=" + this.endAt +
                ", organizationId=" + this.organizationId +
                '}';
    }
}
