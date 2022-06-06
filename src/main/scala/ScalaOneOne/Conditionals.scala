package ScalaOneOne

object Conditionals extends App {

  var age: Int = 10

  var rating: String = ""

  if (age>= 18) {
    rating = "18"
  } else if (age >= 15) {
    rating = "15"
  } else if (age >= 12) {
    rating = "12A"
  } else if (age < 12 ) {
    rating = "PG"
  }
}
