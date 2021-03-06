package preciado.francisco.thecheezery_205371

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById<Button>(R.id.button_cold_drinks)
        var btnHot: Button = findViewById<Button>(R.id.button_hot_drinks)
        var btnSweets: Button = findViewById<Button>(R.id.button_sweets)
        var btnSalties: Button = findViewById<Button>(R.id.button_salties)



        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ColdDrinksActivity::class.java)
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            val intent =Intent(this, HotDrinksActivity::class.java)
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            val intent =Intent(this, SweetActivity::class.java)
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            val intent = Intent(this, SaltiesActivity::class.java)
            startActivity(intent)
        }
    }
}