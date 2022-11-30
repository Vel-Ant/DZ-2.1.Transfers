package ru.netology

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите сумму перевода в рублях")

    val commission= 0.0075
    val commissionMinimum = 35
    val count = scanner.nextInt()
    val amount = if (count * commission < 35) (count + commissionMinimum).toInt() else (count + (count * commission)).toInt()

    println("Сумма перевода с комиcсией составит: $amount рублей")
}
/**
 * Решил добавить сканер, думаю так будет интереснее
  */
