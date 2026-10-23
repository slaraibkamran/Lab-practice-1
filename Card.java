public class Card{ 
private Suit suit;
private Rank rank;

Card(Suit suit, Rank rank){
this.suit = suit;
this.rank = rank;
}

public Suit getSuit(){
return this.suit;}

public Rank getRank(){
return this.rank;}

public void display(){
System.out.println(this.rank + " of " + this.suit);}}