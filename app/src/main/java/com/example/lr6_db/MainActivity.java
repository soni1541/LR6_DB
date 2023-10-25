package com.example.lr6_db;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private DBHelper helper;
    private SQLiteDatabase database;
    private Button food_btn;
    private Button clothes_btn;
    private Button toys_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview1);
        food_btn = findViewById(R.id.button_food);
        clothes_btn = findViewById(R.id.button_clothes);
        toys_btn = findViewById(R.id.button_toys);

        helper = new DBHelper(getApplicationContext());

        try {
            database = helper.getWritableDatabase();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<HashMap<String,String>> products = new ArrayList<>();
                HashMap<String,String> product;

                Cursor cursor = database.rawQuery("SELECT id, name, description, price FROM products WHERE product_category=1", null);
                cursor.moveToFirst();


                while(!cursor.isAfterLast()){
                    product = new HashMap<>();
                    product.put("name", cursor.getString(1));
                    product.put("description", cursor.getString(2));
                    product.put("price", cursor.getString(3));
                    products.add(product);
                    cursor.moveToNext();
                }
                cursor.close();

                SimpleAdapter adapter = new SimpleAdapter(
                        getApplicationContext(),
                        products,
                        android.R.layout.simple_list_item_2,
                        new String[]{"name", "description" + "price"},
                        new int[]{android.R.id.text1, android.R.id.text2});

                listView.setAdapter(adapter);
            }
        });

        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<HashMap<String,String>> products = new ArrayList<>();
                HashMap<String,String> product;

                Cursor cursor = database.rawQuery("SELECT id, name, description, price FROM products WHERE product_category=1", null);
                cursor.moveToFirst();


                while(!cursor.isAfterLast()){
                    product = new HashMap<>();
                    product.put("name", cursor.getString(1));
                    product.put("description", cursor.getString(2));
                    product.put("price", cursor.getString(3));
                    products.add(product);
                    cursor.moveToNext();
                }
                cursor.close();

                SimpleAdapter adapter = new SimpleAdapter(
                        getApplicationContext(),
                        products,
                        android.R.layout.simple_list_item_2,
                        new String[]{"name", "description" + "price"},
                        new int[]{android.R.id.text1, android.R.id.text2});

                listView.setAdapter(adapter);
            }
        });

        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<HashMap<String,String>> products = new ArrayList<>();
                HashMap<String,String> product;

                Cursor cursor = database.rawQuery("SELECT id, name, description, price FROM products WHERE product_category=1", null);
                cursor.moveToFirst();


                while(!cursor.isAfterLast()){
                    product = new HashMap<>();
                    product.put("name", cursor.getString(1));
                    product.put("description", cursor.getString(2));
                    product.put("price", cursor.getString(3));
                    products.add(product);
                    cursor.moveToNext();
                }
                cursor.close();

                SimpleAdapter adapter = new SimpleAdapter(
                        getApplicationContext(),
                        products,
                        android.R.layout.simple_list_item_2,
                        new String[]{"name", "description" + "price"},
                        new int[]{android.R.id.text1, android.R.id.text2});

                listView.setAdapter(adapter);
            }
        });

        clothes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<HashMap<String,String>> products = new ArrayList<>();
                HashMap<String,String> product;

                Cursor cursor = database.rawQuery("SELECT id, name, description, price FROM products WHERE product_category=2", null);
                cursor.moveToFirst();


                while(!cursor.isAfterLast()){
                    product = new HashMap<>();
                    product.put("name", cursor.getString(1));
                    product.put("description", cursor.getString(2));
                    product.put("price", cursor.getString(3));
                    products.add(product);
                    cursor.moveToNext();
                }
                cursor.close();

                SimpleAdapter adapter = new SimpleAdapter(
                        getApplicationContext(),
                        products,
                        android.R.layout.simple_list_item_2,
                        new String[]{"name", "description" + "price"},
                        new int[]{android.R.id.text1, android.R.id.text2});

                listView.setAdapter(adapter);
            }
        });

        toys_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<HashMap<String,String>> products = new ArrayList<>();
                HashMap<String,String> product;

                Cursor cursor = database.rawQuery("SELECT id, name, description, price FROM products WHERE product_category=3", null);
                cursor.moveToFirst();


                while(!cursor.isAfterLast()){
                    product = new HashMap<>();
                    product.put("name", cursor.getString(1));
                    product.put("description", cursor.getString(2));
                    product.put("price", cursor.getString(3));
                    products.add(product);
                    cursor.moveToNext();
                }
                cursor.close();

                SimpleAdapter adapter = new SimpleAdapter(
                        getApplicationContext(),
                        products,
                        android.R.layout.simple_list_item_2,
                        new String[]{"name", "description" + "price"},
                        new int[]{android.R.id.text1, android.R.id.text2});

                listView.setAdapter(adapter);
            }
        });
    }
}