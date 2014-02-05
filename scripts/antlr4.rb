switches = []

ARGV.each do |arg|
  switches << arg if arg.start_with? "-" 
end

if switches.include? "-init"
  if not ARGV[1].nil? 
    File.open("run.rb", "w") { |file|
      puts "Initialize grammar ..."
      code = <<-CODE
        example = if ARGV[0].nil?
                    File.open("example.txt", "w") if not File.exist?("example.txt")
                    "example.txt"
                  else
                    ARGV[0].to_s
                  end
        puts "Running #{ARGV[1]} parser ..."
        Dir.mkdir("src") if not Dir.exists? "src"
        Dir.chdir("src")
        system('call antlr4 "../#{ARGV[1]}.g4" -visitor')
        system('call grun #{ARGV[1]} init -gui ..\\\\' + example)
      CODE
      file.puts(code)
      puts "Initialization is completed." 
    }
  else
    puts "Use this: antlr4 -init <grammar name> <example files - optional>"
  end
elsif switches.include? "-help"
  puts "Usage: 'antlr4 <switches>' or"
  puts "       'antlr4 <grammar name>'"
  puts "Switches: "
  puts "    -init          Initialize ANTLR grammar"
  puts "    -help          Show help"
else
  system("java -cp e:\Development\Libraries\ANTLR\antlr-4.1-complete.jar;%CLASSPATH% org.antlr.v4.Tool #{ARGV[0]} -visitor")
  system("javac *.java") 
end