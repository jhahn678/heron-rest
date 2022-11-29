package com.heronmobile.heronrest.model;

import com.heronmobile.heronrest.model.identifiers.WaterbodyFavoriteId;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "waterbody_favorites")
public class WaterbodyFavorite {
    @EmbeddedId
    private WaterbodyFavoriteId id;

    @MapsId("user")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"user\"", nullable = false)
    private User user;

    @MapsId("waterbody")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "waterbody", nullable = false)
    private Waterbody waterbody;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

}