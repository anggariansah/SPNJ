package com.example.angga.spnjl2;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MenuProfile extends AppCompatActivity {

    ImageView close,profil;
    String[] judul={"Judul Ke 1","Judul Ke 2","Judul ke 3","Judul Ke 4"};
    int[] image ={R.drawable.ic_book,R.drawable.ic_mail,R.drawable.ic_music,R.drawable.ic_user};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_profile);
        close = (ImageView)findViewById(R.id.close);
        profil = (ImageView)findViewById(R.id.imageView3);
        lv = (ListView)findViewById(R.id.listview);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MenuProfile.this, UtamaTravel.class);
                startActivity(a);
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MenuProfile.this, Profile.class);
                startActivity(a);
            }
        });
    }

    class AdapterList extends ArrayAdapter{
        int[] imagearray;
        String[] titlearray;
        public AdapterList(Context context,String[] judul,int[] img) {
            super(context, R.layout.profile_list,R.id.judul,judul);
            this.imagearray = img;
            this.titlearray = judul;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.profile_list,parent,false);

            TextView judul = (TextView)row.findViewById(R.id.judul);
            ImageView image = (ImageView)row.findViewById(R.id.gmbr);

            image

            return row;
        }
    }
}
