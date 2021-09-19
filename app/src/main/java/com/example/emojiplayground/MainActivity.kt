package com.example.emojiplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.vanniktech.emoji.*
import com.vanniktech.emoji.google.GoogleEmojiProvider
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rootView = findViewById<ConstraintLayout>(R.id.rootView)
        val emojiEditText = findViewById<EmojiEditText>(R.id.etEmoji)
        val emojiPopup = EmojiPopup.Builder.fromRootView(rootView).build(emojiEditText);

        emojiEditText.filters = arrayOf(OnlyEmojisInputFilter(), MaximalNumberOfEmojisInputFilter(5), OnlyEmojisInputFilter())

        emojiEditText.clearFocus();

        emojiEditText.disableKeyboardInput(emojiPopup);
        emojiEditText.setOnClickListener{

                emojiPopup.toggle()
        }
        val btnSend = findViewById<Button>(R.id.btnSend)

    }
}