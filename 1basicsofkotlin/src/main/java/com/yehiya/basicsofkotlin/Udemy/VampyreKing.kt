package basics.Udemy

//open class VampyreKing(name: String) : vampyre(name, 140) {
open class VampyreKing(name: String) : vampyre(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun dodges(): Boolean {
        val rand = java.util.Random()
        val chance = rand.nextInt(6)
        if (chance > 3) {
            println("Dracula dodges")
            return true
        }
        return false
    }
}