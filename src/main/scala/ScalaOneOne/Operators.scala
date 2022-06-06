package ScalaOneOne

object Operators extends App {
  val a: Boolean = (4 + 3 * 50) < 300
  println(a)

  val b: Boolean = (96 / 12) >= 8
  println(b)

  val c: Boolean = "hamster" < "hippo"
  println(c)

  val d: Boolean = (8 % 2) == 0
  println(d)

  val e: Boolean = (150 / 8) < 20 && 54 < 20 && (54 / 4) < 14
  println(e)
}
