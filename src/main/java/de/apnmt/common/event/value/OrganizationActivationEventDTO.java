/*
 * OrganizationActivationEventDTO.java
 *
 * (c) Copyright AUDI AG, 2021
 * All Rights reserved.
 *
 * AUDI AG
 * 85057 Ingolstadt
 * Germany
 */
package de.apnmt.common.event.value;

import java.io.Serializable;
import java.util.Objects;

public class OrganizationActivationEventDTO implements Serializable {

    private Long organizationId;

    private boolean active;

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        OrganizationActivationEventDTO that = (OrganizationActivationEventDTO) o;
        return this.active == that.active && this.organizationId.equals(that.organizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.organizationId, this.active);
    }

    @Override
    public String toString() {
        return "OrganizationActivationEventDTO{" + "organizationId=" + this.organizationId + ", active=" + this.active + '}';
    }
}
