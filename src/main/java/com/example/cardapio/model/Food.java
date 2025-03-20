package com.example.cardapio.model;

import com.example.cardapio.dto.foodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "foods")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food(foodRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}