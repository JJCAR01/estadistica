package com.juan.estadistica.infraestructura.adaptador.repositorio.jpa;

import com.juan.estadistica.infraestructura.entidad.EntidadJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioJugadorJpa extends JpaRepository<EntidadJugador, Long> {

    EntidadJugador findByNombreAndApellidoAndDorsal(String nombre,String apellido, byte dorsal);

}
