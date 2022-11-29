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
public class WaterbodyFavoriteId implements Serializable {
    private static final long serialVersionUID = -8491178713356896232L;
    @Column(name = "\"user\"", nullable = false)
    private Integer user;

    @Column(name = "waterbody", nullable = false)
    private Integer waterbody;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WaterbodyFavoriteId entity = (WaterbodyFavoriteId) o;
        return Objects.equals(this.waterbody, entity.waterbody) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterbody, user);
    }

}