import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitorService {
    private final VisitorRepository visitorRepository;

    @Autowired
    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public List<VisitorDTO> fetchAllHero() {
        return visitorRepository.findAll().stream().map(visitorEntity ->{return new VisitorDTO(1234,"MothiLal");}).collect(Collectors.toList());
    }
}
