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

    @InjectMocks
    VisitorService subject;

    @Test
    public void fetchAllHero(){
        HeroEntity heroEntity = new HeroEntity("SpiderName");
        when(visitorRepository.findAll()).thenReturn(List.of(heroEntity));
        var resultSet = subject.fetchAllHero();

        assertThat(resultSet).isEqualTo(List.of(new VisitorDTO(1234,"Mothilal")));
    }


}
