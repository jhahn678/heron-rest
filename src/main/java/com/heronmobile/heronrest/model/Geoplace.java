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
@Table(name = "geoplaces")
public class Geoplace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "oid", length = Integer.MAX_VALUE)
    private String oid;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "fclass", nullable = false, length = Integer.MAX_VALUE)
    private String fclass;

    @Column(name = "fcode", length = Integer.MAX_VALUE)
    private String fcode;

    @Column(name = "country", nullable = false, length = Integer.MAX_VALUE)
    private String country;

    @Column(name = "ccode", nullable = false, length = Integer.MAX_VALUE)
    private String ccode;

    @Column(name = "admin_one", length = Integer.MAX_VALUE)
    private List<String> adminOne;

    @Column(name = "admin_two", length = Integer.MAX_VALUE)
    private List<String> adminTwo;

    @Column(name = "weight", nullable = false)
    private Double weight;

/*
    TODO [JPA Buddy] create field to map the 'geom' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "geom", columnDefinition = "geometry not null")
    private Object geom;
*/
}