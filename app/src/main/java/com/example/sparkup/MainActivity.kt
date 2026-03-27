package com.example.sparkup

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the views by their IDs from activity_main.xml
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val btnGetSpark = findViewById<Button>(R.id.btnGetSpark)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val suggestionDisplay = findViewById<TextView>(R.id.suggestionDisplay)

        btnGetSpark.setOnClickListener {
            val input = timeInput.text.toString().trim().lowercase()

            if (input.isEmpty()) {
                suggestionDisplay.text = getString(R.string.error_empty)
                return@setOnClickListener
            }

            val suggestion = when {
                input.contains("morning") && !input.contains("mid") ->
                    "☀️ Morning: Send a 'Good morning' text to a family member."
                input.contains("mid-morning") || input.contains("mid morning") ->
                    "☕ Mid-morning: Reach out to a colleague with a quick 'Thank you.'"
                input.contains("afternoon") && !input.contains("snack") ->
                    "🔗 Afternoon: Share a funny meme or interesting link with a friend."
                input.contains("snack") ->
                    "🍎 Afternoon Snack Time: Send a quick 'thinking of you' message."
                input.contains("dinner") ->
                    "📞 Dinner: Call a friend or relative for a 5-minute catch-up."
                input.contains("night") || input.contains("after dinner") || input.contains("evening") ->
                    "🌙 Night: Leave a thoughtful comment on a friend's post."
                else -> null
            }

            if (suggestion != null) {
                suggestionDisplay.text = suggestion
                suggestionDisplay.setTextColor(ContextCompat.getColor(this, android.R.color.black))
            } else {
                suggestionDisplay.text = "That time sounds unique! Try typing 'Morning' or 'Dinner' to spark a connection."
                suggestionDisplay.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
            }
        }

        btnReset.setOnClickListener {
            timeInput.text.clear()
            suggestionDisplay.text = "Your spark will appear here..."
            suggestionDisplay.setTextColor(ContextCompat.getColor(this, android.R.color.darker_gray))
        }
    }
}