package de.apnmt.common.event.value;

import de.apnmt.common.enumeration.Day;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class OpeningHourEventDTO implements Serializable {
    private static final long serialVersionUID = -6063932319146827966L;

    private Long id;

    private Day day;

    private LocalTime startTime;

    private LocalTime endTime;

    private Long organizationId;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Day getDay() {
        return this.day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
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
        OpeningHourEventDTO that = (OpeningHourEventDTO) o;
        return getId().equals(that.getId()) && getDay() == that.getDay() && getStartTime().equals(that.getStartTime()) && getEndTime().equals(that.getEndTime()) && getOrganizationId().equals(that.getOrganizationId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDay(), getStartTime(), getEndTime(), getOrganizationId());
    }

    @Override
    public String toString() {
        return "OpeningHourEventDTO{" +
                "id=" + this.id +
                ", day=" + this.day +
                ", startTime=" + this.startTime +
                ", endTime=" + this.endTime +
                ", organizationId=" + this.organizationId +
                '}';
    }
}
