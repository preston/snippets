# Copyright © 2009 Preston Lee. All rights reserved.

require 'lib/star'

NUM_STARS = 100
SECONDS = 10.0

puts "Creating #{NUM_STARS} stars."
stars = []
(1..NUM_STARS).each do |n|
  s = Star.new(0.1)
  stars << s
end

puts "Letting stars run for #{SECONDS} seconds."
sleep SECONDS

puts "Stopping simulation."
stars.each do |s|
  puts "Thread died! A bug must be present. :(" if !s.thread.alive?
  s.deactivate
end

puts "Waiting for simulation to cleanly finish."
stars.each do |s| s.join end

puts 'Awesome sauce.'
