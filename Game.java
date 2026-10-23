public class Game{
private Deck deck;
private Player players[];

Game(Player players[]){
this.players = players;
this.deck = new Deck();
deck.shuffle();
}

public void dealInitialCards(){
for(int i = 0; i < 5; i++){
for(Player p : players){
p.recieveCard(deck.dealCard());}
}
}

public void showPlayersCards(){
for(Player p : players){
p.showHand();}

}
}