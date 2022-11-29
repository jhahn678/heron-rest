package com.heronmobile.heronrest.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "waterbody_media")
public class WaterbodyMedia {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"user\"", nullable = false)
    private User user;

    @Column(name = "key", nullable = false, length = Integer.MAX_VALUE)
    private String key;

    @Column(name = "url", nullable = false, length = Integer.MAX_VALUE)
    private String url;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "waterbody", nullable = false)
    private Waterbody waterbody;

}