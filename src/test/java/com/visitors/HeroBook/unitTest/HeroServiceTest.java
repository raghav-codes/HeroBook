package com.visitors.HeroBook.unitTest;

import com.visitors.HeroBook.Dto.HeroDto;
import com.visitors.HeroBook.Entity.HeroEntity;
import com.visitors.HeroBook.Repository.HeroRepository;
import com.visitors.HeroBook.Service.HeroService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HeroServiceTest {

    @Mock
    HeroRepository heroRepository;

    @InjectMocks
    HeroService service;

    @Test
    public void getHeroByNameTest() {
        // Setup
        HeroEntity heroEntity1 = new HeroEntity("Rajini");
        HeroEntity heroEntity2 = new HeroEntity("Kamal");
        when(heroRepository.findAll()).thenReturn(List.of(heroEntity1, heroEntity2));

        // Execution
        var resultSet = service.getHeroByName("Rajini");

        // Assertion
        assertThat(resultSet).isEqualTo(new HeroDto(heroEntity1.getName(), heroEntity1.getImage(),
                heroEntity1.getRealName(), heroEntity1.getHeight(), heroEntity1.getWeight(),
                heroEntity1.getSpecialPower(), heroEntity1.getIntelligence(), heroEntity1.getStrength(),
                heroEntity1.getPower(), heroEntity1.getSpeed(), heroEntity1.getAgility(),
                heroEntity1.getDescription(), heroEntity1.getStory()));
    }
}
