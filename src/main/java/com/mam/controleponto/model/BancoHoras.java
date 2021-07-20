package com.mam.controleponto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {


	@AllArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class  BancoHorasId implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private long idBancoHoras;
		private long idMovimentacao;
		private long idUsuario;

		public BancoHorasId() {}
	}


	@EmbeddedId
	private BancoHorasId id;
	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;
	

}









