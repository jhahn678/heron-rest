package com.heronmobile.heronrest.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "geometries")
public class Geometry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "osm_id")
    private Long osmId;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "ccode", length = Integer.MAX_VALUE)
    private String ccode;

    @Column(name = "country", length = Integer.MAX_VALUE)
    private String country;

    @Column(name = "admin_one", columnDefinition = "varchar[]")
    private List<String> adminOne;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waterbody")
    private Waterbody waterbody;

/*
    TODO [JPA Buddy] create field to map the 'geom' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "geom", columnDefinition = "geometry")
    private Object geom;
*/
}