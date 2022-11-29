package com.heronmobile.heronrest.model;

import com.heronmobile.heronrest.model.identifiers.SavedWaterbodyId;
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
@Table(name = "saved_waterbodies")
public class SavedWaterbody {
    @EmbeddedId
    private SavedWaterbodyId id;

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