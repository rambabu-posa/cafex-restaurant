package com.cafex.dev.exercise

import com.cafex.dev.exercise.model.{CafeXBill, CafeXCurrentMenu}
import org.scalatest.WordSpec
import com.cafex.dev.exercise.util.CafeXUtil._

class CafeXBillSpec extends WordSpec with CafeXCurrentMenu {

  "Single Item - Generate Bill" when {
    "price check" should {
      "Cola price must be £0.50" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(Cola))
        assert(bill.billAmount == 0.50)
      }

      "Coffee price must be £1.00" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(Coffee))
        assert(bill.billAmount == 1.00)
      }

      "Cheese Sandwich price must be £2.00" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(CheeseSandwich))
        assert(bill.billAmount == 2.00)
      }

      "Steak Sandwich price must be £4.50" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(SteakSandwich))
        assert(bill.billAmount == 4.50)
      }
    }
  }

  "Multiple Items - Generate Bill" when {
    "check bill" should {
      "Cola and Coffee price must be £1.50" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(Cola, Coffee))
        assert(bill.billAmount == 1.50)
      }

      "Cheese and Steak Sandwiches price must be £6.50" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(CheeseSandwich, SteakSandwich))
        assert(bill.billAmount == 6.50)
      }

      "Cola, Coffee, Cheese and Steak Sandwiches price must be £8.00" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(Cola, Coffee, CheeseSandwich, SteakSandwich))
        assert(bill.billAmount == 8.00)
      }

      "Cola, Coffee and Cheese Sandwiche price must be £3.00" in {
        val bill: CafeXBill = CafeXBill(cafeXMenu, List(Cola, Coffee, CheeseSandwich))
        assert(bill.billAmount == 3.50)
      }
    }
  }

}
