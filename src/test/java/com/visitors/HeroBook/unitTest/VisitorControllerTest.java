package com.visitors.HeroBook.unitTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.IsNull;
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
public class VisitorControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void visitorFetchAllHeroes() throws Exception {
        RequestBuilder requestBuilder = get("/heroes/1234")
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(requestBuilder).andExpect(status().isOk())
                .andExpect(jsonPath("$.visitorId").value(0))
                .andExpect(jsonPath("$.visitorName").value(IsNull.nullValue()))
                .andExpect(jsonPath("$.listOfHero").value(IsNull.nullValue()));
    }


    @Test
    public void visitorFetchAllVillains() throws Exception{

        RequestBuilder requestBuilder = get("/villains/12345").contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(requestBuilder).andExpect(status().isOk());

    }


}
