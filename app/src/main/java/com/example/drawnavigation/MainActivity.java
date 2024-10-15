package com.example.drawnavigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;
    ImageButton threeDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // here the find the view by the thier id's
        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.btnDrawerToggle);
        navigationView = findViewById(R.id.navigationView);
        threeDot = findViewById(R.id.threeDot);


        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        threeDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You click three dot", Toast.LENGTH_SHORT).show();
            }
        });

        View headerView = navigationView.getHeaderView(0);
        ImageView userImage = headerView.findViewById(R.id.userImage);
        TextView textUserName = headerView.findViewById(R.id.textUsername);

        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, textUserName.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == R.id.navMenu){
                    Toast.makeText(MainActivity.this, "Menu Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navCart){
                    Toast.makeText(MainActivity.this, "Cart Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navFav){
                    Toast.makeText(MainActivity.this, "Favourite Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navOrders){
                    Toast.makeText(MainActivity.this, "Ongoing Orders Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navHistory){
                    Toast.makeText(MainActivity.this, "History Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navFeedback){
                    Toast.makeText(MainActivity.this, "Feedback Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navTerms){
                    Toast.makeText(MainActivity.this, "Terms and Conditions Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navContact){
                    Toast.makeText(MainActivity.this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.navShare){
                    Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.close();
                return false;
            }
        });

    }
}