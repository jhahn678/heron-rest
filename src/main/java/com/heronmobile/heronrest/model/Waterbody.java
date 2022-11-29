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
@Table(name = "waterbodies")
public class Waterbody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "classification", nullable = false, length = Integer.MAX_VALUE)
    private String classification;

    @Column(name = "country", length = Integer.MAX_VALUE)
    private String country;

    @Column(name = "ccode", length = Integer.MAX_VALUE)
    private String ccode;

    @Column(name = "subregion", length = Integer.MAX_VALUE)
    private String subregion;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "oid", length = Integer.MAX_VALUE)
    private String oid;

    @Column(name = "admin_one", columnDefinition = "varchar[] not null", nullable = false)
    private List<String> adminOne;

    @Column(name = "admin_two", columnDefinition = "varchar[] not null", nullable = false)
    private List<String> adminTwo;
}