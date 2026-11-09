package correspondances.controller;

import com.correspondances.controller.StationController;
import com.correspondances.service.StationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StationController.class)
class StationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private StationService stationService;

    @Test
    void shouldReturnOkWhenFetchingStations() throws Exception {
        given(stationService.getAllStations()).willReturn(Collections.emptyList());

        mockMvc.perform(get("/api/stations"))
                .andExpect(status().isOk());
    }
}