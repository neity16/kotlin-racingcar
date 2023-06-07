package calcurate.strategy

class SubtractStrategy : CalcStrategy {
    override val symbol = Companion.symbol
    override fun calc(prev: Double, next: Double): Double {
        return prev - next
    }
    companion object {
        const val symbol = "-"
    }
}
