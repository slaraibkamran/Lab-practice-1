public class Player{
private String name;
private Card hand[];
private int cardCount = 0;

Player(String name){
this.name = name;
hand = new Card[5];}

public String getName(){
return this.name;}

public boolean recieveCard(Card card){
if(cardCount < hand.length && card != null){
hand[cardCount++] = card;
return true;
}
return false;}

public void showHand(){
System.out.println(this.name + "'s hand: ");
for(int i = 0; i < cardCount; i++){
System.out.print(" ");
hand[i].display();}}}