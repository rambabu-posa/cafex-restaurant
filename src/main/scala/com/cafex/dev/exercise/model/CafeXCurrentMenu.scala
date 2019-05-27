package com.cafex.dev.exercise.model

import com.cafex.dev.exercise.util.CafeXUtil._

trait CafeXCurrentMenu {

    val cafexMenuItems= List(CafeXMenuItem(Cola, 0.50),
      CafeXMenuItem(Coffee, 1.00),
      CafeXMenuItem(CheeseSandwich, 2.00),
      CafeXMenuItem(SteakSandwich, 4.50)
    )

    val cafeXMenu: CafeXMenu = CafeXMenu(cafexMenuItems)

}
