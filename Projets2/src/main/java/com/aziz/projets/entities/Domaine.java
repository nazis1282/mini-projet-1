package com.aziz.projets.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Domaine {




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idDom;
	public String nomDom;
	
	
	@OneToMany(mappedBy = "domaine")
	@JsonIgnore
	private List<Projet> projets;
	
	
	public Long getIdDom() {
		return idDom;
	}

	public void setIdDom(Long idDom) {
		this.idDom = idDom;
	}

	public String getNomDom() {
		return nomDom;
	}

	public void setNomDom(String nomDom) {
		this.nomDom = nomDom;
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	
	
}
