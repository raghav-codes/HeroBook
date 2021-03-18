package com.visitors.HeroBook.unitTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.visitors.HeroBook.Dto.HeroDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HeroControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Test
    public void getHeroTest() throws Exception {
        var heroDto = new HeroDto("Rajini","", "", 175,60, "", "", "", "", "", "", "", "");

        RequestBuilder rbPost = post("/hero")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(heroDto));

        RequestBuilder rb = get("/hero/Rajini")
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(rbPost).andExpect(status().isCreated());
        mockMvc.perform(rb)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.heroName").value("Rajini"));
    }

    @Test
    public void getInvalidHeroTest() throws Exception {
        var heroDto = new HeroDto("Rajini", "", "", 175,
                60, "", "", "", "",
                "", "", "", "");

        RequestBuilder rbPost = post("/hero")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(heroDto));

        RequestBuilder rb = get("/hero/Kamal")
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(rbPost).andExpect(status().isCreated());
        mockMvc.perform(rb)
                .andExpect(status().isNoContent())
                .andExpect(content().string("The given hero is not found"));
    }
}
