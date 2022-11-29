package com.heronmobile.heronrest.model;

import com.heronmobile.heronrest.model.identifiers.UserFollowerId;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user_followers")
public class UserFollower {
    @EmbeddedId
    private UserFollowerId id;

    @MapsId("user")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"user\"", nullable = false)
    private User user;

    @MapsId("following")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "following", nullable = false)
    private User following;

}