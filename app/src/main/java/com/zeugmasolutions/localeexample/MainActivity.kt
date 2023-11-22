package com.zeugmasolutions.localeexample

import android.content.Intent
import android.os.Bundle
import com.zeugmasolutions.localeexample.databinding.ActivityMainBinding
import com.zeugmasolutions.localehelper.Locales
import java.util.Locale

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle(R.string.main_activity_title)

        binding.viewLanguageButtons.toTRButton.setOnClickListener { updateLocale(Locales.Turkish) }
        binding.viewLanguageButtons.toENButton.setOnClickListener { updateLocale(Locale.ENGLISH) }
        binding.viewLanguageButtons.toCNButton.setOnClickListener { updateLocale(Locale.CHINA) }
        binding.viewLanguageButtons.toURButton.setOnClickListener { updateLocale(Locales.Urdu) }

        binding.secondButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SecondActivity::class.java
                )
            )
        }

        binding.rvLanguage.adapter = LanguageAdapter(Locales.getWrapLocales(this))
    }

    override fun updateLocale(locale: Locale) {
        super.updateLocale(locale)
        setTitle(R.string.main_activity_title)
    }
}
