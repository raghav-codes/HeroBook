package com.visitors.HeroBook.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VisitedHeroesDto {
    long visitorId;
    String visitorName;
    List<String> listOfHero;
}
