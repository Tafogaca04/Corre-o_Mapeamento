package com.atv1.manytoone;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name="venda")
	public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;

	private Date  data;
    private int numerodavenda;
    
	@ManyToOne
	@JoinColumn(name ="pessoafisica_id")
	private PessoaFisica pessoafisica;
	
	@ManyToOne
	@JoinColumn(name ="pessoajuridica_id")
	private PessoaJuridica pessoajuridica;
	}


