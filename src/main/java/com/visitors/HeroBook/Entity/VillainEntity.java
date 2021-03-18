package com.visitors.HeroBook.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class VillainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String villainName;
}
