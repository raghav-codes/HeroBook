package com.visitors.HeroBook.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class HeroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String image;
    private String realName;
    private int height;
    private int weight;
    private String specialPower;
    private String intelligence;
    private String strength;
    private String power;
    private String speed;
    private String agility;
    private String description;
    private String story;

    public HeroEntity(String name) {
        this.name = name;
    }
}
