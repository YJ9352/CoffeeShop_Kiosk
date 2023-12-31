package coffeeshop.menu

import coffeeshop.*
import kotlin.system.exitProcess

class Coffee: AbstractMenu() {
    override fun order() {
        val cart = Cart() // 카트
        val menuData = MenuData() // 메뉴 출력
        val pickList = arrayListOf<PickList>()

        while (true) {
            println("어서오세요! 고객님.  |  현재 주문 대기 수는 [ 0 ] 명 입니다.")
            println(" ---------------------------------------------------------------------------------------------------")
            println("[ Coffee Menu ]  [Price]  [Menu description]")
            println(" ---------------------------------------------------------------------------------------------------")
            menuData.coffeeList.forEachIndexed { index, pickList ->
                println("${index + 1}. ${pickList.menuName.padEnd(12)} ${pickList.menuPrice}  ${pickList.menuDescription}")
            }
            println(" ---------------------------------------------------------------------------------------------------")
            println(":: MENU ::                                                 8. 메인으로  |  9. 주문조회  |  0. 종료  ")
            println(" ---------------------------------------------------------------------------------------------------")


            val cPick = readln() // 메뉴 고르기

            if (!cPick.isNumeric()) { // 숫자 외 입력시 오류처리
                println(" ---------------------------------------------------------------------------------------------------")
                println("                                  메뉴 입력은 숫자만 해주세요.")
                println(" ---------------------------------------------------------------------------------------------------")
                continue
            }

            when (cPick.toInt()) {
                1 -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println(" :: 선택하신 메뉴는 ${menuData.coffeeList[0].menuName}, ${menuData.coffeeList[0].menuPrice} 원 입니다.")
                    println(" :: 구입하실 갯수를 입력해 주세요.")
                    println(" ---------------------------------------------------------------------------------------------------")
                    val cPick = readln() // 갯수 선택
                    if (!cPick.isNumeric()) { // 숫자 외 입력시 오류처리
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                  메뉴 입력은 숫자만 해주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        continue
                    }

                    // 선택한 품목, 값, 합계, 잔액 표시
                    if (cPick.toInt() >= 1) {
                        val price = menuData.coffeeList[0].copy(menuQuantity = cPick.toInt())
                        cart.addPickList(price) // 나중에 값 목록으로 보여주려고 더한것
                        price.pickDisplayInfo() // 담은 물건과 가격, 갯수 보여줌

                        Thread.sleep(1000) // 너무 빨리 넘어가서 대기시간
                    } else {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                   1보다 적은 갯수는 선택할 수 없습니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        return
                    }
                }

                2 -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println(" :: 선택하신 메뉴는 ${menuData.coffeeList[1].menuName}, ${menuData.coffeeList[1].menuPrice} 원 입니다.")
                    println(" :: 구입하실 갯수를 입력해 주세요.")
                    println(" ---------------------------------------------------------------------------------------------------")

                    val cPick = readln() // 갯수 선택
                    if (!cPick.isNumeric()) {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                  메뉴 입력은 숫자만 해주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        continue
                    }

                    // 선택한 품목, 값, 합계, 잔액 표시
                    if (cPick.toInt() >= 1) {
                        val price = menuData.coffeeList[1].copy(menuQuantity = cPick.toInt())
                        cart.addPickList(price)
                        price.pickDisplayInfo()

                        Thread.sleep(1000)
                    } else {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                   1보다 적은 갯수는 선택할 수 없습니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        return
                    }
                }

                3 -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println(" :: 선택하신 메뉴는 ${menuData.coffeeList[2].menuName}, ${menuData.coffeeList[2].menuPrice} 원 입니다.")
                    println(" :: 구입하실 갯수를 입력해 주세요.")
                    println(" ---------------------------------------------------------------------------------------------------")

                    val cPick = readln() // 갯수 선택
                    if (!cPick.isNumeric()) {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                  메뉴 입력은 숫자만 해주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        continue
                    }

                    // 선택한 품목, 값, 합계, 잔액 표시
                    if (cPick.toInt() >= 1) {
                        val price = menuData.coffeeList[2].copy(menuQuantity = cPick.toInt())
                        cart.addPickList(price)
                        price.pickDisplayInfo()

                        Thread.sleep(1000)
                    } else {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                   1보다 적은 갯수는 선택할 수 없습니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        return
                    }
                }

                4 -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println(" :: 선택하신 메뉴는 ${menuData.coffeeList[3].menuName}, ${menuData.coffeeList[3].menuPrice} 원 입니다.")
                    println(" :: 구입하실 갯수를 입력해 주세요.")
                    println(" ---------------------------------------------------------------------------------------------------")

                    val cPick = readln() // 갯수 선택
                    if (!cPick.isNumeric()) {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                  메뉴 입력은 숫자만 해주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        continue
                    }

                    // 선택한 품목, 값, 합계, 잔액 표시
                    if (cPick.toInt() >= 1) {
                        val price = menuData.coffeeList[3].copy(menuQuantity = cPick.toInt())
                        cart.addPickList(price)
                        price.pickDisplayInfo()

                        Thread.sleep(1000)
                    } else {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                   1보다 적은 갯수는 선택할 수 없습니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        return
                    }
                }

                5 -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println(" :: 선택하신 메뉴는 ${menuData.coffeeList[4].menuName}, ${menuData.coffeeList[4].menuPrice} 원 입니다.")
                    println(" :: 구입하실 갯수를 입력해 주세요.")
                    println(" ---------------------------------------------------------------------------------------------------")

                    val cPick = readln() // 갯수 선택
                    if (!cPick.isNumeric()) {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                  메뉴 입력은 숫자만 해주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        continue
                    }

                    // 선택한 품목, 값, 합계, 잔액 표시
                    if (cPick.toInt() >= 1) {
                        val price = menuData.coffeeList[4].copy(menuQuantity = cPick.toInt())
                        cart.addPickList(price)
                        price.pickDisplayInfo()

                        Thread.sleep(1000)
                    } else {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                   1보다 적은 갯수는 선택할 수 없습니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        return
                    }
                }

                8 -> main()
                9 -> cart.showCart()
                0 -> exitProcess(0)

                else -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println("                                       잘못된 입력입니다.")
                    println(" ---------------------------------------------------------------------------------------------------")
                    return
                }
            }
        }
    }
}