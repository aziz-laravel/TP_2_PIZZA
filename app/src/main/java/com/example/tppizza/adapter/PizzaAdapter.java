package com.example.tppizza.adapter;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tppizza.R;
import com.example.tppizza.beans.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

        private List<Produit> produits;
        private LayoutInflater inflater;


        public PizzaAdapter(List<Produit> produits, Activity activity){
            this.produits = produits;
            this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount(){
            return produits.size();
        }

        @Override
        public Object getItem(int position){
            return produits.get(position);
        }

        @Override
        public long getItemId(int position){
            return position;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null){
                convertView = inflater.inflate(R.layout.item,null);
            }

            TextView nom = convertView.findViewById(R.id.nompizza);
            TextView textpersonne = convertView.findViewById(R.id.textpersonne);
            TextView textduree = convertView.findViewById(R.id.timetext);
            ImageView photopizza = convertView.findViewById(R.id.photopizza);
            ImageView photopersonne = convertView.findViewById(R.id.personne);
            ImageView phototime = convertView.findViewById(R.id.time);
            ImageView photodetail = convertView.findViewById(R.id.detail);

            nom.setText(produits.get(position).getNom()+" ");
            textpersonne.setText(produits.get(position).getNbrIngredients()+" ");
            textduree.setText(produits.get(position).getDuree()+" ");
            photopizza.setImageResource(produits.get(position).getPhoto());
            photopersonne.setImageResource(R.drawable.hommeavecdrapeau);
            phototime.setImageResource(R.drawable.timer);
            photodetail.setImageResource(R.drawable.fleche);


            return convertView;
        }
}
