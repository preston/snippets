
require 'ruby-processing'
 
class Primitive3d < Processing::App
 
  def setup
 
    size(640, 360, P3D); 
    background(0);
    lights
 
    no_stroke
    push_matrix
    translate(130, height/2, 0)
    rotate_y(1.25)
    rotate_x(-0.4)
    box(10)
    pop_matrix
 
    no_fill
    stroke(255)
    push_matrix
    translate(500, height*0.35, -200)
    sphere(280)
    pop_matrix
  end

  def draw
  end

 
end
 
Primitive3d.new :title => "Primitive3D", :width => 640, :height => 360