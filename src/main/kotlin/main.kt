var purchaseSum = 10001

var regularCustomer = true

fun main() {

    println("Сумма покупок с учётом сех скидок: ${sumAfterDiscount()} ")
}

fun discountAmount(): Double {
    if (purchaseSum >= 0 && purchaseSum <= 1000) {
        return 0.00
    } else if (purchaseSum >= 1001 && purchaseSum <= 10000) {
        return 100.00
    } else {
        return purchaseSum * 0.05
    }
}

fun sumAfterDiscount(): Double {
    if (regularCustomer) {
        var purchaseDiscount = (purchaseSum - discountAmount())
        return purchaseDiscount - (purchaseDiscount * 0.01)
    } else {
        return purchaseSum - discountAmount()
    }
}