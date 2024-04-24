package com.aziz.projets.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idProjet;
	public String nomProjet;
	public String manager;
	public double Cout;
	public Date startDate;
	@ManyToOne
	private Domaine domaine;

	
	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public Projet() {
	super();
	}
	
	public Projet( String nomProjet, String manager, double Cout, Date startDate) {
		super();
		this.nomProjet = nomProjet;
		this.manager = manager;
		this.Cout = Cout;
		this.startDate = startDate;
	}

	
		public Long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}

	public String getNomProjet() {
		return nomProjet;
	}

	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Double getCout() {
		return Cout;
	}

	public void setCout(Double Cout) {
		this.Cout = Cout;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

		@Override
		public String toString() {
			return "Projet [idProjet=" + idProjet + ", nomProjet=" + nomProjet + ", manager=" + manager + ", Cout="
					+ getCout() + ", startDate=" + startDate + "]";
		}
}
