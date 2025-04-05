
// Create a function that analyzes a string and returns the longest word in that string.

fun findLongestWord(input: String): String {
    val words = input.split(" ") // Split the input string into words based on spaces
    var longestWord = "" // Initialize a variable to hold the longest word
    for (word in words) {
        //  println(word) // Print each word
        if(word.length > longestWord.length) { // Check
            fun findLongestWord(input: String): String {
                val words = input.split(" ") // Split the input string into words based on spaces
                var longestWord = "" // Initialize a variable to hold the longest word
                for (word in words) {
                    //  println(word) // Print each word
                    if(word.length > longestWord.length) { // Check if the current word's length is greater than the longestWord's length
                        longestWord = word // Assign the current word to longestWord if it's longer
                    }
                }
                println("The longest word is : $longestWord") // // Print the longest word

                // Return the longest word
                return longestWord
            }

            fun main() {
                val sentence = "Kotlin is a statically typed programming language"
                findLongestWord(sentence) //  // Call the function and find the longest word
            }

            longestWord = word // Assign the value of word to LongestWord
        }
    }
    println("The longest word is : $longestWord") // // Print the longest word

    // Return the longest word
    return longestWord
}

fun main() {
    val sentence = "Kotlin is a statically typed programming language"
    findLongestWord(sentence)
}

