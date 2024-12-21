package com.ism.repositories.JPA;


import com.ism.core.Database.DetteRepoListInt;
import com.ism.repositories.Impl.RepositoryJpaImpl;
import com.ism.entities.Commande;

public class CommandeRepoJpa extends RepositoryJpaImpl<Commande> implements DetteRepoListInt{

  public CommandeRepoJpa() {
    super(Commande.class);
    table = "Dette";
  }

  
  
}
