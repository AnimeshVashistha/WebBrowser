package com.example.webbrowser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AutoCompleteTextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var playground_code:AutoCompleteTextView
    lateinit var run_code:Button

    override fun onCreate(savedInstanceState: Bundle?) {...}

    private fun RunCode(){...}

    }

    override fun onCreateOptionsMenu(menu: Menu?):Boolean {

        menuInflater.inflate(R.menu.main, menu)

        return true
    }
  override fun onOptionsItemSelected(item: MenuItem): Boolean {

      var DOCUMENT_CODE = "<!DOCTYPE html>\n" +
              "<html>\n" +
              "<head>\n" +
              "<title>Page Title</title>\n"+
              "</head>\n" +
              "<body>\n" +
              "\n" +
              "<h1>My First Heading</h1>\n" +
              "<p>My first paragraph.</p\n"+
              "\n" +
              "</body\n"+
              "</html>"
      when (item.itemId) {

          R.id.insert_item -> {
              playground_code.setText { DOCUMENT_CODE }
              return true
          }

          R.id.run_item -> {
              RunCode()
              return true
          }

          R.id.clear_item -> {
              playground_code.setText("")
          }

          R.id.exit_item -> {
              finish()
              return true
          }

      }

      return super.onOptionsItemSelected(item)
      }
  }