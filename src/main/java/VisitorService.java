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
        var visitor = visitorRepository.findById(visitorId).get();
        var allHero = heroRepository.findAll();
        var heroNames = allHero.stream().map(hero -> hero.getName()).collect(Collectors.toList());
        return new VisitedHeroesDto(visitor.getId(), visitor.getName(), heroNames);
    }
}
