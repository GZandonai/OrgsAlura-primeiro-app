package br.com.alura.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.orgs.R

class FormProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_produto)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()
            Log.i("FormProdutoActivity", "onCreate: $nome")
        }
    }
}