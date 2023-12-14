package coffeeshop

class Cart {
    val pickList: MutableList<PickList> = mutableListOf()

    fun addPickList(pick: PickList) {
        pickList.add(pick)
    }

    fun showCart() {
        val sortedList = pickList.sortedBy { it.menuName }
        val result = StringBuilder()

        result.appendLine("번호  |  메뉴명  |  가격  |  수량  |  합계")

        var total = 0
        for ((index, item) in sortedList.withIndex()) {
            val itemTotal = item.menuPrice * item.menuQuantity
            total += itemTotal
            result.appendLine("${index + 1}  |  ${item.menuName}  |  ${item.menuPrice}  |  ${item.menuQuantity}  |  $itemTotal 원")
            result.appendLine(" ".repeat(80)) // 구분선
        }

        result.appendLine(" ".repeat(51) + "합 계 :: $total 원")
        println(result.toString())
    }
}