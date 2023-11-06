package basics.Udemy

import android.os.Build
import androidx.annotation.RequiresApi

//Class
class Player(var name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    //var lives = 3
    //var level = 1
    //var score = 0

    var weapon: Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()
    fun show() {
        /*  println(
              """"
              name: $name
              lives:$lives
              level:$level
              score:$score
              weapon:${weapon.name}
              damage:${weapon.damageInflicted}
          """
          )*/

        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """"
            name: $name
            lives:$lives
            level:$level
            score:$score
            weapon:${weapon}
        """

        /* weapon:${weapon.name}
           damage:${weapon.damageInflicted}*/
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
        // code to saved the inventory goes here
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    //39.overloading functions
    /* @RequiresApi(Build.VERSION_CODES.N)
     fun dropLoot(name: String): Boolean {
         println("$name will be dropped")
         return inventory.removeIf { it.name == name }
         //return true
     }*/

    @RequiresApi(Build.VERSION_CODES.N)
            /* fun dropLoot(name: String): Boolean {
                 for (item in inventory) {
                     if (item.name == name) {
                         inventory.remove(item)
                         return true
                     }
                 }
                 return false
             }*/


    fun dropLoot(name: String): Boolean {
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                return true
            }
        }
        return false
    }

    fun showInventory() {
        var total = 0.0
        println("$name's Inventory")
        /* println(inventory.get(0))
         println("========================================================")*/

        for (item in inventory) {
            println(item)
            total += item.value
        }

        println("=======================================")
        println("Total Score is $total")
        println("=======================================")

    }
}