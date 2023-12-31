package com.br.healthtech.domain.entity;

import com.br.healthtech.domain.entity.enuns.AmbulanciaType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_ambulancia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ambulancia {

    @Id
    @Column(name = "id_ambulancia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_ambulancia")
    private AmbulanciaType tipoAmbulancia;

    @Column(name = "placa_ambulancia",unique = true)
    private String placaAmbulancia;

    @OneToMany(mappedBy = "ambulancia")
    private List<Paciente> pacientes;


    public Ambulancia(Ambulancia ambulancia) {
    }
}
