package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

class ReadCommand : FileCommand {
    override fun execute(context: Context, fileName: String, vararg arguments: String) {
        val inputStream = context.openFileInput(fileName)
        val inputStreamReader = InputStreamReader(inputStream)
        val bufferedReader = BufferedReader(inputStreamReader)

        val stringBuilder = StringBuilder()
        bufferedReader.forEachLine {
            stringBuilder.append("\n").append(it)
        }

        var fileString = ""
        fileString = stringBuilder.toString()
        Log.e("ReadedFile", fileString)
    }
}