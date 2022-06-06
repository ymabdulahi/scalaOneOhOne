package ScalaOneOne

import ScalaOneOne.Classes.Boat

object Classes extends App {
  class Boat {
    val length: Int = 100
    val width: Int = 30
    val speed: Int = 200
  }

  // more practice needed for this
  //     def isFasterThan(anotherBoat: Boat): Boolean {
  //      if(anotherBoat.speed > boat.speed){
  //     false
  //     }
  //    }
}

class SpeedBoat extends Boat {
  override val width = 40
  val engineSpeed: Int = 2
  val fuelType: String = "Petrol"
}

class FishingBoat extends Boat {
  override val width: Int = 25
  val hasRods: Boolean = true
  val fueltype: Boolean = true
}

