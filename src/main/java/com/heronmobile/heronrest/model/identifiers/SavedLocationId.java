package com.heronmobile.heronrest.model.identifiers;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class SavedLocationId implements Serializable {
    private static final long serialVersionUID = 8847525496644954248L;
    @Column(name = "location", nullable = false)
    private Integer location;

    @Column(name = "\"user\"", nullable = false)
    private Integer user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SavedLocationId entity = (SavedLocationId) o;
        return Objects.equals(this.location, entity.location) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, user);
    }

}