package org.dka.coingame.coins

// used as the state of coin tosses
final case class CoinHistory(coin: Coin, history: List[Coin]) {
  def +(coin: Coin) = this.copy(coin, coin :: history)
}

object CoinHistory {
  def initial(coin: Coin): CoinHistory = CoinHistory(coin, List(coin))
}
