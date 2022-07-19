package com.obj54.Controller;

import org.hibernate.criterion.IdentifierEqExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.obj54.Model.Utilisateur;
import com.obj54.Model.Adresse;
import com.obj54.Model.CalculFos;
import com.obj54.Model.Contact;
import com.obj54.Model.SecteurActivite;
import com.obj54.Model.SecteurApplication;
import com.obj54.Model.SiteChantier;
import com.obj54.Model.ZoneClimatique;
import com.obj54.Model.infofos;

import com.obj54.Repository.UtilisateurRepository;
import com.obj54.Repository.AdresseRepository;
import com.obj54.Repository.CalculFosRepository;
import com.obj54.Repository.ContactRepository;
import com.obj54.Repository.SecteurActiviteRepository;
import com.obj54.Repository.SecteurApplicationRepository;
import com.obj54.Repository.SiteChantierRepository;
import com.obj54.Repository.ZoneClimatiqueRepository;
import com.obj54.Repository.InfoFosRepository;



@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
  @Autowired
  private UtilisateurRepository utilisateurRepository;
   // This means to get the bean called userRepository
  // Which is auto-generated by Spring, we will use it to handle the data
  @Autowired
  private AdresseRepository adresseRepository;
  @Autowired
  private CalculFosRepository calculFosRepository;
  @Autowired
  private ContactRepository contactRepository;
  @Autowired
  private SecteurActiviteRepository secteurActiviteRepository;
  @Autowired
  private SecteurApplicationRepository secteurApplicationRepository;
  @Autowired
  private SiteChantierRepository siteChantierRepository;
  @Autowired
  private ZoneClimatiqueRepository zoneClimatiqueRepository;
  @Autowired
  private InfoFosRepository infoFosRepository;

  @GetMapping(path="/")
	public String accueil() {
		return "accueil";
	}

  @GetMapping(path="/allUtilisateur")
  public @ResponseBody Iterable<Utilisateur> getAllUtilisateur() {
    // This returns a JSON or XML with the Employee
    return utilisateurRepository.findAll();
  }

  @GetMapping(path="/allAdress")
  public @ResponseBody Iterable<Adresse> getAllAdresse() {
    // This returns a JSON or XML with the Employee
    return adresseRepository.findAll();
  }

  @GetMapping(path="/allCalculFos")
  public @ResponseBody Iterable<CalculFos> getAllCalculFos() {
    // This returns a JSON or XML with the Employee
    return calculFosRepository.findAll();
  }

  @GetMapping(path="/allContact")
  public @ResponseBody Iterable<Contact> getAllContact() {
    // This returns a JSON or XML with the Employee
    return contactRepository.findAll();
  }

  @GetMapping(path="/allSecteurActivite")
  public @ResponseBody Iterable<SecteurActivite> getAllSecteurActivite() {
    // This returns a JSON or XML with the Employee
    return secteurActiviteRepository.findAll();
  }

  @GetMapping(path="/allSecteurApplication")
  public @ResponseBody Iterable<SecteurApplication> getAllSecteurApplication() {
    // This returns a JSON or XML with the Employee
    return secteurApplicationRepository.findAll();
  }

  @GetMapping(path="/allSiteChantier")
  public @ResponseBody Iterable<SiteChantier> getAllSiteChantier() {
    // This returns a JSON or XML with the Employee
    return siteChantierRepository.findAll();
  }

  @GetMapping(path="/allZoneClimatique")
  public @ResponseBody Iterable<ZoneClimatique> getAllZoneClimatique() {
    // This returns a JSON or XML with the Employee
    return zoneClimatiqueRepository.findAll();
  }

  @GetMapping(path="/allinfofos")
  public @ResponseBody Iterable<infofos> getAllInfoFos() {
    // This returns a JSON or XML with the Employee
    return infoFosRepository.findAll();
  }



}
