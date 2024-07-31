package com.example.rockpaperscissors

fun main()
{
    var computerChoice = "";
    var playerChoice = "";

    println("Rock, Paper or Scissors? Please enter your choice")
    playerChoice = readln();

    val randomNumber = (1..3).random();

    //kotlin version of switch
    when(randomNumber)
    {
        1 -> {
            computerChoice = "Rock";
        }
        2 -> {
            computerChoice = "Paper";
        }
        3 -> {
            computerChoice = "Scissors";
        }
    }

    println("Opponent Choice: " + computerChoice);

    //determine the winner
    val winner = when{
        playerChoice == computerChoice -> "Tie";
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player";
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player";
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player";
        else -> "Computer";
    }

    //print out who the winner was

    //using if else

    /*
    if(winner == "Tie")
    {
        println("It was a tie.");
    }
    else if(winner == "Player")
    {
        println(winner + "wins");
    }
    else
    {
        println(winner + "wins");
    }
    */

    //print out who the winner was

    //using when
    /*
    when{
        winner == "Tie" -> println("It was a tie.");
        winner == "Player" -> println(winner + "wins");
        else -> println(winner + "wins");
    }
    */
    
    //using a template to replace string concatenation
    when{
        winner == "Tie" -> println("It was a tie.");
        winner == "Player" -> println("$winner wins");
        else -> println("$winner wins");
    }
}