package coffeeshop

import coffeeshop.menu.*
import kotlin.system.exitProcess

// 대기번호 부여하고 하나씩 줄이기
// 잔액을 바로 표시하지 말고 따로 받아놨다가 카트에 금액이랑 잔액 표시

class OrderSheet {
    private val priceList: Int = 0
    fun totalMenu(shop: String) {
        val pickList = arrayListOf<PickList>()

        val cart = Cart()
        val coffees = Coffee() // 커피
        val decaf = Decaf() // 디카페인
        val drink = Drink() // 사이드 음료
        val desBakery = DesBakery() // 빵과 디저트

        // 앞에서 누른 번호 여기서 받아 실행
        while (true) {
            when (shop.toInt()) {
                1 -> coffees.coffOrder()
                2 -> decaf.decafOrder()
                3 -> drink.drinkOrder()
                4 -> desBakery.desbakOrder()
                9 -> cart.showCart()
                0 -> exitProcess(0)

                else -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println("                                         잘못된 입력입니다.")
                    println(" ---------------------------------------------------------------------------------------------------")
                    Thread.sleep(1000)
                    break
                }
            }
        }
    }
}