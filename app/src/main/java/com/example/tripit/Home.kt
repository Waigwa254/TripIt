package com.example.tripit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
lateinit var imagemaasai:ImageView
lateinit var pngambbosli:ImageView
lateinit var pngtsavo:ImageView
lateinit var pngnjaro:ImageView
lateinit var pngvalley:ImageView
lateinit var pngmkenya:ImageView
lateinit var food:ImageView
lateinit var clothes:ImageView
lateinit var language:ImageView
lateinit var map:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imagemaasai=findViewById(R.id.img_maasai)
        pngambbosli=findViewById(R.id.png_amboseli)
        pngtsavo=findViewById(R.id.png_tsavo)
        pngnjaro=findViewById(R.id.png_njaro)
        pngvalley=findViewById(R.id.png_valley)
        pngmkenya=findViewById(R.id.png_mkenya)
        food=findViewById(R.id.foodcu)
        clothes=findViewById(R.id.clothes)
        language=findViewById(R.id.language)
        map=findViewById(R.id.btn_map)



        imagemaasai.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
        pngambbosli.setOnClickListener {
            val intent=Intent(this,wweb::class.java)
            startActivity(intent)
        }

        pngtsavo.setOnClickListener {
            val intent=Intent(this,webb::class.java)
            startActivity(intent)
        }
        pngnjaro.setOnClickListener {
            val intent=Intent(this,weeb::class.java)
            startActivity(intent)
        }
        pngvalley.setOnClickListener {
            val intent=Intent(this,weba::class.java)
            startActivity(intent)
        }
        pngmkenya.setOnClickListener {
            val intent=Intent(this,webc::class.java)
            startActivity(intent)
        }
        food.setOnClickListener {
            val intent=Intent(this,webd::class.java)
            startActivity(intent)
        }
        clothes.setOnClickListener {
            val intent=Intent(this,webd::class.java)
            startActivity(intent)
        }
        language.setOnClickListener {
            val intent=Intent(this,webf::class.java)
            startActivity(intent)
        }
        map.setOnClickListener {
            val intent=Intent(this,mapweb::class.java)
            startActivity(intent)
        }
    }
}