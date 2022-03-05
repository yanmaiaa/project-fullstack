package br.com.getarrays.servidor.model;

import br.com.getarrays.servidor.enumeracao.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servidor {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true) //Pois não queremos mais de um endereço de ip, por isso será chave única
    @NotEmpty(message = "Endereço de IP não pode ser vazio ou nulo")
    private String enderecoDeIp;
    private String nome;
    private String memoria;
    private String tipo;
    private String imagemUrl;
    private Status status;
}
