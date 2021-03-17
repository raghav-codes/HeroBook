package com.visitors.HeroBook.unitTest;

import com.fasterxml.jackson.databind.ObjectMapper;
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


    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void visitorFetchAllHeros() throws Exception {


        RequestBuilder requestBuilder = get("/heroes/1234").accept(MediaType.APPLICATION_JSON);


        mockMvc.perform(requestBuilder).andExpect(status().isOk())
                .andExpect(content().json("{}"));
               // .andExpect(jsonPath("$.visitorId").value(1234))
               // .andExpect(jsonPath("$.visitorName").value("MothiLal"));
    }

}
