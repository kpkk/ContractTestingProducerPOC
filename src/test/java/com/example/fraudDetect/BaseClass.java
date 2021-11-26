package com.example.fraudDetect;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseClass {

    @BeforeEach
    public void test(){
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }

}
