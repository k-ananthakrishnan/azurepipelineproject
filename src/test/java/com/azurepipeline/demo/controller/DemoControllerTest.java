package com.azurepipeline.demo.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void api1Test() throws Exception{
        this.mockMvc.perform(get("/api1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("API1 doing API things"));
    }

    @Test
    public void apiTest() throws Exception{
        this.mockMvc.perform(get("/api2")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("API2 doing API things"));
    }

    @Test
    public void api3Test() throws Exception{
        this.mockMvc.perform(get("/api3")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("API3 doing API things"));
    }

    @Test
    public void api4Test() throws Exception{
        this.mockMvc.perform(get("/api4")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("API4 doing API things"));
    }

    @Test
    public void api5Test() throws Exception{
        this.mockMvc.perform(get("/api5")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("i am a failed test"));
    }




}
