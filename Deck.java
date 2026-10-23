import java.util.Random;
public class Deck{
private Card cards[];
private int nextCard;

Deck(){
cards = new Card[52];

int index = 0;

  for (Suit s : Suit.values()){
    for (Rank r : Rank.values()){
cards[index++] = new Card(s, r);}}
nextCard = 0;}


public void shuffle(){
Random r = new Random();
for (int i = 0; i < cards.length; i++){
int j = r.nextInt(cards.length);
Card temp = cards[i];
cards[i] = cards[j];
cards[j] = temp;}


nextCard = 0;}

public Card dealCard(){
if(nextCard < cards.length){
return cards[nextCard++];
}
return null;
}

public int getRemainingCards(){
return cards.length - nextCard;}
}