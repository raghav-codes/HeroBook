package com.visitors.HeroBook.unitTest;
import com.visitors.HeroBook.Dto.VisitedHeroesDto;
import com.visitors.HeroBook.Entity.HeroEntity;
import com.visitors.HeroBook.Entity.VisitorEntity;
import com.visitors.HeroBook.Repository.HeroRepository;
import com.visitors.HeroBook.Repository.VisitorRepository;
import com.visitors.HeroBook.Service.VisitorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class VisitorServiceTest {

    @Mock
    VisitorRepository visitorRepository;
    @Mock
    HeroRepository heroRepository;

    @InjectMocks
    VisitorService subject;

    @Test
    public void fetchAllHero(){
        // Setup
        var visitorId = 12345L;
        VisitorEntity visitorEntity = new VisitorEntity(visitorId,"Mothilal");
        HeroEntity heroEntity1 = new HeroEntity("Rajini");
        HeroEntity heroEntity2 = new HeroEntity("Kamal");

        // Execution
        when(visitorRepository.findById(visitorId)).thenReturn(java.util.Optional.of(visitorEntity));
        when(heroRepository.findAll()).thenReturn(List.of(heroEntity1, heroEntity2));
        var resultSet = subject.fetchAllHero(visitorId);

        // Assertion
        assertThat(resultSet).isEqualTo(new VisitedHeroesDto(visitorId, "Mothilal", List.of("Rajini", "Kamal")));
    }
}
