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
public class LocationFavoriteId implements Serializable {
    private static final long serialVersionUID = 5146193384748493231L;
    @Column(name = "location", nullable = false)
    private Integer location;

    @Column(name = "\"user\"", nullable = false)
    private Integer user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LocationFavoriteId entity = (LocationFavoriteId) o;
        return Objects.equals(this.location, entity.location) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, user);
    }

}