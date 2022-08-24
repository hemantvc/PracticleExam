package org.hariom.practicleexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.hariom.practicleexam.adapter.NumberAdapter
import org.hariom.practicleexam.viewmodel.NumberViewFactory
import org.hariom.practicleexam.viewmodel.NumberViewModel
import org.hariom.practicleexam.model.MyNumber
import org.hariom.practicleexam.viewmodel.CounterViewModel


class MainActivity : AppCompatActivity() {
    lateinit var numberViewModel: NumberViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterViewModel = ViewModelProvider(this).get(CounterViewModel::class.java)


        val numberObject = mutableListOf<MyNumber>()
        numberObject.add(MyNumber(0,1))
        numberObject.add(MyNumber(0,2))
        numberObject.add(MyNumber(0,3))
        numberObject.add(MyNumber(0,4))
        numberObject.add(MyNumber(0,5))


        var songRecycleView = findViewById<RecyclerView>(R.id.am_rvNumberLIst)
        songRecycleView.adapter = NumberAdapter(numberObject)

        songRecycleView.layoutManager = LinearLayoutManager(this)

        val repository = (application as App).numberRepository
        numberViewModel = ViewModelProvider(this, NumberViewFactory(repository)).get(NumberViewModel::class.java)

        numberViewModel.addNumber(numberObject)

        GlobalScope.launch {
           // repository.addNumbers(numberObject)
        }


        numberViewModel.numbers.observe(this, Observer {
            Log.d("Numbers", "Numbers data: "+it)
        })
    }
}