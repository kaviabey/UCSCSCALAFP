
object point extends App{
case class Point(x:Double,y:Double)
{
  private var  _x = x;
  private var _y = y;
  def add(point:Point):Point = return Point((this._x+point._x),(this._y+point._y));
  
  def move(dx:Double,dy:Double):Unit =  {
  
    this._x =  this._x + dx;
    this._y =  this._y + dy;
    println("The current position is at "+"(" +this._x+","+this._y+")");
    
  }
  def distance(u:Point):Unit = {
    
     val t =  Math.sqrt((this._x-u._x)*(this._x-u._x) + (this._y-u._y)*(this._y-u._y))
     println("The distance between the "+"(" +this._x+","+this._y+")"+" and "+"the "+"(" +u._x+","+u._y+") points"+" is "+t);
  }
  
  def  invert():Unit  = 
  { val tmp = this._x;
    this._x = this._y;
    this._y = tmp;
    println("The current position is at "+"(" +this._x+","+this._y+")")

  } 
  
 
  
 }
   val p = Point(3,4);
  p.move(-32,445)
   val y = Point(-29,445);
   println(p.distance(y))
  p.invert();
  
}
