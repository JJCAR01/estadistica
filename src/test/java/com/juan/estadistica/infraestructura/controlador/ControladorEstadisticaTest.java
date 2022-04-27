package com.juan.estadistica.infraestructura.controlador;

import com.juan.estadistica.aplicacion.dto.DtoEquipo;
import com.juan.estadistica.aplicacion.dto.DtoJugador;
import com.juan.estadistica.infraestructura.ApplicationMock;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = ApplicationMock.class)
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ControladorEstadisticaTest {

    private Date fecha;
    private int jornada;

    private DtoEquipo equipo;

    public ControladorEstadisticaTest() {
        this.fecha = fecha;
        this.jornada = jornada;
        /*
        this.equipo = new DtoEquipo("111","Med","sub12");

         */
    }
}
