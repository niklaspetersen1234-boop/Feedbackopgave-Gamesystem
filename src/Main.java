import java.util.ArrayList;

void main() {
    GameSystem gameSystem = new GameSystem();
    Game game = new Game();
    Player player = new Player();

    gameSystem.addGame("Farming Simulator", "Simulator", 1, 25);
    gameSystem.addGame("Apex Legends", "Battle royale", 2, 15);
    gameSystem.addGame( "CS2", "FPS", 3, 20);
    gameSystem.addGame( "Diablo IV", "ARPG", 4, 50);

    gameSystem.addPlayer( "Søren", 47, 1, 100);
    gameSystem.addPlayer( "Casper", 29, 2, 200);
    gameSystem.addPlayer( "Mogens", 35, 3, 500);
    gameSystem.addPlayer("Anton", 25, 4, 150);

//    gameSystem.printAllGameDetails();
//    gameSystem.printAllPlayerDetails();

    gameSystem.printPlayerByID(3);
    gameSystem.printGameByID(2);

    gameSystem.updatePlayerScore(3, 999);

    gameSystem.printPlayerByID(3);

    gameSystem.findTopScoringPlayer();
}

