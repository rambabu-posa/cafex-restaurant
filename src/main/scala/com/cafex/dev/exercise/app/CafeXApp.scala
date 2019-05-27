package com.cafex.dev.exercise.app

import com.cafex.dev.exercise.model.{CafeXBill, CafeXCurrentMenu}
import com.cafex.dev.exercise.util.CafeXUtil.{CheeseSandwich, Coffee, Cola}

object CafeXApp extends App with CafeXCurrentMenu {

  val orderedItems = List(Cola, Coffee, CheeseSandwich)
  val bill: CafeXBill = CafeXBill(cafeXMenu, orderedItems)
  println(s"$orderedItems returns ${bill.billAmount}")

}
