package com.example.application2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(
    val title: String,
    val author: String,
    val genre: String,
    val year: Int,
    val image: Int,
    val shortsummary: String,

):Parcelable

fun createBooks(): List<Book>{
    return listOf(
        Book("The Godfather", "Mario Puzo", "Crime novel", 1969, R.drawable.godfathercover, "It details the story of a fictitious Sicilian Mafia family based" +
                " in New York City and headed by Don Vito Corleone, who became synonymous with the Italian Mafia. " +
                "The novel covers the years 1945 to 1955, and also provides the back story of Vito Corleone from early childhood to adulthood."),
        Book("Into The Wild", "Jon Krakauer", "Biography/True travel essay", 1996, R.drawable.wildcover, "Into the Wild tells the true story of the journey of 24-year-old " +
                "Christopher McCandless into Alaska's Denali National Park and Preserve, where he starved to death in an " +
                "abandoned bus after spending four months foraging and hunting game."),
        Book("Animal Farm", "George Orwell", "Political satire", 1945, R.drawable.animal, "Animal Farm is a beast fable, in the form of a satirical allegorical novella, by George Orwell," +
                " first published in England on 17 August 1945. " +
                "It tells the story of a group of farm animals who rebel against their human farmer, " +
                "hoping to create a society where the animals can be equal, free, and happy."),
        Book("The Sicilian", "Mario Puzo", "Thriller, crime fiction", 1984, R.drawable.sicilian, "The year is 1950. Michael Corleone is nearing the end of his exile in Sicily." +
                "The Godfather has commanded Michael to bring a young Sicilian bandit named Salvatore Guiliano " +
                "back with him to America. But Guiliano is a man entwined in a bloody web of violence and vendettas. " +
                "In Sicily, Guiliano is a modern day Robin Hood who has defied corruption—and defied the Cosa Nostra. " +
                "Now, in the land of mist-shrouded mountains and ancient ruins, Michael Corleone's fate is entwined with the dangerous legend of Salvatore Guiliano: " +
                "warrior, lover, and the ultimate Siciliano."),
        Book("1984", "George Orwell", "Dystopian fiction", 1949, R.drawable.book1984, "1984 is a dystopian novella by George Orwell published in 1949, which follows the life of Winston Smith," +
                " a low ranking member of the Party, who is frustrated by the omnipresent eyes of the party, " +
                "and its ominous ruler Big Brother. Big Brother controls every aspect of people's lives."),
        Book("Fools Die", "Mario Puzo", "Crime novel", 1978, R.drawable.fools, "Played out in the underground worlds of high-stakes gambling, publishing, " +
                "and the film industry, this epic thriller follows two brothers, Merlyn and Arite, " +
                "as they delve into the dangerous underbelly of American life. From Las Vegas to New York to Hollywood, there is one thing that remains constant: " +
                "organized crime and the law are simply two sides of the same coin...")
    )
}