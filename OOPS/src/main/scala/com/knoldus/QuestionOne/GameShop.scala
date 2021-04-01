// Author - Tanishka Garg

package com.knoldus.QuestionOne
object GameShop extends App {

  //object creation of ConsoleLibrary class
  val consoles = new ConsoleLibrary()

  //List of Games defined
  val games = List(
    new Game("GTA V", "Rockstar North", List(consoles.Xbox2)),
    new Game("Fifa 21", "Electronic Arts", List(consoles.PS4, consoles.PS5)),
    new Game("Among Us", "InnerSloth LLC", List(consoles.NintendoSwitch)),
    new Game("Counter-Strike", "Valve Corporation", List(consoles.Xbox2))
  )

  //returns console and list of games
  val consoleToGames: Map[Console, List[Game]] = {
    val consoleToGames1: List[(Console, Game)] = games flatMap (g => g.consoles.map(c => c -> g))
    val consoleToGames2: Map[Console, List[(Console, Game)]] = consoleToGames1 groupBy (_._1)
    val consoleToGames3: Map[Console, List[Game]] = consoleToGames2 mapValues(_ map (_._2))
    consoleToGames3
  }

  //method to sort games according to maker and then by game name
  def sortGames(): Unit = {
    games sortBy (g => s"${g.maker}_${g.name}") foreach { game =>
      val consoleInfo = game.consoles.map(c => s"${c.make} ${c.model}").mkString(", ")
      print(s"${game.name} by ${game.maker} for $consoleInfo \n")
    }
  }

  print("\n STRING METHOD OF GAME :\n" + games)

  print("\n\nChecking if GTA V is supported by Xbox2: ")
  val gta5 = new Game("GTA V", "Rockstar North", List(consoles.Xbox2))
  print(gta5.isSupported(consoles.Xbox2))
  print("\nChecking if GTA V is supported by Nintendo Switch: ")
  print(gta5.isSupported(consoles.NintendoSwitch))

  print("\n\n Sorted List of Games according to maker and then by game name:  \n\n")
  sortGames()

  print("\n Games Supported by each Console: \n")
  for ((key,value) <- consoleToGames) printf("Console: %s games supported: %s\n\n", key, value)

}

