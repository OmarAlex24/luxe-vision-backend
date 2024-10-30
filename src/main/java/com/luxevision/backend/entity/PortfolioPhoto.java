package com.luxevision.backend.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PortfolioPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String image;

    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false)
    @JsonIgnore
    private Studio studio;
}