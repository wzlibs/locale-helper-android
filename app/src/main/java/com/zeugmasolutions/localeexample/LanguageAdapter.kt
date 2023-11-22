package com.zeugmasolutions.localeexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zeugmasolutions.localeexample.util.dpToPx
import com.zeugmasolutions.localehelper.WrapLocale

class LanguageAdapter(private val wrapLocales: List<WrapLocale>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return Holder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_language, parent, false)
        )
    }

    override fun getItemCount() = wrapLocales.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Holder).bind(wrapLocales[position], position)
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val paddingSize: Int by lazy { itemView.context.dpToPx(8f).toInt() }

        fun bind(wrapLocale: WrapLocale, position: Int) {
            itemView.findViewById<ImageView>(R.id.ivFlag).setImageResource(wrapLocale.flag)
            itemView.findViewById<TextView>(R.id.tvFlagName).text = wrapLocale.getLocaleDisplayName()
            if (position % 2 == 0) {
                itemView.setPadding(0, paddingSize, paddingSize, paddingSize)
            } else {
                itemView.setPadding(paddingSize, paddingSize, 0, paddingSize)
            }
        }

    }
}