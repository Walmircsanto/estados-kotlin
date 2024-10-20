package com.jv.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val estados = listOf(
            Estado("São Paulo", "São Paulo", 45919049, "Sudeste", R.drawable.sp),
            Estado("Rio de Janeiro", "Rio de Janeiro", 17366189, "Sudeste", R.drawable.rj),
            Estado("Minas Gerais", "Belo Horizonte", 21411923, "Sudeste", R.drawable.mg),
            Estado("Espírito Santo", "Vitória", 4064052, "Sudeste", R.drawable.es),

            Estado("Paraná", "Curitiba", 11516840, "Sul", R.drawable.pr),
            Estado("Santa Catarina", "Florianópolis", 7554367, "Sul", R.drawable.sc),
            Estado("Rio Grande do Sul", "Porto Alegre", 11422973, "Sul", R.drawable.rs),

            Estado("Distrito Federal", "Brasília", 3094325, "Centro-Oeste", R.drawable.df),
            Estado("Goiás", "Goiânia", 7206589, "Centro-Oeste", R.drawable.go),
            Estado("Mato Grosso", "Cuiabá", 3646243, "Centro-Oeste", R.drawable.mt),
            Estado("Mato Grosso do Sul", "Campo Grande", 2839188, "Centro-Oeste", R.drawable.ms),

            Estado("Acre", "Rio Branco", 906876, "Norte", R.drawable.ac),
            Estado("Amapá", "Macapá", 877613, "Norte", R.drawable.ap),
            Estado("Amazonas", "Manaus", 4269995, "Norte", R.drawable.am),
            Estado("Pará", "Belém", 8805049, "Norte", R.drawable.pa),
            Estado("Rondônia", "Porto Velho", 1805875, "Norte", R.drawable.ro),
            Estado("Roraima", "Boa Vista", 652713, "Norte", R.drawable.rr),
            Estado("Tocantins", "Palmas", 1607363, "Norte", R.drawable.to),

            Estado("Alagoas", "Maceió", 3351543, "Nordeste", R.drawable.al),
            Estado("Bahia", "Salvador", 14930634, "Nordeste", R.drawable.ba),
            Estado("Ceará", "Fortaleza", 9240580, "Nordeste", R.drawable.ce),
            Estado("Maranhão", "São Luís", 7302660, "Nordeste", R.drawable.ma),
            Estado("Paraíba", "João Pessoa", 4059905, "Nordeste", R.drawable.pb),
            Estado("Pernambuco", "Recife", 9616621, "Nordeste", R.drawable.pe),
            Estado("Piauí", "Teresina", 3281480, "Nordeste", R.drawable.pi),
            Estado("Rio Grande do Norte", "Natal", 3560903, "Nordeste", R.drawable.rn),
            Estado("Sergipe", "Aracaju", 2318822, "Nordeste", R.drawable.se)
        )


        val adapter = EstadoAdapter(estados) { estado ->
            val intent = Intent(this, DetalhesEstadoActivity::class.java)
            intent.putExtra("nome", estado.nome)
            intent.putExtra("capital", estado.capital)
            intent.putExtra("populacao", estado.populacao)
            intent.putExtra("regiao", estado.regiao)
            intent.putExtra("bandeiraResId", estado.bandeiraResId)
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
