package coffeeshop

data class PickList (
    val menuName: String,
    val menuPrice: Int,
    var menuQuantity: Int,
    val menuDescription: String,
) {
    val cart: MutableList<PickList> = mutableListOf()
    var totalAmount: Int = 0
    val orderSheet = OrderSheet()
    val userData = UserData()
    val userMoney = userData.getMoney()

    fun addPrice(): Int = menuPrice * menuQuantity // 품목별 값 더하기

    fun totalPrice(): Int { // 품목별 값 잔액 보여주기
        val balance = userMoney - addPrice()
        return balance
    }

    fun pickDisplayInfo() {
        println(" ---------------------------------------------------------------------------------------------------")
        println("선택 메뉴 :: ${menuName}  |  ${menuPrice}원  |  ${menuQuantity}개  |  가격 합계: ${addPrice()}")
        println("보유 금액 :: ${userMoney} 원  |  잔액: ${totalPrice()}")
        println(" ---------------------------------------------------------------------------------------------------")
    }
}
