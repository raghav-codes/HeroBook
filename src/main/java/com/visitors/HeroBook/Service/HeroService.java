package com.visitors.HeroBook.Service;

import com.visitors.HeroBook.Dto.HeroDto;
import com.visitors.HeroBook.Entity.HeroEntity;
import com.visitors.HeroBook.Repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public void addHero(HeroDto heroDto) {
        var heroEntity = new HeroEntity(heroDto.getHeroName());
        this.heroRepository.save(heroEntity);
    }

    public HeroDto getHeroByName(String name) {
        var heroEntity = this.heroRepository.findAll().stream()
                .filter(hero -> hero.getName().equals(name))
                .findAny();
        if (heroEntity.isPresent()) {
            var hero = heroEntity.get();
            return new HeroDto(hero.getName(), hero.getImage(),
                    hero.getRealName(), hero.getHeight(), hero.getWeight(),
                    hero.getSpecialPower(), hero.getIntelligence(), hero.getStrength(),
                    hero.getPower(), hero.getSpeed(), hero.getAgility(),
                    hero.getDescription(), hero.getStory());
        }
        return null;
    }
}
