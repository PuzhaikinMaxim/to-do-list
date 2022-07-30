package com.example.to_do_list.presentation

import android.widget.EditText
import androidx.databinding.BindingAdapter

@BindingAdapter("count")
fun bindCount(editText: EditText, count: Int?){
    if(count != null) {
        editText.setText(count.toString())
    }
}

@BindingAdapter("name")
fun bindName(editText: EditText, name: String?){
    if(name != null) {
        editText.setText(name)
    }
}