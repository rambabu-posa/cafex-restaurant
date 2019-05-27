package com.cafex.dev.exercise.model

/**
  * CafeX Restaurant Menu
  * @param items
  */
case class CafeXMenu(items: List[CafeXMenuItem]) {

  // Map from Item name to Item
  val itemsMap:Map[String, CafeXMenuItem] =
    items.foldLeft(Map[String, CafeXMenuItem]())((default, menuItem) => default + (menuItem.name -> menuItem))

  // To get item price by item name
  def price(item:String): Option[BigDecimal] = itemsMap.get(item).map(_.price)
}
