package basics

import android.os.Build
import androidx.annotation.RequiresApi
import basics.Udemy.*

class basics {
    fun basics() {
        println("Hello World")
        println("My First kotlin program")

        /* variables and Types */
        var name: String
        name = "Yehiya Mohideen"
        println(name)

        var daySalary: Int = 300
        var monthlySalary: Int = daySalary * 31

        println(daySalary)
        println(monthlySalary)

        println() // next line

        val apples: Int = 6
        val oranges: Int = 5
        var fruit = apples - oranges
        println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")


        println(apples / 4)

        println()
        val weeks: Int = 234
        val years: Double = weeks / 52.0
        println(years)

        /* String concatenation and interpolation */
        //concatenation
        println("130 weeks in years is :" + years)
        println("My name is :" + name)
        //
        //interpolation
        println("$weeks weeks is $years years")
        println("My name  is : $name")
        println("I can print \$name")
        println("A quarter of the apples is ${apples / 4}")
        println("$name's daily salary is $$daySalary ")
        println("$name's monthly that comes to $$monthlySalary ")


        /* val and var more on declarations */
        //var can change
        //val cannot change

    }

    fun Variable() {

        val Name1 = "Zumi" // val it's a immutable
        var Name2 = "Solutions"//var is a mutable
        val Since: Int = 2013 // Integer Data assigning
        var City: String = "Banglore" //String Data assigning

        println("Company Name = $Name1 $Name2\n" + "$Since\n$City")


    }

    fun Arrays() {
        val fruits = arrayOf("Apple", "Mango", "Banana", "Orange")

        println(fruits.get(0))
        println(fruits.get(3))

        // Set the value at 3rd index
        fruits.set(3, "Guava")
        println(fruits.get(3))

        val Vegetable = arrayOf<String>("Carrot", "Beetroot", "Beans", "LadysFinger")

        println(Vegetable[0])
        println(Vegetable[3])

        val num = intArrayOf(1, 2, 3, 4)

        println(num[0])

    }

    fun ForLoop() {

        val num = intArrayOf(1, 2, 3, 4)
        for (i in num) {

            print(i)
        }

    }

    fun ForLoopRanges() {

        // rangeto
        for (num in 1.rangeTo(4)) {
            print(num)
        }
        println("rangeto loop finished")

        // condition based
        for (num in 1..4) {
            print(num)
        }
        println("condition based loop finished")

        // reversed method
        for (num in 4 downTo 1) {
            print(num)
        }
        println(" reversed method loop finished")

        //Looping steps
        for (num in 1..10 step 2) {
            print(num)
        }
        println("Looping steps loop finished")

        // Character range
        for (ch in 'a'..'z') {
            print(ch)
        }
        println("Character range loop finished")

        // reversed method
        for (num in (1..5).reversed()) {
            print(num)
        }
        println("reversed method loop finished")

        //until method
        for (num in 1 until 5) {
            print(num)
        }
        println("until method loop is finished")

    }

    fun WhileLoopandDoWhile() {
        var i = 0
        while (i < 10) {
            print(i)
            i++
        }
        println(" While loop is fininshed")

        var n = 5;
        do {
            print(n)
            n--
        } while (n > 0)
        println(" Do While loop is fininshed")
    }


    fun Whenexpression() {
        print("Please enter the number from 1 to 5:")
        var games: Int = readLine()?.let { Integer.valueOf(it) }!!
        var gamesProvided = when (games) {
            1 -> "Football"
            2 -> "Cricket"
            3 -> "Volleyball"
            4 -> "Tennis"
            5 -> "Basketball"
            else -> "invalid number"
        }
        println("Games = $gamesProvided")
    }

    fun Collections() {
        //List

        var CompanyName = listOf<String>("Zumi", "Bosch", "Alpha", "Solus", "Microsoft")
        println("Company Names = $CompanyName")

        //Set

        var Cars = setOf<String>("Benz", "Bmw", "Audi", "Ferrari", "mahindra", "Rollceroyes")
        println("Cars =  $Cars")

        //Map

        var Bikes = mapOf("NS200" to 1, "Royal Enfield" to 2, "Duke390" to 3, "Splendor" to 4)
        println(Bikes)

        //Hash Map

        val hashMap: HashMap<Int, String> = HashMap<Int, String>() //define empty hashmap
        hashMap.put(1, "Ajay")
        hashMap.put(3, "Vijay")
        hashMap.put(4, "Praveen")
        hashMap.put(2, "Ajay")
        println(".....traversing hashmap.......")
        for (key in hashMap.keys) {
            println("Element at key $key = ${hashMap[key]}")
        }

        //hashSet
        var hashSet = HashSet<Int>(6)
        hashSet.add(2)
        hashSet.add(13)
        hashSet.add(6)
        hashSet.add(5)
        hashSet.add(2)
        hashSet.add(8)
        println("......traversing hashSet......")
        for (element in hashSet) {
            println(element)
        }

        //mutableSet
        val intmutableSet = mutableSetOf<Int>(2, 6, 4, 29, 4, 5)
        val anymutableSet: Set<Any> = setOf(2, 6, 4, 29, 4, 5, "Ajay", "Ashu", "Ajay")
        println("....intmutableSet....")
        for (element in intmutableSet) {
            println(element)
        }
        println("....anymutableSet......")
        for (element in anymutableSet) {
            println(element)
        }

    }


