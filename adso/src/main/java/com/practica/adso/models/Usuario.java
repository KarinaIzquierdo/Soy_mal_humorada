package com.practica.adso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
@Id
@Column(name =  "id_usuario")
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer id_usuario;
private String nombre;
private String apellido;
private String ciudad;


}
