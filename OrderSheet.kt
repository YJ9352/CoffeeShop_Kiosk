package coffeeshop

import coffeeshop.menu.*
import kotlin.system.exitProcess

// 카트에 물건 담을떄마다 목록이 갱신되고 일정 시간마다 재출력, 결제 후 0 되기
// 특정 시간대에는 접속 x 되게 처리
// 가능하다면 날짜? 를 지정해서 특정 카테고리 품목을 할인해보기

class OrderSheet {
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
                1 -> coffees.order()
                2 -> decaf.order()
                3 -> drink.order()
                4 -> desBakery.order()
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