package com.cafex.dev.exercise.model

case class CafeXBill (menu:CafeXMenu, orderedItems:List[String]) {

  def billAmount:BigDecimal = orderedItems.flatMap(menu.price).sum

}
