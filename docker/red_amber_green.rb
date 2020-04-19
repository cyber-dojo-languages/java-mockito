
lambda { |stdout,stderr,status|
output = stdout + stderr
containers_pattern = Regexp.new('^\[\s+(\d+) containers failed\s+\]')
if match = containers_pattern.match(output)
  if match[1] != '0'
    return :amber
  end
end
tests_pattern = Regexp.new('^\[\s+(\d+) tests failed\s+\]')
if match = tests_pattern.match(output)
  if match[1] == '0'
    return :green
  else
    return :red
  end
else
  return :amber
end
}
