package com.visitors.HeroBook.Controller;

import com.visitors.HeroBook.Service.VisitorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class VisitorController {

    VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @GetMapping("/heroes/{visitorId}")
    public ResponseEntity<?> getVisitorHeroes(@PathVariable Long visitorId){
        return new ResponseEntity<>(
                this.visitorService.fetchAllHero(visitorId),
                HttpStatus.OK);
    }
}
