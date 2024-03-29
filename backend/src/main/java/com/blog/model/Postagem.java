package com.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "postagens")
public class Postagem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NotBlank
  @Size(min = 3, max = 255)
  private String titulo;
  private String texto;

  @UpdateTimestamp
  private LocalDateTime data;

  @ManyToOne
  @JsonIgnoreProperties("postagem")
  private Tema tema;

  @ManyToOne
  @JsonIgnoreProperties("postagem")
  private Usuario usuario;

  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getTexto() {
    return texto;
  }
  public void setTexto(String texto) {
    this.texto = texto;
  }
  public LocalDateTime getData() {
    return data;
  }
  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public Tema getTema() {
    return tema;
  }

  public void setTema(Tema tema) {
    this.tema = tema;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
