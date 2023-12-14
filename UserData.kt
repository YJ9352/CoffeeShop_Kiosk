package coffeeshop

import kotlin.random.Random

class UserData {
    private var genMoney: Int? = null

    // 고객 잔액 랜덤설정
    fun getMoney(): Int {
//        val amountList = List(1) { Random.nextInt(20000, 100000) }
//        return amountList.firstOrNull()
        if (genMoney == null) {
            genMoney = Random.nextInt(20000, 100000)
        }
        return genMoney ?: throw NoSuchElementException("값이 비어있습니다.")
    }
}