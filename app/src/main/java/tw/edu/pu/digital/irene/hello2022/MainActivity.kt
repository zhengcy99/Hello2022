package tw.edu.pu.digital.irene.hello2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"
        TestMaster()
    }
    fun TestMaster(){var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支2"}}

}
}