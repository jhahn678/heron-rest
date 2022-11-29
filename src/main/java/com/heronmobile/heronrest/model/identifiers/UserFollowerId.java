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
public class UserFollowerId implements Serializable {
    private static final long serialVersionUID = -4386744590395267846L;
    @Column(name = "\"user\"", nullable = false)
    private Integer user;

    @Column(name = "following", nullable = false)
    private Integer following;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserFollowerId entity = (UserFollowerId) o;
        return Objects.equals(this.following, entity.following) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(following, user);
    }

}