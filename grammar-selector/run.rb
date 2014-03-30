        example = if ARGV[0].nil?
                    File.open("example.txt", "w") if not File.exist?("example.txt")
                    "example.txt"
                  else
                    ARGV[0].to_s
                  end
        puts "Running Selector parser ..."
        Dir.mkdir("src") if not Dir.exists? "src"
        Dir.chdir("src")
        system('call antlr4 "../Selector.g4" -visitor')
        system('call grun Selector init -gui ..\\' + example)
