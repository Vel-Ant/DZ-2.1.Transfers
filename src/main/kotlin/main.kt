package ru.netology

fun main() {
    String
    val commission= 0.0075
    val commissionMinimum = 35
    val count = 1_000
    val amount = if (count * commission < 35) (count + commissionMinimum).toInt() else (count + (count * commission)).toInt()

    println("Сумма перевода с комиcсией составит: $amount рублей")
}