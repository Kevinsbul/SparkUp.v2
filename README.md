IMAD assignment 
SparkUp
SparkUp is a native Android application built with Kotlin designed to help people maintain and manage social connections during busy schedules. By suggesting small, meaningful "social sparks" based on the time of day, the app simplifies staying in touch with friends, family, and colleagues.

🌟 Features
Time-Based Suggestions: Enter the time of day (Morning, Afternoon, Dinner, etc.) to receive a specific social action.

Engaging UI: A modern, clean interface using CardView and Material Design principles.

Error Handling: Friendly, motivational feedback to guide user input.

Quick Reset: Easily clear your current suggestion to start over.

🛠️ Tech Stack
Language: Kotlin

IDE: Android Studio

Architecture: XML-based Layouts with View Binding logic.

CI/CD: GitHub Actions for automated building and testing.

📋 Social Spark Logic
The app provides the following predefined suggestions:

Morning: Send a "Good morning" text to a family member.

Mid-morning: Reach out to a colleague with a quick "Thank you."

Afternoon: Share a funny meme or interesting link with a friend.

Afternoon Snack Time: Send a quick "thinking of you" message.

Dinner: Call a friend or relative for a 5-minute catch-up.

Night: Leave a thoughtful comment on a friend's post.

Project Structure

├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/project/  <-- Core Kotlin Logic
│   │   │   └── res/layout/        <-- UI XML Files
├── components/                    <-- Shared UI Components
├── README.md
└── package.json

Requirement:	    File Reference:  	               Description:
Data Handling --  src/utils/dataHandler.ts	 --    Manages the parsing of menu items.
UI Layout	  --    res/layout/activity_main.xml --  Defines the grid structure of the dashboard.
User Input  --	  src/components/Form.tsx	--       Handles validation for user-submitted text.

Kevin Siaga ST10532380
Lehumo Lasehla ST10536487
Managa Mashudu ST10510345
BANELE NTSHINGILA ST10534276
BOTSHELO NONYANE ST10525914
Itumeleng MOLEPO ST10519228
