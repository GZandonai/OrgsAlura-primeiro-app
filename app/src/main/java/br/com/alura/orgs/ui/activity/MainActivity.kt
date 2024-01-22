package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.dao.ProdutosDao
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.common.collect.ForwardingMultimap
import java.math.BigDecimal
import java.text.Normalizer.Form

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val dao = ProdutosDao()
        Log.i("MainActivity","onCreate:${dao.buscaTodos()}")

        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos() )

        val fab = findViewById<FloatingActionButton>(R.id.fabButton_add)
        fab.setOnClickListener{
            val intent = Intent(this, FormProdutoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}