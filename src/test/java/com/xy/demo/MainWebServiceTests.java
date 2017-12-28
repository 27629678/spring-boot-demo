package com.xy.demo;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class MainWebServiceTests {

    @Test
    public void testGreeting() throws Exception {
        MainWebService service = new MainWebService();
        MockMvc mock = MockMvcBuilders.standaloneSetup(service).build();
        mock.perform(MockMvcRequestBuilders.get("/greeting"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
