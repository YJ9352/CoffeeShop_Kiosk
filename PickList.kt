package coffeeshop

data class PickList (
    val menuName: String,
    val menuPrice: Int,
    var menuQuantity: Int,
    val menuDescription: String,
) {
    fun addPrice(): Int = menuPrice * menuQuantity // 품목별 값 더하기

    fun pickDisplayInfo() {
        println(" ---------------------------------------------------------------------------------------------------")
        println("선택 메뉴 :: ${menuName}  |  ${menuPrice}원  |  ${menuQuantity}개  |  가격 합계: ${addPrice()}")
        println(" ---------------------------------------------------------------------------------------------------")
    }
}
