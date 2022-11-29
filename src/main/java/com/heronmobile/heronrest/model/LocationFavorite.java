package com.heronmobile.heronrest.model;

import com.heronmobile.heronrest.model.identifiers.LocationFavoriteId;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.OffsetTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "location_favorites")
public class LocationFavorite {
    @EmbeddedId
    private LocationFavoriteId id;

    @MapsId("location")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "location", nullable = false)
    private Location location;

    @MapsId("user")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"user\"", nullable = false)
    private User user;

    @Column(name = "created_at", nullable = false)
    private OffsetTime createdAt;

}