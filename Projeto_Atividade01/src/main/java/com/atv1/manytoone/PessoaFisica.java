package com.atv1.manytoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name="pessoafisica")
	public class PessoaFisica {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long  id;
		private String cnpj;
		private String cpf;
		
	
	}
