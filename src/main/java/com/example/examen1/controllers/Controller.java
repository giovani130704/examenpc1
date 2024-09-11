package com.example.examen1.controllers;

import com.example.examen1.models.Anuncios;
import com.example.examen1.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repository repo;

    @GetMapping
    public String index(){
        return "Conectado";
    }

    @GetMapping("Anuncios")
    public List<Anuncios> getAnuncios() {
        return repo.findAll();
    }
    @PostMapping("grabar")
    public String post(@RequestBody Anuncios anuncios) {
        repo.save(anuncios);
        return "Gradado";
    }
    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id,@RequestBody Anuncios anuncios ){
        Anuncios an = repo.findById(id).get();
        an.setTitulo(anuncios.getTitulo());
        an.setDescripcion(anuncios.getDescripcion());
        an.setFecha_publicacion(anuncios.getFecha_publicacion());
        an.setFecha_expiracion(anuncios.getFecha_expiracion());
        an.setAutor(anuncios.getAutor());
        an.setEstado(anuncios.getEstado());
        an.setImagen(anuncios.getImagen());
        an.setEnlace(anuncios.getEnlace());
        an.setComentario(anuncios.getComentario());
        an.setTipo(anuncios.getTipo());
        an.setPrioridad(anuncios.getPrioridad());
        an.setUbicacion(anuncios.getUbicacion());
        an.setFecha_creacion(anuncios.getFecha_creacion());
        repo.save(an);
        return "Actualizado";
    }

    public String delete(@PathVariable Long id) {
        Anuncios an = repo.findById(id).get();
        repo.delete(an);
        return "Eliminado";
    }


}
