package com.example.rockpaperscissors

fun main()
{
    var computerChoice = "";
    var playerChoice = "";

    println("Rock, Paper or Scissors? Please enter your choice")
    playerChoice = readln();

    val randomNumber = (1..3).random();

    if(randomNumber == 1)
    {
        computerChoice = "Rock";
    }
    else if(randomNumber == 2)
    {
        computerChoice = "Paper";
    }
    else
    {
        computerChoice = "Scissors";
    }

    println("Opponent Choice: " + computerChoice);

}