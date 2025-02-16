package app.doggy.checkworkdebug_count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkdebug_count.databinding.ActivityMainBinding

/**
 * 問題2
 * activity_main.xmlのみを修正して、アプリを起動してください。
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count: Int = 0

        binding.plusButtan.setOnClickListener {
            count += 1
            binding.countText.text = count.toString()
        }
    }
}
