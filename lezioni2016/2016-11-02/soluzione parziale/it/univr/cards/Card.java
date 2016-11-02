package it.univr.cards;

import java.util.Random;

public class Card {
	private int value;
	private int suit;
	private final static Random random = new Random();

	/**
	   * Genera una carta a caso da min (incluso) in su.
	   * 
	   * @param min la carta minima che può essere generata (2-14)
	   */
	  public Card(int min) {
		  this.value = min + random.nextInt(15 - min);
		  this.suit = random.nextInt(4);
	  }

	  public Card() {
		  this(2);
	  }

	  public int getValue() {
		  return value;
	  }

	  public int getSuit() {
		  return suit;
	  }

	  /**
	   * Ritorna una descrizione della carta sotto forma di stringa, del
	   * tipo 10♠ opure J♥.
	   */
	  public String toString() {
		  String v;
		  String s;

		  switch (value) {
		  case 11: v = "J"; break;
		  case 12: v = "Q"; break;
		  case 13: v = "K"; break;
		  case 14: v = "1"; break;
		  default: v = "" + value; break;
		  }

		  switch (suit) {
		  case 0: s = "\u2660"; break;
		  case 1: s = "\u2665"; break;
		  case 2: s = "\u2666"; break;
		  default: s = "\u2663"; break;
		  }
		  
		  return v + s;
	  }

	  /**
	   * Determina se questa carta è uguale ad other.
	   * 
	   * @param other l'altra carta
	   * @return true se e solo se le due carte sono uguali
	   */
	public boolean equals(Card other) {
		return value == other.value && suit == other.suit;
	}
}
