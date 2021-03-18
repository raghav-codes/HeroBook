package com.visitors.HeroBook.unitTest;

import com.visitors.HeroBook.Dto.HeroDto;
import com.visitors.HeroBook.Dto.VillainDto;
import com.visitors.HeroBook.Entity.HeroEntity;
import com.visitors.HeroBook.Entity.VillainEntity;
import com.visitors.HeroBook.Repository.HeroRepository;
import com.visitors.HeroBook.Repository.VillainsRepository;
import com.visitors.HeroBook.Service.HeroService;
import com.visitors.HeroBook.Service.VillainsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class VillainsServiceTest {


    @Mock
    VillainsRepository villainsRepository;

    @InjectMocks
    VillainsService service;



}
