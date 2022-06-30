var purchaseSum = 1000

var regularCustomer  = true

fun main() {

    if (regularCustomer) {
        var purchaseDiscount = (purchaseSum - discountAmount())
        var afterDiscount = purchaseDiscount - (purchaseDiscount * 0.01)
        println("Сумма покупки с учётом скидок: $afterDiscount")
    } else {
        println("Сумма покупки: $purchaseSum")
    }
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