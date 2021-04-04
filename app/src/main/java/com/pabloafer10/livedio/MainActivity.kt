package com.pabloafer10.livedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setItensLista()
    }

    private fun initViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)
    }

    private fun setItensLista() {
        adapter.setItensList(
            arrayListOf(
                    MenuItemModel(
                            "conta",

                    ),
                    MenuItemModel(
                            "cartões"
                    ),
                    MenuItemModel(
                            "créditos"
                    ),
                    MenuItemModel(
                            "fazer transferência"
                    ),
                    MenuItemModel(
                            "meus comprovantes"
                    ),
                    MenuItemModel(
                            "portabilidade de salários"
                    ),
                    MenuItemModel(
                            "investimentos"
                    ),
                    MenuItemModel(
                            "recarregar celular"
                    ),
                    MenuItemModel(
                            "pagamento automático"
                    ),
                    MenuItemModel(
                            "outros"
                    )

            )
        )
    }
}