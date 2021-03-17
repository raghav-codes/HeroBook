package com.visitors.HeroBook.Service;

import com.visitors.HeroBook.Dto.VisitedHeroesDto;
import com.visitors.HeroBook.Repository.HeroRepository;
import com.visitors.HeroBook.Repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class VisitorService {
    private final VisitorRepository visitorRepository;
    private final HeroRepository heroRepository;

    @Autowired
    public VisitorService(VisitorRepository visitorRepository, HeroRepository heroRepository) {
        this.visitorRepository = visitorRepository;
        this.heroRepository = heroRepository;
    }

    public VisitedHeroesDto fetchAllHero(long visitorId) {
        var visitor = visitorRepository.findById(visitorId);
        if (visitor.isPresent()) {
            var allHero = heroRepository.findAll();
            var heroNames = allHero.stream().map(hero -> hero.getName()).collect(Collectors.toList());
            return new VisitedHeroesDto(visitor.get().getId(), visitor.get().getName(), heroNames);
        }
        else {
            return new VisitedHeroesDto();
        }
    }
}
