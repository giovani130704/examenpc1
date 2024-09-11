package com.example.examen1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Anuncios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;
    @Column
    @Getter
    @Setter
    private String titulo;
    @Column
    @Getter
    @Setter
    private String descripcion;
    @Column
    @Getter
    @Setter
    private String fecha_publicacion;
    @Column
    @Getter
    @Setter
    private  String fecha_expiracion;
    @Column
    @Getter
    @Setter
    private String autor;
    @Column
    @Getter
    @Setter
    private String estado;
    @Column
    @Getter
    @Setter
    private String imagen;
    @Column
    @Getter
    @Setter
    private String enlace;
    @Column
    @Getter
    @Setter
    private String comentario;
    @Column
    @Getter
    @Setter
    private String tipo;
    @Column
    @Getter
    @Setter
    private int prioridad;
    @Column
    @Getter
    @Setter
    private String ubicacion;
    @Column
    @Getter
    @Setter
    private String fecha_creacion;
}
