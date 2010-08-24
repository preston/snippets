#!/usr/bin/env ruby


require 'net/http'
require 'uri'

code = 147583657
res = Net::HTTP.post_form(URI.parse('http://imobcodes.com/add.php'), {'code'=> code})
puts res.body
