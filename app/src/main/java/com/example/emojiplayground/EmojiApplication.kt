package com.example.emojiplayground

import android.app.Application
import com.vanniktech.emoji.EmojiManager
import com.vanniktech.emoji.MaximalNumberOfEmojisInputFilter
import com.vanniktech.emoji.OnlyEmojisInputFilter
import com.vanniktech.emoji.google.GoogleEmojiProvider

class EmojiApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        EmojiManager.install(GoogleEmojiProvider())
    }
}