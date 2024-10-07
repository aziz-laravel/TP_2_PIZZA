package com.example.tppizza.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detaisIngred;
    private String description;
    private String preparation;

    private static int comp;


    public Produit(){
        this.id = 0;
        this.nom = null;
        this.nbrIngredients = 0;
        this.photo = 0;
        this.duree = null;
        this.detaisIngred = null;
        this.description = null;
        this.preparation = null;
    }

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detaisIngred, String description,String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString(){
        return this.id + ", "+this.nom + ", "+this.nbrIngredients + ", "+this.photo + ", "+this.duree +", "+this.detaisIngred+", "+this.preparation+", "+this.description+".";
    }
}

