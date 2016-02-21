package com.example.rajatgarg.adapter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List<Product> mProductList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProduct = (ListView) findViewById(R.id.listview_product);
        mProductList = new ArrayList<>();

        // add data here
        mProductList.add(new Product(1, "cop290", "design practices", "0-0-6"));
        mProductList.add(new Product(2, "cop291", "design practices", "0-0-6"));
        mProductList.add(new Product(3, "cop292", "design practices", "0-0-6"));
        mProductList.add(new Product(4, "cop293", "design practices", "0-0-6"));

        //initiate adapter
        adapter = new ProductListAdapter(getApplicationContext(), mProductList);
        lvProduct.setAdapter(adapter);

        //on item click
        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                 //action to be taken
                                                 // eg
                                                 Toast.makeText(getApplicationContext(), "Course Selected is " + view.getTag(), Toast.LENGTH_SHORT).show();
                                             }
                                         }
        );
    }
}
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

