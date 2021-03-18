package com.visitors.HeroBook.Controller;

import com.visitors.HeroBook.Dto.HeroDto;
import com.visitors.HeroBook.Service.HeroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeroController {
    HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping("/hero")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHero(@RequestBody HeroDto heroDto) {
        this.heroService.addHero(heroDto);
    }

    @GetMapping("/hero/{name}")
    public ResponseEntity<?> getHeroByName(@PathVariable String name) {
       var heroDto= this.heroService.getHeroByName(name);
       if(heroDto == null) {
           return new ResponseEntity<>("The given hero is not found", HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity<>(heroDto, HttpStatus.OK);
    }
}
