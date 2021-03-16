import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class VisitedHeroesDto {
    private long visitorId;
    private String visitorName;
    private List<String> listOfHero;

    public VisitedHeroesDto(long visitorId, String visitorName, List<String> listOfHero) {
        this.visitorId = visitorId;
        this.visitorName = visitorName;
        this.listOfHero = listOfHero;
    }
}
