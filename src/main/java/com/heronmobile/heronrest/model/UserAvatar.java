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
@Table(name = "user_avatars")
public class UserAvatar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "key", nullable = false, length = Integer.MAX_VALUE)
    private String key;

    @Column(name = "url", nullable = false, length = Integer.MAX_VALUE)
    private String url;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"user\"", nullable = false)
    private User user;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

}