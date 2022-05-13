package kotlinForJavaDevs

class MasterMind {


    /**
     * na suggesties
     */
    fun evaluateGuess2(secret: String, guess: String): Evaluation {
        val rightPositions = secret.zip(guess).count { it.first == it.second }
        val commonLetters = "ABCDEF".sumOf { ch ->
            secret.count { it == ch }.coerceAtMost(guess.count { it == ch })
        }
        return Evaluation(rightPositions, commonLetters - rightPositions)
    }


    data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

    /**
     * eerste poging
     */
    fun evaluateGuess(secret: String, guess: String): Evaluation {
        var good = 0;
        var bad = 0;

        var a1 = IntArray('G'.code)
        var a2 = IntArray('G'.code)

        for ((i, c) in secret.withIndex()) {
            if (guess[i] == c) {
                good++;
            } else {
                a1[c.code]++
                a2[guess[i].code]++
            }
        }

        for (i in 'A'..'F') {
            bad += a1[i.code].coerceAtMost(a2[i.code]);
        }


        return Evaluation(good, bad)
    }

}