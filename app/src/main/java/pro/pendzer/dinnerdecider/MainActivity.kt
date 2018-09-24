package pro.pendzer.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private val foodList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFood.text = ""

        decideButton.setOnClickListener {
            if(!foodList.isEmpty()) {
                val random = Random()
                val randomFood = random.nextInt(foodList.count())
                selectedFood.text = foodList[randomFood]
            }
        }

        addButton.setOnClickListener {
            if(!dishText.text.toString().isEmpty()) {
                val newFood = dishText.text.toString()
                foodList.add(newFood)
                dishText.text.clear()
            }
        }

    }

}
