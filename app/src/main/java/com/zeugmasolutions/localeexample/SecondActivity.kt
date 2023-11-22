package com.zeugmasolutions.localeexample

import android.os.Bundle
import com.zeugmasolutions.localeexample.databinding.ActivitySecondBinding
import com.zeugmasolutions.localehelper.Locales
import java.util.*

class SecondActivity : BaseActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle(R.string.second_activity_title)

        binding.viewLanguageButtons.toTRButton.setOnClickListener { updateLocale(Locales.Turkish) }
        binding.viewLanguageButtons.toENButton.setOnClickListener { updateLocale(Locale.ENGLISH) }
        binding.viewLanguageButtons.toCNButton.setOnClickListener { updateLocale(Locale.CHINA) }
        binding.viewLanguageButtons.toURButton.setOnClickListener { updateLocale(Locales.Urdu) }

        binding.backButton.setOnClickListener { finish() }
    }
}
