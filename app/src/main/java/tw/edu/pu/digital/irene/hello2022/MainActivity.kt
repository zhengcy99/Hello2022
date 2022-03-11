package tw.edu.pu.digital.irene.hello2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello i'am irene "
        TestDEV()
    }
    fun TestDEV(){var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev分支1"
    }
}

        TestMaster()
    }
    fun TestMaster(){var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支"}}

    }
}