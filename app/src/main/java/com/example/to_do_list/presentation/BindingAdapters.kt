package com.example.to_do_list.presentation

import android.widget.EditText
import androidx.databinding.BindingAdapter
import com.example.to_do_list.R
import com.google.android.material.textfield.TextInputLayout

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

@BindingAdapter("errorInputName")
fun bindErrorInputName(textInputLayout: TextInputLayout, isError: Boolean){
    val message = if(isError) {
        textInputLayout.context.getString(R.string.error_input_name)
    } else {
        null
    }
    textInputLayout.error = message
}

@BindingAdapter("errorInputCount")
fun bindErrorInputCount(textInputLayout: TextInputLayout, isError: Boolean){
    val message = if(isError) {
        textInputLayout.context.getString(R.string.error_input_count)
    } else {
        null
    }
    textInputLayout.error = message
}