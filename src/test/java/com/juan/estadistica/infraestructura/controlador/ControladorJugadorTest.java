package com.juan.estadistica.infraestructura.controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juan.estadistica.aplicacion.dto.DtoJugador;
import com.juan.estadistica.aplicacion.dto.DtoRespuesta;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import com.juan.estadistica.infraestructura.ApplicationMock;
import com.juan.estadistica.infraestructura.testdatabuilder.DtoJugadorTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = ApplicationMock.class)
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ControladorJugadorTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Autowired
    RepositorioJugador repositorioJugador;

    @Test
    @DisplayName("Debe crear un jugador de forma exitosa y luego fallar al crear la misma")
    void crearDuplicadaTest() throws Exception {

        // arrange
        var dto = new DtoJugadorTestDataBuilder().build();

        crear(dto);

        // act - assert
        mocMvc.perform(MockMvcRequestBuilders.post("/api/jugadores")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto))
                )
                .andExpect(status().isConflict());
    }


    @Test
    @DisplayName("Debe crear un usuario de forma exitosa y validar que si quedó guardada")
    void crearTest() throws Exception {

        var dto = new DtoJugadorTestDataBuilder().build();

        crear(dto);
    }

    private void crear(DtoJugador dto) throws Exception {
        // arrange

        // act
        var result = mocMvc.perform(MockMvcRequestBuilders.post("/api/jugadores")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto))
                )
                .andExpect(status().isOk())
                .andReturn();

        //assert
        var jsonResult = result.getResponse().getContentAsString();
        DtoRespuesta<Integer> respuesta = objectMapper.readValue(jsonResult, DtoRespuesta.class);

        Long id = respuesta.getValor().longValue();
        Assertions.assertNotNull(id);

        var jugador = repositorioJugador.consultarPorId(id);

        Assertions.assertEquals(dto.getNombre(), jugador.getNombre());
        Assertions.assertEquals(dto.getNumeroIdentificacion(), jugador.getNumeroIdentificacion());
        Assertions.assertEquals(dto.getDorsal(), jugador.getDorsal());

    }

    @Test
    @DisplayName("Debe listar los jugadores luego de crearlas")
    void listarTest() throws Exception {

        var dto = new DtoJugadorTestDataBuilder().build();

        crear(dto);

        mocMvc.perform(get("/api/jugadores")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombre", is(dto.getNombre())))
                .andExpect(jsonPath("$[0].numeroIdentificacion", is(dto.getNumeroIdentificacion())))
                .andExpect(jsonPath("$[0].dorsal", is(dto.getDorsal())));
    }

}
