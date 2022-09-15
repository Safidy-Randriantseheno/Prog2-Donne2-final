package com.helloWorld.demo.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "clubGroupes")
@Builder
public class Groupes {
    @Id
    @Column(name = "Id", nullable = false,length = 12)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    @Column(name = "name", nullable = false,length = 12)
    private String name;

    @Column(name = "membres",nullable = false,length = 1000)
    private String membres;

    @Column(name = "project",nullable = false,length = 100)
    private String project;

    @Column(name = "debut",nullable = false)
    private String debut;

    @Column(name = "fin",nullable = false)
    private String fin;
}
