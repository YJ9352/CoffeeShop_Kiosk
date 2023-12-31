package coffeeshop

import java.time.LocalDateTime
import kotlin.system.exitProcess

class Cart {
    var now = LocalDateTime.now()

    companion object { // 이걸 붙이면 안에 든걸 전체에 적용되는거였던듯
        val pickList: MutableList<PickList> = mutableListOf()
    }

    fun addPickList(pick: PickList) {
        pickList.add(pick)
    }

    fun showCart() {
        val sortedList = pickList.sortedBy { it.menuName }
        val result = StringBuilder()
        result.appendLine(" ---------------------------------------------------------------------------------------------------")
        result.appendLine(" :: Shopping Cart :: ")
        result.appendLine(" ---------------------------------------------------------------------------------------------------")
        result.appendLine("[NO.] [Menu]    [Price] [Qty] [Total]")
        result.appendLine(" ---------------------------------------------------------------------------------------------------")

        var total = 0
        for ((index, item) in sortedList.withIndex()) {
            val itemTotal = item.menuPrice * item.menuQuantity
            total += itemTotal
            result.appendLine("${index + 1}.   ${item.menuName.padEnd(6)}    ₩${item.menuPrice}   ${item.menuQuantity}   ₩$itemTotal")
            result.appendLine(" ".repeat(80)) // 구분선
        }
        result.appendLine(" ---------------------------------------------------------------------------------------------------")
        result.appendLine(" ".repeat(51) + "합 계 :: $total 원")
        result.appendLine(" ---------------------------------------------------------------------------------------------------")
        result.appendLine(" :: 고객님이 주문하신 목록은 다음과 같습니다. 결제하시겠습니까? 1. 네 / 2. 아니오")
        result.appendLine(" ---------------------------------------------------------------------------------------------------")
        println(result.toString())

        while (true) {
            try {
                val shoppingPick = readln() // 결제 확인
                when (shoppingPick.toInt()) {
                    1 -> {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println(" :: 결제를 진행합니다. 갖고 계신 금액을 입력해 주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")

                        var payment = readln().toInt() // 결제금액 입력
                        if (payment > total) {
                            println(" ---------------------------------------------------------------------------------------------------")
                            println(" :: 결제가 완료되었습니다. 이용해 주셔서 감사합니다. 잔액은 ${payment - total}입니다.")
                            println(" ---------------------------------------------------------------------------------------------------")
                            println(" :: 현재 시각은 ${now}입니다.")
                            println(" ---------------------------------------------------------------------------------------------------")

                            Thread.sleep(3000) // 3초 대기 후 메인으로

                            exitProcess(0)
                        } else {
                            println(" ---------------------------------------------------------------------------------------------------")
                            println(" :: 결제가 실패하였습니다. 잔액을 확인해주세요.")
                            println(" ---------------------------------------------------------------------------------------------------")
                            exitProcess(0)
                        }
                    }

                    2 -> {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println(" :: 결제가 취소되었습니다. 다시 주문해 주십시오. 감사합니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        exitProcess(0)
                    }

                    else -> {
                        continue
                    }
                }
            } catch (e: NumberFormatException) {
                println(" ---------------------------------------------------------------------------------------------------")
                println(" :: 잘못된 입력입니다. 다시 입력해주세요.")
                println(" ---------------------------------------------------------------------------------------------------")
                continue
            }
        }
    }

    // 시간 관련해서 처리
    fun timeSetting() {
        var now = LocalDateTime.now()
    }
}