    fun Conditionalstatements() {

        for (sum in 1.rangeTo(5)) {
            if (sum == 1) {
                print("Success1\n")
            } else if (sum == 2) {
                print("Success2\n")
            } else {
                print("Success\n")
            }
        }
    }

    fun Exceptionhandling() {
        try {
            val data = 20 / 0
        } catch (e: Exception) {
            print("e: $e")
        } finally {
            print("finally")
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun player() {
        val tim = Player("Tim")
        tim.show()

        val louise = Player("Louise")
        louise.show()

        val gr8 = Player("gr8", 4, 8)
        val one2watch = Player("Ace", 2, 5, 1000)
        gr8.show()
        one2watch.show()
        println(one2watch.weapon.name.toUpperCase())
        println(one2watch.weapon.damageInflicted)

        val axe = Weapon("Axe", 12)
        gr8.weapon = axe
        println(gr8.weapon.name)
        println(axe.name)

        axe.damageInflicted = 24
        println(axe.damageInflicted)
        println(gr8.weapon.damageInflicted)

        tim.weapon = Weapon("Sword", 18)
        // println(tim.weapon.name)
        tim.show()

        louise.weapon = tim.weapon
        louise.show()

        tim.weapon = Weapon("Spear", 19)
        //println(tim.weapon.name)
        tim.show()


        //34 & 35 List

        val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
        //tim.inventory.add(redPotion)
        tim.getLoot(redPotion)
        val chestArmor = Loot("+3 Chest Armor", LootType.POTION, 7.50)
//        tim.inventory.add(chestArmor)
        tim.getLoot(chestArmor)
        tim.showInventory()

//        tim.inventory.add(Loot("Ring of Protection +2", LootType.RING, 40.25))
//        tim.inventory.add(Loot("Invisiblity Potion", LootType.POTION, 35.95))

        tim.getLoot((Loot("Ring of Protection +2", LootType.RING, 40.25)))
        tim.getLoot((Loot("Invisiblity Potion", LootType.POTION, 35.95)))
        tim.showInventory()

        if (tim.dropLoot(redPotion)) {
            tim.showInventory()
        } else {
            println("You Don't have a ${redPotion.name}")
        }

        val bluePotion = Loot("Blue Potion", LootType.POTION, 6.0)
        if (tim.dropLoot(bluePotion)) {
            tim.showInventory()
        } else {
            println("You Don't have a ${bluePotion.name}")
        }

        if (tim.dropLoot("Invisiblity Potion")) {
            tim.showInventory()
        } else {
            println("You Don't have an Invisiblity Potion")
        }

        println("This is a test")

//        tim.dropLoot("Invisiblity Potion")
//        tim.showInventory()

        //println(tim.toString())


    }

    fun forloop() {
        // for (i in 0..10) {
        //for (i in 0 until 10) {
        //for (i in 10 downTo 0) {
        for (i in 10 downTo 0 step 3) {
            println("$i squared is ${i * i}")
        }

        for (value in 3..100 step 3) {
            if (value % 5 == 0) {
                println(value)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun Inheritance() {
        /*  val enemy = Enemy("test enemy", 10, 3)
          println(enemy)

          enemy.takeDamage(4)
          println(enemy)

          enemy.takeDamage(11)
          println(enemy)*/

        //val uglyTroll = Troll("ugly Troll"27,1)
        /* val uglyTroll = Troll("ugly Troll")
         println(uglyTroll)
         uglyTroll.takeDamage(30)
         println(uglyTroll)

         val vlad = vampyre("Vlad")
         println(vlad)
         vlad.takeDamage(8)
         println(vlad)

         val dracula = VampyreKing("Dracula")
         println(dracula)
         dracula.takeDamage(12)*/

        //44. while loops

        /* while (dracula.lives > 0) {
             if (dracula.dodges()) {
                 continue
             }
             if (dracula.runAway()) {
                 println("Dracula Ran Away !!")
                 break
             } else {
                 dracula.takeDamage(12)
             }
         }*/


        //45. For Loop
        val conan = Player("Conan")
        conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
        conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
        conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
        conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
        //conan.getLoot(Loot("Cursed Sheild", LootType.ARMOR, -8.0))
        conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
        conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
        conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
        conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
        conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
        conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
        conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
        conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
        conan.showInventory()

        conan.dropLoot("Gold Ring")
        conan.showInventory()

        conan.dropLoot("Silver Ring")
        conan.showInventory()

        val dropped = conan.dropLoot("Something Not Present")
        println(dropped)

        println(conan.dropLoot("Something else"))

        if (conan.dropLoot("A bit of junk")) {
            println("junk dropped")
        } else {
            println("You don't have any junk")
        }

        /*   for (i in 1..10) {
           val dracula = VampyreKing("Dracula")
           while (dracula.lives > 0) {
               if (dracula.dodges()) {
                   continue
               }
               if (dracula.runAway()) {
                   println("Dracula Ran Away !!")
                   break
               } else {
                   dracula.takeDamage(80)
               }
           }
           println("=====================================================")
       }*/

        //46.do while

        /*val dracula = VampyreKing("Dracula")
        println(dracula)
        dracula.lives = 0
        do {
            if (dracula.dodges()) {
                dracula.lives += 1
                continue
            }
            if (dracula.runAway()) {
                println("Dracula Ran Away !!")
                break
            } else {
                dracula.takeDamage(80)
            }
        } while (dracula.lives > 0)
        println("=====================================================")*/
    }
}