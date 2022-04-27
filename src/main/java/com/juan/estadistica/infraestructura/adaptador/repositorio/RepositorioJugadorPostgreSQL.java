package com.juan.estadistica.infraestructura.adaptador.repositorio;

import com.juan.estadistica.dominio.modelo.Jugador;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import com.juan.estadistica.infraestructura.adaptador.repositorio.jpa.RepositorioJugadorJpa;
import com.juan.estadistica.infraestructura.entidad.EntidadJugador;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioJugadorPostgreSQL implements RepositorioJugador {

    private final RepositorioJugadorJpa repositorioJugadorJpa;

    public RepositorioJugadorPostgreSQL(RepositorioJugadorJpa repositorioJugadorJpa) {
        this.repositorioJugadorJpa = repositorioJugadorJpa;
    }

    @Override
    public List<Jugador> listar() {
        List<EntidadJugador> entidades = this.repositorioJugadorJpa.findAll();
        return entidades.stream().map(entidad -> Jugador.of(entidad.getNombre(),
                entidad.getApellido(), entidad.getNumeroIdentificacion(),
                entidad.getDorsal())).toList();
    }

    @Override
    public Jugador consultarPorId(Long id) {

        return this.repositorioJugadorJpa
                .findById(id)
                .map(entidad -> Jugador.of(entidad.getNombre(), entidad.getApellido(),
                        entidad.getNumeroIdentificacion(), entidad.getDorsal()))
                .orElse(null);
    }

    @Override
    public Long guardar(Jugador jugador) {

        EntidadJugador entidadJugador = new EntidadJugador(jugador.getNombre(), jugador.getApellido(),
                jugador.getNumeroIdentificacion(), jugador.getDorsal());

        return this.repositorioJugadorJpa.save(entidadJugador).getId();
    }

    @Override
    public boolean existe(Jugador jugador) {
        return this.repositorioJugadorJpa.findByNombreAndApellidoAndDorsal(
                jugador.getNombre(), jugador.getApellido(), jugador.getDorsal()) != null;
    }

    @Override
    public Long eliminar(Long id) {
        this.repositorioJugadorJpa.deleteById(id);
        return id;
    }

    @Override
    public Long modificar(Jugador jugador, Long id) {

        repositorioJugadorJpa.findById(id);
        EntidadJugador entidadJugador = new EntidadJugador();
        entidadJugador.setId(id);
        entidadJugador.setNombre(jugador.getNombre());
        entidadJugador.setApellido(jugador.getApellido());
        entidadJugador.setNumeroIdentificacion(jugador.getNumeroIdentificacion());
        entidadJugador.setDorsal(jugador.getDorsal());
        repositorioJugadorJpa.save(entidadJugador);
        return id;
    }
}
