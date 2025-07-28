package com.mah.pretty.toaster

import android.content.Context
import android.widget.Toast

object PrettyToaster {
    fun showPrettyToast(context: Context , message : String){
        Toast.makeText(context , message , Toast.LENGTH_LONG).show()
    }
}