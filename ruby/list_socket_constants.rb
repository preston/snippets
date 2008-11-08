#!/usr/bin/env ruby

require 'socket'
# Socket::SO_REUSEADDR
Socket.constants.sort.each do |c| puts c end
