package ru.netology
fun main() {
    val itemPries = 9_5_06
    val itemCount = 2
    val discountFivePercent = 5.0
    val discountOnePercent = 1.0
    val discount = 100_00
    val userLevel = "musiclov"

    val purchAmountZero = 0
    val purchAmountOneThousand = 1000_00
    val purchAmountOneThousandOne = 1001_00
    val purchAmountTenThousand = 10_000_00
    val purchAmountTenThousandOne = 10_001_00

    val totalPrice = itemPries * itemCount

    if(totalPrice >= purchAmountTenThousandOne ){

        val result = (totalPrice - (totalPrice/100) * discountFivePercent)/100

        if(userLevel== "musiclove" ){
            val  resultMusicLove = (result - (result/100) * discountOnePercent)
            val ruble = resultMusicLove.toInt()
            val penny = ((resultMusicLove - ruble)*100).toInt()
            println("Сумма покупки: $ruble рублей $penny копеек")
        }else {
            val ruble = result.toInt()
            val penny = ((result - ruble)*100).toInt()
            println("Сумма покупки: $ruble рублей $penny копеек")
        }
    }else if(totalPrice >= purchAmountOneThousandOne || purchAmountTenThousand <= totalPrice){

        val result = (totalPrice - discount)/100

        if(userLevel== "musiclove" ){
            val  resultMusicLove = (result - (result/100) * discountOnePercent)
            val ruble = resultMusicLove.toInt()
            val penny = ((resultMusicLove - ruble)*100).toInt()
            println("Сумма покупки: $ruble рублей $penny копеек")
        }else {
            val ruble = result.toInt()
            val penny = ((result - ruble)*100).toInt()
            println("Сумма покупки: $ruble рублей $penny копеек")
        }
    }else if(totalPrice >= purchAmountZero || purchAmountOneThousand <= totalPrice){

        if(userLevel== "musiclove" ){
            val  resultMusicLove = (totalPrice - (totalPrice/100) * discountOnePercent)/100
            val ruble = resultMusicLove.toInt()
            val penny = ((resultMusicLove - ruble)*100).toInt()
            println("Сумма покупки: $ruble рублей $penny копеек")
        }else {

            val totalPrice =((itemPries * itemCount).toDouble())/100
            val ruble = totalPrice.toInt()
            val penny = ((totalPrice - ruble)*100).toInt()
            println("Сумма покупки: $ruble рублей $penny копеек")
        }
    }
}