package com.example.myapplication20
//Teste de unpush.
//responde a erro de unpush
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btLogin).setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener {
            startActivity(Intent(this,EsqueciSenhaActivity::class.java))
        }
        findViewById<TextView>(R.id.btCadastrar).setOnClickListener {
            startActivity(Intent(this,CadastroActivity::class.java))
        }
    }
}
