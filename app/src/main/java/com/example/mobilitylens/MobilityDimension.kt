package com.example.mobilitylens

data class MobilityDimension(
    val name: String,
    val description: String,
    val implication: String
)

// One entry per dimension, six total, shown one at a time
// Previous/Next buttons in MobilityLensScreen.
val mobilityDimensions = listOf(
    MobilityDimension(
        name = "Input and Interaction",
        description = "A phone has no mouse or physical keyboard by default, so people interact through taps, swipes, and sometimes voice commands.",
        implication = "Keep buttons and tap zones large enough for a fingertip, and don't build features that assume a hover state exists."
    ),
    MobilityDimension(
        name = "Screen Size, Orientation, and Density",
        description = "The same app has to look reasonable on a small phone screen, a large tablet, and both portrait and landscape orientation.",
        implication = "Build layouts that resize and reflow instead of hardcoding pixel widths or heights."
    ),
    MobilityDimension(
        name = "Lifecycle and Resource Constraints",
        description = "The operating system can pause, background, or fully kill an app whenever it needs battery or memory back.",
        implication = "Persist anything the user would be upset to lose, since the app's process isn't guaranteed to stay alive."
    ),
    MobilityDimension(
        name = "Context Awareness",
        description = "Unlike most desktops, phones typically know where they are, how they're moving, and what network they're on.",
        implication = "Consider whether the app could use location, motion, or connectivity signals to be more useful without asking the user to type it in."
    ),
    MobilityDimension(
        name = "Usage Patterns",
        description = "People pick up their phones for short bursts throughout the day rather than sitting down for one long session.",
        implication = "Make the first screen fast and useful immediately, since users may only give the app a few seconds at a time."
    ),
    MobilityDimension(
        name = "Security and Privacy Expectations",
        description = "A phone is easier to lose or have stolen than a desktop, and it usually holds more personal data.",
        implication = "Only request the permissions the app genuinely needs, and think twice before storing sensitive data unencrypted."
    )
)