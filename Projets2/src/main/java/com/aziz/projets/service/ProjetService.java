package com.aziz.projets.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aziz.projets.entities.Domaine;
import com.aziz.projets.entities.Projet;

public interface ProjetService {
	Projet saveProjet(Projet p);
	Projet updateProjet(Projet p);
	void deleteProjet(Projet p);
	void deleteProjetById(Long id);
	Projet getProjet(Long id);
	List<Projet> getAllProjets();
	List<Projet> findByNomProjet(String nom);
	List<Projet> findByNomProjetContains(String nom);
	List<Projet> findByNomCout (String nom, Double Cout);
	List<Projet> findByDomaine (Domaine domaine);
	List<Projet> findByDomaineIdDom(Long id);
	List<Projet> findByOrderByNomProjettAsc();
	List<Projet> trierProjetsNomsCout();

	Page<Projet> getAllProjetsParPage(int page, int size);

}
