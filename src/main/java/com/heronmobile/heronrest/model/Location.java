package com.heronmobile.heronrest.model;

import com.heronmobile.heronrest.enums.Privacy;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.geo.Point;

import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"user\"", nullable = false)
    private User user;

    @Column(name = "title", length = Integer.MAX_VALUE)
    private String title;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "hexcolor", length = 7)
    private String hexcolor;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "waterbody", nullable = false)
    private Waterbody waterbody;

    @Column(name = "nearest_place", nullable = false, length = Integer.MAX_VALUE)
    private String nearestPlace;
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;

    @Column(name = "geom", columnDefinition = "geometry not null")
    private Point geom;

    @Enumerated(EnumType.STRING)
    @Column(name = "privacy", columnDefinition = "location_privacy not null")
    private Privacy privacy;
}