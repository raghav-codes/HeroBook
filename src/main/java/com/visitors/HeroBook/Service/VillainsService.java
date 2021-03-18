package com.visitors.HeroBook.Service;


import com.visitors.HeroBook.Dto.VisitedVillainDto;
import com.visitors.HeroBook.Repository.VillainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VillainsService {

    private final VillainsRepository villainsRepository;

    @Autowired
    public VillainsService(VillainsRepository villainsRepository) {
        this.villainsRepository = villainsRepository;
    }


}
