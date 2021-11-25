package de.apnmt.common.event.value;

import java.util.Objects;

public class ServiceEventDTO {

    private Long id;

    private String name;

    private String description;

    private Integer duration;

    private Double cost;

    private Long organizationId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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
        ServiceEventDTO that = (ServiceEventDTO) o;
        return getId().equals(that.getId()) && getName().equals(that.getName()) && getDescription().equals(that.getDescription()) && getDuration().equals(that.getDuration()) && getCost().equals(that.getCost()) && getOrganizationId().equals(that.getOrganizationId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getDuration(), getCost(), getOrganizationId());
    }

    @Override
    public String toString() {
        return "ServiceEventDTO{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", description='" + this.description + '\'' +
                ", duration=" + this.duration +
                ", cost=" + this.cost +
                ", organizationId=" + this.organizationId +
                '}';
    }
}
