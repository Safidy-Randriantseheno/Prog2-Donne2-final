package com.helloWorld.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Builder
@Table(name = "Students")
public class Student implements Serializable {
    @Id
    @Column(name = "idStudent", nullable = false , length = 9)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idStudent;

    @Column(name = "name" , nullable = false, length = 100)
    private String name;

    @Column(name = "active" , nullable = false)
    private Boolean active;
}
