# Copyright © 2009 Preston Lee. All rights reserved.

require 'lib/drawable_star'


class StarfieldSimulator < Processing::App

  load_library :opengl

  NUM_STARS = 150;
  CAMERA_SPEED = 20 # Pixels per wall second.
  CAMERA_ROTATE_SPEED = 0.08 # Radians per wall second.
  FRAME_RATE = 30 # Target frame per second.

  attr_accessor :stars

  def setup
    frame_rate FRAME_RATE
    library_loaded?(:opengl) ? render_mode(OPENGL) : render_mode(P3D)
    @stars = []
    for n in 0..NUM_STARS do
      @stars << DrawableStar.new(1.0 / FRAME_RATE)
    end
  end


  def draw
    background 0 # Paint the entire screen solid black.
    fill(255)
    sphere(100) # Draw the sun.
    # text_font load_font("Univers66.vlw.gz"), 1.0
    # text("Moving starfield demo aoenu hreouh rcohurcoeuh arochuoaentuhoe u.", 0, 0, 0)

    @stars.each do |s|
      push_matrix
      s.draw
      pop_matrix
    end
    
  end
  
end

StarfieldSimulator.new :width => 1000, :height => 800, :title => "Starfield simulation."


