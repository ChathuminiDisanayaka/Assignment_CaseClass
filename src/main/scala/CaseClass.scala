object CaseClass extends App {
  val p1 = Point(2,3)
  val p2 = Point(5,6)
  println("Point 01: "+p1)
  println("Point 02: "+p2)
  val p3 = p1.move(2,3)
  println("Point 03 after moving method: "+p3)
  val p4 = p1+p2
  println("Addition of two points p1 and p2: "+ p4)
  val dis =p1.distance(p2)
  println("Distance between two points p1 and p2: "+ dis)
  p1.invert()
  p2.invert()
}

case class Point(a:Int,b:Int){
  def x:Int = a
  def y:Int = b

  def move (dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)

  def +(that:Point) = Point(this.x + that.x, this.y + that.y)

  def distance(a:Point) : Double = {
    var xDist:Int = this.x - a.x
    var yDist:Int = this.y - a.y
    var dist: Int = xDist*xDist + yDist*yDist
    scala.math.sqrt(dist)
  }
  def invert() :Unit= {
    println("Invert x and y point:"+Point(y,x))
  }
}

