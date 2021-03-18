package com.visitors.HeroBook.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Access;
import java.util.List;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitedVillainDto {

    String visitorName;
    List<String> listOfVillains;
}
