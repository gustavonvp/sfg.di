package com.sfgdi.sfgdi.controller;

import com.sfgdi.sfgdi.model.Owner;
import com.sfgdi.sfgdi.services.OwnerService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController controller;

    Set<Owner> owners;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
            owners = new HashSet<>();
            owners.add(Owner.builder().id(1L).build());
            owners.add(Owner.builder().id(1L).build());

            mockMvc = MockMvcBuilders.standaloneSetup(controller)
                    .build();
    }

    @Test
    void listOwners() throws Exception {
        when(ownerService.findALl()).thenReturn(owners);

        mockMvc.perform(get("/owners/index"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("owners/index"))
                .andExpect(model().attribute("owners", Matchers.hasSize(2)));
        ;

    }

    @Test
    void  listOwnersByIndex() throws Exception {
        when(ownerService.findALl()).thenReturn(owners);

        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners", hasSize(2)));
    }


    @Test
    void findOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("notimplemented"));

        verifyNoMoreInteractions(ownerService);

    }
}