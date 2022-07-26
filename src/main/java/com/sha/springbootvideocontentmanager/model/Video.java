package com.sha.springbootvideocontentmanager.model;


import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "title", nullable = false, length = 100)
    private String title;


    @Column(name = "description", nullable = false, length = 1000)
    private String description;


    @Column(name = "licences", nullable = false, length = 100)
    private String licences;

    @Column(name = "price", nullable = false)
    private Double price;


    @CreationTimestamp
    @Column(name = "created_time", nullable = false)
    private LocalDateTime createTime;

}
