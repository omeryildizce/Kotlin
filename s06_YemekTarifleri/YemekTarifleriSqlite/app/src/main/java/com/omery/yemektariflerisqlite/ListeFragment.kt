package com.omery.yemektariflerisqlite

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_liste.*


class ListeFragment : Fragment() {
    var yemekIsimListesi = ArrayList<String>()
    var yemekIdListesi = ArrayList<Int>()
    private lateinit var listeAdapter : ListeRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liste, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeAdapter = ListeRecycleAdapter(yemekIsimListesi, yemekIdListesi)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = listeAdapter
        sqlVeriAlma()
    }

    fun sqlVeriAlma() {
        try {
            activity?.let {
                val database = it.openOrCreateDatabase(
                    "Yemekler",
                    Context.MODE_PRIVATE,
                    null
                )
                val cursor = database.rawQuery("select * from yemekler", null)
                val yemekIdIndex = cursor.getColumnIndex("id")
                val yemekIsmiIndex = cursor.getColumnIndex("yemekismi")
                yemekIsimListesi.clear()
                yemekIdListesi.clear()
                while (cursor.moveToNext()) {
                    yemekIsimListesi.add(cursor.getString(yemekIsmiIndex))
                    yemekIdListesi.add(cursor.getInt(yemekIdIndex))

                }
                listeAdapter.notifyDataSetChanged()

                cursor.close()
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}