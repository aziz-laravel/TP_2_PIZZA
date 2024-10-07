package com.example.tppizza.service;

import com.example.tppizza.beans.Produit;
import com.example.tppizza.dao.IDao;


import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService(){
        produits = new ArrayList<>();
    }

    @Override
    public boolean create( Produit o){
        return produits.add(o);
    }

    @Override
    public boolean delete(Produit o){
        return produits.remove(o);
    }

    @Override
    public boolean update ( Produit o){
        return false;
    }

    @Override
    public Produit findById( int id){
        for(Produit p : produits){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll(){
        return produits;
    }
}
