
class Point(var x: Int, var y: Int) {
  
  def +(that: Point) = (this.x + that.x, this.y + that.y)
  
  def move(dx: Int, dy: Int): Unit = {
    this.x = this.x + dx
    this.y = this.y + dy
    println(this)
  }
  
  def invert() {
    var z = this.x;
    this.x=this.y
    this.y=z
    println(this)
  }
  
   def distance(): Int = {
     if(this.x>=this.y){
       return this.x-this.y
     }else{
       return this.y-this.x
     }
    
  }
   
   

  override def toString: String = s"($x, $y)"
}

object q1 extends App{
val point1 = new Point(2, 3)
val point2 = new Point(2, 7)
var z =point1+point2;
println(z)
point1.move(1, 2)
println(point2.distance())
point1.invert()


}