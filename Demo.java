public class Demo{
public static void main(String args[]){
Player players[] = {new Player("Laraib"), new Player("Batool")};
Game game = new Game(players);
game.dealInitialCards();
game.showPlayersCards();}}