import processing.core.PApplet

class ProcessingTest extends PApplet {
  
  override def settings() {
    size(400, 400)
  }

  override def setup() {
    background(color(50, 50, 50))
    noStroke()
  }
  
  override def draw() {
    fill(color(255, 100, 100))
    ellipse(200, 200, 100, 50)
  }
}

object ProcessingTest extends App {
  PApplet.main("ProcessingTest")
}
