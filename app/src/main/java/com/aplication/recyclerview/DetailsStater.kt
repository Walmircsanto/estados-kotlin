package com.jv.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesEstadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_estado)

        val imageViewBandeira: ImageView = findViewById(R.id.imageViewBandeira)
        val textViewNome: TextView = findViewById(R.id.textViewNomeEstado)
        val textViewCapital: TextView = findViewById(R.id.textViewCapital)
        val textViewPopulacao: TextView = findViewById(R.id.textViewPopulacao)
        val textViewRegiao: TextView = findViewById(R.id.textViewRegiao)

        val nome = intent.getStringExtra("nome")
        val capital = intent.getStringExtra("capital")
        val populacao = intent.getIntExtra("populacao", 0)
        val regiao = intent.getStringExtra("regiao")
        val bandeiraResId = intent.getIntExtra("bandeiraResId", 0)

        imageViewBandeira.setImageResource(bandeiraResId)
        textViewNome.text = nome
        textViewCapital.text = "Capital: $capital"
        textViewPopulacao.text = "População: $populacao"
        textViewRegiao.text = "Região: $regiao"
    }
}