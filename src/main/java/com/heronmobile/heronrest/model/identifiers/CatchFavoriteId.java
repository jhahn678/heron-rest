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
public class CatchFavoriteId implements Serializable {
    private static final long serialVersionUID = 8292345435550874486L;
    @Column(name = "catch", nullable = false)
    private Integer catchField;

    @Column(name = "\"user\"", nullable = false)
    private Integer user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CatchFavoriteId entity = (CatchFavoriteId) o;
        return Objects.equals(this.catchField, entity.catchField) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catchField, user);
    }

}