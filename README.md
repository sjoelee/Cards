Creating a deck to hopefully create a game of Blackjack.

The idea here is to create:
 - Card class that captures the "suit" and value of the card
 - Suit class that contains a list/array of cards of the same suit
 - Deck class that contains a list/array of suits

Issue #1:
---------
 - cannot remove an element from the top of the list because AbstractList 
   (which is what Arrays.asList uses) creates an unmodifiable collection. 
 - perhaps what should be done from the beginning is to use a List. And since
   List is a collection, we can use the shuffle method. 
