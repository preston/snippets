require 'lib/star'

# We need to make our star drawable!
class DrawableStar < Star
  
  def draw
    $app.push_matrix
    $app.translate(@x, @y, @z)
    $app.box(8)
    # $app.sphere(10)
    $app.pop_matrix
  end
  
end
