package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;



    public void avecMockito() throws Exception{
        StatistiqueImpl uneStats = Mockito.mock(StatistiqueImpl.class);
        doThrow(Exception.class).when(uneStats).prixMoyen();
    }

}
