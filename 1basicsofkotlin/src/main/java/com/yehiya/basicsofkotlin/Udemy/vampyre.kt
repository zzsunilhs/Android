package basics.Udemy

open class vampyre(name: String) : Enemy(name, 20, 3) {
    //open class vampyre(name: String, hitPoints: Int = 20) : Enemy(name, hitPoints, 3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

}