package basics.Udemy

//40. Inheritance

//base class
open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    open fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives -= 1
            //lives = lives - 1
            if (lives > 0) {
                println("$name lost a life")
            } else {
                println("No lives left,$name is dead")
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, HitPoints: $hitPoints, Lives: $lives"
    }
}

// lives = lives + 8  lives += 8
// lives = lives - damage  lives -= damage
// lives = lives * 10  lives *= 8
// lives = lives / 3  lives /= 3
// lives = lives % 2  lives %= 2

