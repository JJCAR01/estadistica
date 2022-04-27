package com.juan.estadistica.infraestructura.controlador;

import com.juan.estadistica.aplicacion.dto.DtoJugador;
import com.juan.estadistica.aplicacion.dto.DtoRespuesta;
import com.juan.estadistica.aplicacion.servicio.Jugador.ServicioAplicacionEliminarJugador;
import com.juan.estadistica.aplicacion.servicio.Jugador.ServicioAplicacionGuardarJugador;
import com.juan.estadistica.aplicacion.servicio.Jugador.ServicioAplicacionListarJugador;
import com.juan.estadistica.aplicacion.servicio.Jugador.ServicioAplicacionModificarJugador;
import com.juan.estadistica.dominio.modelo.Jugador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class ControladorJugador {

    private final ServicioAplicacionGuardarJugador servicioGuardarJugador;
    private final ServicioAplicacionEliminarJugador servicioEliminarJugador;
    private final ServicioAplicacionListarJugador servicioListarJugador;
    private final ServicioAplicacionModificarJugador servicioModificarJugador;

    public ControladorJugador(ServicioAplicacionGuardarJugador servicioGuardarJugador,
                              ServicioAplicacionEliminarJugador servicioEliminarJugador,
                              ServicioAplicacionListarJugador servicioListarJugador,
                              ServicioAplicacionModificarJugador servicioModificarJugador){
        this.servicioEliminarJugador = servicioEliminarJugador;
        this.servicioGuardarJugador = servicioGuardarJugador;
        this.servicioListarJugador = servicioListarJugador;
        this.servicioModificarJugador = servicioModificarJugador;
    }

    @GetMapping
    public List<Jugador> listar() {
        return servicioListarJugador.ejecutar();
    }

    @GetMapping("/{codigo}")
    public Jugador listar(@PathVariable Long codigo ) {
        return servicioListarJugador.consultar(codigo);
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoJugador dto) {
        return this.servicioGuardarJugador.ejecutar(dto);
    }

    @PutMapping("/{codigo}")
    public DtoRespuesta<Long> modificar(@RequestBody DtoJugador jugador, @PathVariable Long codigo)
    {
        return this.servicioModificarJugador.ejecutar(jugador,codigo);
    }

    @DeleteMapping("/{codigo}")
    public DtoRespuesta<Long> eliminar(@PathVariable Long codigo)
    {
       return this.servicioEliminarJugador.ejecutar(codigo);
    }
}