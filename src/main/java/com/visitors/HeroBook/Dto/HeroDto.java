package com.visitors.HeroBook.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HeroDto {
    String heroName;
    String image;
    String realName;
    int height;
    int weight;
    String specialPower;
    String intelligence;
    String strength;
    String power;
    String speed;
    String agility;
    String description;
    String story;
}
